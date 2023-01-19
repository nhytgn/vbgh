package com.example.demo.controller;

import com.example.demo.bean.Project;
import com.example.demo.dto.ProjectDto;
import com.example.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

//    /**
//     * 查看
//     */
//    @RequestMapping(value = "/selectProject/{itemID}/{itemCode}",method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseData selectByPrimaryKey(@PathVariable("itemID") Integer itemid, @PathVariable("itemCode") String itemcode){
//        Project project = iProjectService.selectByPrimaryKey(itemid,itemcode);
//        return new ResponseData(EmBusinessError.success,project);
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping(value = "/deleteProject/{ItemID}/{ItemCode}",method = RequestMethod.DELETE)
//    @ResponseBody
//    public ResponseData deleteByPrimaryKey(@PathVariable("ItemID") Integer itemid, @PathVariable("ItemCode") String itemCode){
//        iProjectService.deleteByPrimaryKey(itemid,itemCode);
//        return new ResponseData(EmBusinessError.success);
//    }
//
//    /**
//     * 增加
//     */
//    @RequestMapping(value = "/insertProject", method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseData insertSelective(@RequestBody Project record) throws BusinessException {
//        iProjectService.insertSelective(record);
//        return new ResponseData(EmBusinessError.success);
//    }

    /**
     * 更新
     */
    @RequestMapping(value = "/updateProject", method = RequestMethod.PUT)
    @ResponseBody
    public void updateByPrimaryKeySelective(@RequestBody Project submitStatus) {
        System.out.println("收到更新请求");
        System.out.println(submitStatus.toString());
        projectService.updateByPrimaryKeySelective(submitStatus);
    }

    @GetMapping(value = "/hello")
    @ResponseBody
    public List<ProjectDto> selectproAll(@RequestParam(value = "status") String dataStatus,@RequestParam(value = "userCode",required = false) String userCode){

        System.out.println("收到请求");
        return projectService.selectproAll(dataStatus,userCode);
    }

    @GetMapping (value = "/selectchaAll")
    @ResponseBody
    public List<ProjectDto> selectchaAll(@RequestParam(value = "status") String dataStatus,@RequestParam(value = "userCode",required = false) String userCode) {
        System.out.println("收到请求1");
        return projectService.selectchaAll(dataStatus,userCode);
    }
}
