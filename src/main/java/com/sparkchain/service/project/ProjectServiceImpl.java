package com.sparkchain.service.project;

import com.sparkchain.dao.repository.*;
import com.sparkchain.pojo.person.Person;
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
    @Autowired
    PersonRepository personRepository;
    @Autowired
    ProjectPoolRepository projectPoolRepository;
    @Autowired
    ProjectStageRepository projectStageRepository;
    @Autowired
    ProjectStatusRepository projectStatusRepository;
    @Override
    public List<Project> getAllProject() {
        return projectRepository.findAll();
    }

    @Override
    public List<Project> findAllByPerson(Long id) {
        return projectRepository.findAllByPerson(personRepository.findById(id).orElse(null));
    }

    @Override
    public void add(Project project, Long poolId, Long id) {
        project.setPerson(personRepository.findById(id).orElse(null));
        if(poolId!=null){
            project.setProjectPool(projectPoolRepository.findById(poolId).orElse(null));
        }
        project.setProjectStage(projectStageRepository.findById(1).orElse(null));
        project.setProjectStatus(projectStatusRepository.findById(1).orElse(null));
        projectRepository.save(project);
    }

    @Override
    public Project findByid(Long id) {
        return projectRepository.findById(id).orElse(null);
    }
}
