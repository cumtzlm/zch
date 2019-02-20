package com.sparkchain.service.project;

import com.sparkchain.dao.repository.ProjectRepository;
import com.sparkchain.pojo.project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 10:01.
 */
@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;
    @Override
    public List<Project> getAllProject() {
        return projectRepository.findAll();
    }
}
