package com.sparkchain.service.project;

import com.sparkchain.pojo.person.Person;
import com.sparkchain.pojo.project.Project;
import com.sparkchain.pojo.project.ProjectPool;

import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 9:51.
 */
public interface ProjectService {
    List<Project> getAllProject();

    List<Project> findAllByPerson(Long id);

    void add(Project project,Long poolId,Long id);

    Project findByid(Long id);
}
