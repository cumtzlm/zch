package com.sparkchain.dao.repository;

import com.sparkchain.pojo.activity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 张立明
 * @date 2019/2/20 9:04.
 */
public interface ActivityRepository extends JpaRepository<Activity,Long>{
}
