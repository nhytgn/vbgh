package com.example.demo.service;

import com.example.demo.bean.Project;
import com.example.demo.dto.ProjectDto;

import java.util.List;

public interface ProjectService {

    int deleteByPrimaryKey(Integer itemid,String itemcode);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer itemid,String itemcode);

    int updateByPrimaryKeySelective(Project record);

    List<ProjectDto> selectproAll(String dataStatus, String userCode);

    List<ProjectDto> selectchaAll(String dataStatus, String userCode);
}
