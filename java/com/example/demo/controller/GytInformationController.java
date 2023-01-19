package com.example.demo.controller;

import com.example.demo.bean.Hospital;
import com.example.demo.mapper.GytInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GytInformationController {

    @Autowired
    private GytInformationMapper gytInformationMapper;

    @GetMapping("/view")
    @ResponseBody
    public List<Hospital> view(){
        System.out.println("请求到了");
        return gytInformationMapper.view();
    }

    @PostMapping("/insertInformation.do")
    @ResponseBody
    public void insertInformation(@RequestBody Hospital hospital){
        System.out.println("AAA");
        System.out.println(hospital);
        if (hospital.getHospital_phone().length()==0){
            System.out.println("SSSSSSSSSSSssss");
        }
//        gytInformationMapper.insertInformation(hospital);
        gytInformationMapper.insertInformation(hospital);
    }
}
