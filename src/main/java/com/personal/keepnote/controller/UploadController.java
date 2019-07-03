package com.personal.keepnote.controller;

import com.personal.keepnote.common.entity.ResultEntity;
import com.personal.keepnote.common.utils.UploadUtils;
import com.personal.keepnote.persistence.entity.SysUser;
import com.personal.keepnote.persistence.entity.UserPicture;
import com.personal.keepnote.service.UserPictureService;
import com.personal.keepnote.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-15 14:04
 */
@RequestMapping("/picture")
@RestController
public class UploadController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadController.class);
    @Autowired
    UserPictureService userPictureService;
    @Autowired
    UserService userService;

    @GetMapping("/upload")
    @ApiOperation(value = "获取图片", notes = "获取头像")
    public void upload(HttpServletResponse response,
                       HttpServletRequest request, @ApiParam(name = "username", value = "登录账号", required = true) @RequestParam(value = "username") String username) throws IOException {
        SysUser userByUserName = userService.getUserByUserName(username);
        if (userByUserName == null) {
            return;
        }
        SysUser user = (SysUser) request.getSession().getAttribute("user");
        String path = userPictureService.usePicturePath(user.getId(), 1);
        FileInputStream hFile = new FileInputStream(path);      //得到文件大小
        int i = hFile.available();
        byte data[] = new byte[i];        //读数据

        hFile.read(data);         //得到向客户端输出二进制数据的对象

        OutputStream toClient = response.getOutputStream();         //输出数据

        toClient.write(data);

        toClient.flush();

        toClient.close();

        hFile.close();

    }

    @PostMapping("/upload")
    @ResponseBody
    @Transactional
    public ResultEntity upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        SysUser user = (SysUser) request.getSession().getAttribute("user");
        if (file.isEmpty()) {
            return ResultEntity.newResultEntity("上传失败请选择文件");
        }
        String fileName = file.getOriginalFilename();
        String filePath = UploadUtils.isCreateDir();
        File dest = new File(filePath + fileName);
        try {
            if (!dest.exists()) {
                dest.createNewFile();
            }
            file.transferTo(dest);
            LOGGER.info("上传成功");
//            return ResultEntity.newResultEntity("上传成功");
        } catch (IOException e) {
            LOGGER.error(e.toString(), e);
            return ResultEntity.newResultEntity("上传失败，无法生成新的文件");
        }
        userPictureService.setUnUsed(user.getId());
        UserPicture userPicture = new UserPicture();
        userPicture.setFlag(1);
        userPicture.setUserId(user.getId());
        userPicture.setPicturePath(filePath + fileName);
        userPictureService.addUserPicture(userPicture);
        return ResultEntity.newResultEntity("上传成功");
    }
    @PostMapping("/upload/register")
    @ResponseBody
    @Transactional
    public ResultEntity uploadRegister(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        if (file.isEmpty()) {
            return ResultEntity.newResultEntity("上传失败请选择文件");
        }
        String fileName = file.getOriginalFilename();
        String filePath = UploadUtils.isCreateDir();
        File dest = new File(filePath + fileName);
        try {
            if (!dest.exists()) {
                dest.createNewFile();
            }
            file.transferTo(dest);
            LOGGER.info("上传成功");
        } catch (IOException e) {
            LOGGER.error(e.toString(), e);
            return ResultEntity.newResultEntity("上传失败，无法生成新的文件");
        }
        return ResultEntity.newResultEntity(filePath+fileName);
    }
}



