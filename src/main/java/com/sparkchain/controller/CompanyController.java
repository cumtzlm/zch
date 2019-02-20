package com.sparkchain.controller;

import com.sparkchain.pojo.company.Company;
import com.sparkchain.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张立明
 * @date 2019/2/20 10:29.
 */
@RestController
@RequestMapping("company")
public class CompanyController {
    @Autowired
    CompanyService companyService;

}
