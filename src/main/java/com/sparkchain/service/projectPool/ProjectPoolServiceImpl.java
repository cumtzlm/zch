package com.sparkchain.service.projectPool;

import com.sparkchain.dao.repository.ProjectPoolRepository;
import com.sparkchain.pojo.project.ProjectPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 9:51.
 */
@Service
public class ProjectPoolServiceImpl implements ProjectPoolService{

    @Autowired
    ProjectPoolRepository projectPoolRepository;
    @Override
    public List<ProjectPool> getAllProjectPool() {
        return projectPoolRepository.findAll();
    }
}
