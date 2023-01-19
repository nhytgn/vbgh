package com.example.demo.service;

import com.example.demo.bean.LoginModel;
import com.example.demo.bean.User;

import java.util.List;

public interface ILoginService {
    List<User> login(LoginModel loginModel);
}
