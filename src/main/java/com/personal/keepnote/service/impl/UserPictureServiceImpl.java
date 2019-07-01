package com.personal.keepnote.service.impl;

import com.personal.keepnote.persistence.dao.UserPictureMapper;
import com.personal.keepnote.persistence.entity.UserPicture;
import com.personal.keepnote.persistence.entity.UserPictureExample;
import com.personal.keepnote.service.UserPictureService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserPictureServiceImpl implements UserPictureService {
    @Autowired
    UserPictureMapper userPictureMapper;

    @Override
    public UserPicture currentUsePicture(Integer userId, Integer flag) {
        UserPictureExample userPictureExample = new UserPictureExample();
        userPictureExample.createCriteria().andUserIdEqualTo(userId).andFlagEqualTo(flag);
        List<UserPicture> userPictures = userPictureMapper.selectByExample(userPictureExample);
        UserPicture userPicture = null;
        if (userPictures != null && userPictures.size() != 0) {
            userPicture = userPictures.get(0);
        }
        return userPicture;
    }

    @Override
    public String usePicturePath(Integer userId, Integer flag) {
        UserPicture userPicture = this.currentUsePicture(userId, flag);
        String path = null;
        if (userPicture != null) {
            path = userPicture.getPicturePath();
        }
        return path;
    }

    @Override
    public void setUnUsed(Integer userId) {
        UserPictureExample userPictureExample = new UserPictureExample();
        userPictureExample.createCriteria().andUserIdEqualTo(userId);
        UserPicture userPicture = new UserPicture();
        userPicture.setFlag(0);
        userPictureMapper.updateByExample(userPicture, userPictureExample);
    }

    @Override
    public void addUserPicture(UserPicture userPicture) {
        userPictureMapper.insert(userPicture);
    }
}
