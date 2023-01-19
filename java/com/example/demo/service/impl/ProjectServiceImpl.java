package com.example.demo.service.impl;

import com.example.demo.bean.Project;
import com.example.demo.mapper.ProjectMapper;
import com.example.demo.dto.ProjectDto;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public int deleteByPrimaryKey(Integer itemid, String itemcode) {
        return 0;
    }

    @Override
    public int insertSelective(Project record) {
        return 0;
    }

    @Override
    public Project selectByPrimaryKey(Integer itemid, String itemcode) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Project record) {
        projectMapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public List<ProjectDto> selectproAll(String dataStatus, String userCode) {
        /*String rolename = usernameUtil.getRoleName();
        String cityid = projectMapper.selCityIdByItemCode(usernameUtil.getItemCode());*/
        /*String[] cityCountry = cityid.split("\\|");
        String addrCity,addrCountry = null;
        if (cityCountry.length == 1){
            addrCity = cityCountry[0];
        }else{
            addrCity = cityCountry[0];
            addrCountry = cityCountry[1];
        }*/
        /*if(StringUtils.equals("管理员",rolename)){
            return projectMapper.selectproAll(dataStatus,userCode,null,null,null,null);
        }else if(StringUtils.equals("县级",rolename)){
            return projectMapper.selectproAll(dataStatus,userCode,"yes",null,addrCity,addrCountry);
        }else if(StringUtils.equals("市级",rolename)){
            return projectMapper.selectproAll(dataStatus,userCode,null,"yes",addrCity,addrCountry);
        }else{
            return projectMapper.selectproAll(dataStatus,userCode,null,null,addrCity,addrCountry);
        }
*/
        return projectMapper.selectproAll(dataStatus,userCode,null,null,null,null);
    }

    @Override
    public List<ProjectDto> selectchaAll(String dataStatus, String userCode) {

        /*String rolename = usernameUtil.getRoleName();
        String cityid = projectMapper.selCityIdByItemCode(usernameUtil.getItemCode());
        String[] cityCountry = cityid.split("\\|");
        String addrCity,addrCountry = null;
        if (cityCountry.length == 1){
            addrCity = cityCountry[0];
        }else{
            addrCity = cityCountry[0];
            addrCountry = cityCountry[1];
        }
        if(StringUtils.equals("管理员",rolename)){
            return projectMapper.selectchaAll(dataStatus,userCode,null,null,null,null);
        }else if(StringUtils.equals("县级",rolename)){
            return projectMapper.selectchaAll(dataStatus,userCode,"yes",null,addrCity,addrCountry);
        }else if(StringUtils.equals("市级",rolename)){
            return projectMapper.selectchaAll(dataStatus,userCode,null,"yes",addrCity,addrCountry);
        }else{
            return projectMapper.selectchaAll(dataStatus,userCode,null,null,addrCity,addrCountry);
        }*/

        return projectMapper.selectchaAll(dataStatus,userCode,null,null,null,null);
    }
}
