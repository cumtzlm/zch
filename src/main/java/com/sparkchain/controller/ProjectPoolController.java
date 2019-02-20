package com.sparkchain.controller;

import com.sparkchain.pojo.project.ProjectPool;
import com.sparkchain.pojo.project.ProjectPoolStatus;
import com.sparkchain.service.projectPool.ProjectPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 9:49.
 */
@RestController
@RequestMapping("projectPool")
public class ProjectPoolController {
    @Autowired
    ProjectPoolService projectPoolService;

    //获取全部项目池
    @RequestMapping("all")
    public List<ProjectPool> getAllProjectPool(){
        return projectPoolService.getAllProjectPool();
    }

    //新增项目池
    @RequestMapping("add")
    public void addProjectPool(String name,String introdution,Long id){
        ProjectPool projectPool = new ProjectPool();
        Long timeStamp = System.currentTimeMillis()/1000;
        projectPool.setId(timeStamp);
        projectPool.setName(name);
        projectPool.setIntrodution(introdution);
        projectPool.setCreateTime(new Date());
        projectPool.setProjectPoolStatus(projectPoolService.getProjectPoolStatusById(1));
        projectPoolService.addProjectPool(projectPool,id);
    }

    //根据用户获取项目池
    @RequestMapping("person")
    public List<ProjectPool> getAllProjectPoolByPerson(Long id){
        return projectPoolService.getMyProjectPool(id);
    }
}
