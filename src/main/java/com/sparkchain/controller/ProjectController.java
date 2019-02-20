package com.sparkchain.controller;

import com.sparkchain.pojo.project.Project;
import com.sparkchain.pojo.project.ProjectPool;
import com.sparkchain.service.project.ProjectService;
import com.sparkchain.service.projectPool.ProjectPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 9:49.
 */
@RestController
@RequestMapping("project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @RequestMapping("all")
    public List<Project> getAllProjectPool(){
        return projectService.getAllProject();
    }
}
