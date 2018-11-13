package com.example.redisdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {

    @Autowired
    PersonServiceImpl personService = new PersonServiceImpl();

    @Test
    public void  test(){
        Person person = new Person();
        person.setId("1");
        person.setName("chanji");
        personService.putPerson(person);
        Person p = personService.getPerson(person);
        System.out.println(p.toString());
    }


}
