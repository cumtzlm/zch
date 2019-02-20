package com.sparkchain.controller;

import com.sparkchain.pojo.person.Person;
import com.sparkchain.service.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 10:28.
 */
@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("all")
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }

    @RequestMapping("register")
    public void Register(String name, String idCardNo, String phone, @RequestParam("urlImageFront")MultipartFile urlImageFront,@RequestParam("urlImageBack")MultipartFile urlImageBack,
                         String introdution){
        Person person = new Person();
        person.setName(name);
        person.setIdCardNo(idCardNo);
        person.setPhone(phone);
//        person.setUrlImageFront(urlImageFront);
//        person.setUrlImageBack(urlImageBack);
    }


}
