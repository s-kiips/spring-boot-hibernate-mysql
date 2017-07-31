package com.example.demo.Services;


import com.example.demo.Dao.GetUserInfo;
import com.example.demo.Entity.Firsttable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by abin on 7/31/2017.
 */
@Service
public class SendUserInfoServiceImpl implements SendUserInfoService {
    @Autowired
    GetUserInfo getUserInfo;

    @Override
    public Collection<Firsttable> sendUserInfo() {
        Collection<Firsttable> response= getUserInfo.sendUserInfo();
        return response;

    }
}
