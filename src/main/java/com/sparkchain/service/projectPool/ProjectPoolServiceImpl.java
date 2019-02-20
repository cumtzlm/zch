package com.sparkchain.service.projectPool;

import com.sparkchain.dao.repository.PersonRepository;
import com.sparkchain.dao.repository.ProjectPoolRepository;
import com.sparkchain.dao.repository.ProjectPoolStatusRepository;
import com.sparkchain.pojo.project.ProjectPool;
import com.sparkchain.pojo.project.ProjectPoolStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author 张立明
 * @date 2019/2/20 9:51.
 */
@Service
public class ProjectPoolServiceImpl implements ProjectPoolService{

    @Autowired
    ProjectPoolRepository projectPoolRepository;
    @Autowired
    PersonRepository personRepository;

    @Autowired
    ProjectPoolStatusRepository projectPoolStatusRepository;
    @Override
    public List<ProjectPool> getAllProjectPool() {
        return projectPoolRepository.findAll();
    }

    @Override
    public void addProjectPool(ProjectPool projectPool,Long id) {
        projectPool.setPerson(personRepository.findById(id).orElse(null));
        projectPoolRepository.saveAndFlush(projectPool);
    }

    @Override
    public ProjectPoolStatus getProjectPoolStatusById(Integer id) {
        Optional<ProjectPoolStatus> byId=projectPoolStatusRepository.findById(id);
        return byId.orElse(null);
    }

    @Override
    public List<ProjectPool> getMyProjectPool(Long id) {
        return projectPoolRepository.findAllByPerson(personRepository.findById(id).orElse(null));
    }
}
