package com.sparkchain.dao.repository;

import com.sparkchain.pojo.project.Project;
import com.sparkchain.pojo.project.ProjectPool;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 张立明
 * @date 2019/2/20 9:45.
 */
public interface ProjectRepository extends JpaRepository<Project,Integer>{
}
