package com.example.demo.Controllers;

import com.example.demo.Entity.Firsttable;
import com.example.demo.Services.SendUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by abin on 7/30/2017.
 */

@RestController
public class DefaultController
 {
     @Autowired
     SendUserInfoService sendUserInfoService;
     @RequestMapping(value="/index",method= RequestMethod.POST)
    public Collection<Firsttable> testMethod(){
        return sendUserInfoService.sendUserInfo();
    }
}
