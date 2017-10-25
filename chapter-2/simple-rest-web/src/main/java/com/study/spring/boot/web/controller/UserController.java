/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2016 by Ericsson, all rights reserved.
 */

package com.study.spring.boot.web.controller;
/**
 * Created by ebinhon on 10/25/2017.
 **/

import com.study.spring.boot.web.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author ebinhon
 * @version $Revision: $
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private static Map<Long, User> userList = Collections.synchronizedMap(new HashMap<>());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUsersList() {
        List<User> users = new ArrayList<>(userList.values());
        return users;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@RequestParam("id") Long id,
                           @RequestParam("name") String name,
                           @RequestParam("age") Integer age) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        userList.put(id, user);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Long id) {
        return userList.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(){

        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Long id){
        userList.remove(id);
        return "success";
    }

}
