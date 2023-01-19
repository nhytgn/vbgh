package com.example.demo.controller;

import com.example.demo.bean.LoginModel;
import com.example.demo.bean.User;
import com.example.demo.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private ILoginService iLoginService;

    @PostMapping("/login.do")
    @ResponseBody
    public List<User> login(@RequestBody LoginModel loginModel){
        System.out.println("KKKKKKKK");
        System.out.println(loginModel.getUsername());
        System.out.println(loginModel.getPassword());
        System.out.println(loginModel);
        if (loginModel.getUsername() != null && loginModel.getPassword() != null) {
            return this.iLoginService.login(loginModel);
        } else {
            System.out.println("用户名密码不能为空");
            return null;
        }
    }
}
