/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2016 by Ericsson, all rights reserved.
 */

package com.study.spring.boot.model.s;
/**
 * Created by ebinhon on 10/26/2017.
 **/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ebinhon
 * @version $Revision: $
 */
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
