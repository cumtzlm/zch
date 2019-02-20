package com.sparkchain.service.company;

import com.sparkchain.dao.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张立明
 * @date 2019/2/20 10:38.
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyRepository companyRepository;
}
