package com.example.redisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Key;

@Service
public class PersonServiceImpl {

    @Autowired
    RedisDBHelper<String, Person> redisDBHelper;

    // 你可以理解为这个是表名
    private static final String KEY= "PERSON_KEY";

    /**
     * 储存一个Person到一个Map结构中
     * @param person
     */
    public void putPerson(Person person) {
        redisDBHelper.hashPut(KEY, person.getId(), person);
    }

    public Person getPerson(Person person){
       return redisDBHelper.hashGet(KEY,person.getId());
    }
}
