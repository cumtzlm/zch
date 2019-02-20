package com.sparkchain.service.projectPool;

import com.sparkchain.pojo.project.ProjectPool;
import com.sparkchain.pojo.project.ProjectPoolStatus;

import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 9:51.
 */
public interface ProjectPoolService {
    List<ProjectPool> getAllProjectPool();

    void addProjectPool(ProjectPool projectPool,Long id);

    ProjectPoolStatus getProjectPoolStatusById(Integer id);

    List<ProjectPool> getMyProjectPool(Long id);
}
