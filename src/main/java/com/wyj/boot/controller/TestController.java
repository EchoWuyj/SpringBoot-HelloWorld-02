package com.wyj.boot.controller;

import com.wyj.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Wuyj
 * @DateTime 2022-03-08 20:31
 * @Version 1.0
 */

@RestController
public class TestController {

    //person对象是在容器中,通过自动注入即可
    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person() {
        return person;
    }
}
