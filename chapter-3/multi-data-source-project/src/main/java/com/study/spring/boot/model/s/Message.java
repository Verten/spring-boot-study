/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2016 by Ericsson, all rights reserved.
 */

package com.study.spring.boot.model.s;
/**
 * Created by ebinhon on 10/26/2017.
 **/

import javax.persistence.*;

/**
 * @author ebinhon
 * @version $Revision: $
 */
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String content;

    public Message() {
    }

    public Message(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public Message(Long id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
