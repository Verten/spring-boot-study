package com.study.spring.boot.repository;

import com.study.spring.boot.model.User;
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
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp() throws Exception {
        userRepository.deleteAll();
    }

    @Test
    public void testUserRepository() {
        userRepository.save(new User("test1", 24));
        userRepository.save(new User("test2", 25));
        userRepository.save(new User("test3", 26));
        userRepository.save(new User("test4", 27));
        userRepository.save(new User("test5", 28));

        Assert.assertEquals(5, userRepository.findAll().size());
        Assert.assertEquals(26, userRepository.findUser("test3").getAge().longValue());
        Assert.assertEquals(27, userRepository.findUserByName("test4").getAge().longValue());
        Assert.assertEquals("test5", userRepository.findUserByNameAndAge("test5", 28).getName());

        userRepository.delete(userRepository.findUserByName("test2"));
        Assert.assertEquals(4, userRepository.findAll().size());
    }
}