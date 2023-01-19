package com.example.demo.service.impl;

import com.example.demo.bean.LoginModel;
import com.example.demo.bean.User;
import com.example.demo.mapper.LoginMapper;
import com.example.demo.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public List<User> login(LoginModel loginModel) {
        return loginMapper.login(loginModel);
    }
}
