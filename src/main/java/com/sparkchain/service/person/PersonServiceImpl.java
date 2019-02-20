package com.sparkchain.service.person;

import com.sparkchain.dao.repository.PersonRepository;
import com.sparkchain.pojo.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 10:39.
 */
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
}
