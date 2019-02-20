package com.sparkchain.dao.repository;

import com.sparkchain.pojo.person.Person;
import com.sparkchain.pojo.project.Project;
import com.sparkchain.pojo.project.ProjectPool;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 9:45.
 */
public interface ProjectRepository extends JpaRepository<Project,Long>{
    List<Project> findAllByPerson(Person person);
}
