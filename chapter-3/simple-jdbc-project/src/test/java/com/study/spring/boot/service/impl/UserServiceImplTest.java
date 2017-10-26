package com.study.spring.boot.service.impl;

import com.study.spring.boot.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ebinhon on 10/26/2017.
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        userService.deleteAllUsers();
    }

    @Test
    public void testUserService() throws Exception {
        userService.createUser("test1", 24);
        userService.createUser("test2", 25);
        userService.createUser("test3", 26);
        userService.createUser("test4", 27);
        userService.createUser("test5", 28);

        Assert.assertEquals(5, userService.getAllUsers().intValue());

        userService.deleteUserByName("test1");
        userService.deleteUserByName("test2");
        Assert.assertEquals(3, userService.getAllUsers().intValue());

        userService.deleteAllUsers();
        Assert.assertEquals(0, userService.getAllUsers().intValue());
    }

}