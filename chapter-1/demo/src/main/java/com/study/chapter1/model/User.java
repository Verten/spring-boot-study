/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2016 by Ericsson, all rights reserved.
 */
package com.study.chapter1.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ebinhon
 * @version $Revision: $
 */
@Component
public class User {
    @Value("${com.study.chapter1.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
