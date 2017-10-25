/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2016 by Ericsson, all rights reserved.
 */

package com.study.chapter1;
/**
 * Created by ebinhon on 10/25/2017.
 **/

import com.study.chapter1.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ebinhon
 * @version $Revision: $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {

    @Autowired
    private User user;

    @Test
    public void initUser() throws Exception {
        Assert.assertEquals(user.getName(), "hongbin1");
    }
}
