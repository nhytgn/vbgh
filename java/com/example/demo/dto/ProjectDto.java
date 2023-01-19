package com.example.demo.dto;

import com.example.demo.bean.Project;

import java.util.Date;
import java.util.List;

public class ProjectDto extends Project {
    private List<String> filePath;
    private String hospitalName;

    public ProjectDto() {
    }

    public ProjectDto(Integer itemid, String itemcode, String name, String content, String dataType, Integer price, String dataStatus, String userCode, Integer visitNum, String creater, Date itemcreateat, String updater, Date itemupdateat) {
        super(itemid, itemcode, name, content, dataType, price, dataStatus, userCode, visitNum, creater, itemcreateat, updater, itemupdateat);
    }

    public List<String> getFilePath() {
        return filePath;
    }

    public void setFilePath(List<String> filePath) {
        this.filePath = filePath;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
