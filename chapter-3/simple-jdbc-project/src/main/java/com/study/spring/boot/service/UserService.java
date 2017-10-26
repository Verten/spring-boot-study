package com.study.spring.boot.service;

/**
 * Created by ebinhon on 10/26/2017.
 **/
public interface UserService {

    void createUser(String name, Integer age);

    void deleteUserByName(String name);

    Integer getAllUsers();

    void deleteAllUsers();
}
