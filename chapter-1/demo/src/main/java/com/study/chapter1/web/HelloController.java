/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2016 by Ericsson, all rights reserved.
 */
package com.study.chapter1.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ebinhon
 * @version $Revision: $
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello World!";
    }

}
