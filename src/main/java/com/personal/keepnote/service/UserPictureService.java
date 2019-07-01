package com.personal.keepnote.service;

import com.personal.keepnote.persistence.entity.UserPicture;

/**
 * @author MR FENG
 */
public interface UserPictureService {
    /**
     * 获取当前用户照片
     *
     * @param userId
     * @param flag
     * @return
     */
    UserPicture currentUsePicture(Integer userId, Integer flag);

    /**
     * 获取当前用户照片的路径
     *
     * @param userId
     * @param flag
     * @return
     */
    String usePicturePath(Integer userId, Integer flag);

    /**
     * 设置用户不使用照片
     *
     * @param userId
     */
    void setUnUsed(Integer userId);

    /**
     * 添加用户照片数据
     *
     * @param userPicture
     */
    void addUserPicture(UserPicture userPicture);
}
