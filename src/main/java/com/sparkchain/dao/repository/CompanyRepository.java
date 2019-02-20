package com.sparkchain.dao.repository;

import com.sparkchain.pojo.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 张立明
 * @date 2019/2/20 10:30.
 */
public interface CompanyRepository extends JpaRepository<Company,Integer>{
}
