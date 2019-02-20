package com.sparkchain.controller;

import com.sparkchain.pojo.project.Project;
import com.sparkchain.pojo.project.ProjectPool;
import com.sparkchain.service.project.ProjectService;
import com.sparkchain.service.projectPool.ProjectPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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

    @RequestMapping("add")
    public void Add(Long id,String name, Long poolId, String company, String createBy,String introdution){
        Project project = new Project();
        Long timeStamp = System.currentTimeMillis()/1000;
        project.setId(timeStamp);
        project.setName(name);
        project.setProjectCompany(company);
        project.setProjectCreateBy(createBy);
        project.setIntrodution(introdution);
        project.setCreateTime(new Date());
        projectService.add(project,poolId,id);
    }

    @RequestMapping("person")
    public List<Project> getAllByPerson(Long id){
        return projectService.findAllByPerson(id);
    }

    @RequestMapping("one/{id}")
    public Project getOneById(@PathVariable("id")Long id){
        Project project= projectService.findByid(id);
        System.out.print(project.getPerson().getName());
        return project;
    }

}
