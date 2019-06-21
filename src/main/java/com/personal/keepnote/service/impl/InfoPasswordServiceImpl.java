package com.personal.keepnote.service.impl;

import com.personal.keepnote.persistence.dao.InfoPasswordMapper;
import com.personal.keepnote.persistence.entity.InfoPassword;
import com.personal.keepnote.persistence.entity.InfoPasswordExample;
import com.personal.keepnote.service.InfoPasswordService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoPasswordServiceImpl implements InfoPasswordService {
    @Autowired
    InfoPasswordMapper infoPasswordMapper;

    @Override
    public List<InfoPassword> getAllInfoPassword() {
        InfoPasswordExample infoPasswordExample = new InfoPasswordExample();
        List<InfoPassword> infoPasswords = infoPasswordMapper.selectByExample(infoPasswordExample);
        return infoPasswords;
    }

    @Override
    public boolean checkValidResgister(String key) {
        boolean flag = false;
        List<InfoPassword> allInfoPassword = this.getAllInfoPassword();
        for (InfoPassword infoPassword : allInfoPassword) {
            if (key.equals(infoPassword.getKey())) {
                flag = true;
                continue;
            }
        }
        return flag;
    }
}
