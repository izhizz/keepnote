package com.personal.keepnote.service;

import com.personal.keepnote.persistence.entity.InfoPassword;

import java.util.List;

public interface InfoPasswordService {
    List<InfoPassword> getAllInfoPassword();

    boolean checkValidResgister(String key);
}
