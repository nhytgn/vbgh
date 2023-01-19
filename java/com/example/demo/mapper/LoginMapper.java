package com.example.demo.mapper;

import com.example.demo.bean.LoginModel;
import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LoginMapper {
    List<User> login(LoginModel loginModel);
}
