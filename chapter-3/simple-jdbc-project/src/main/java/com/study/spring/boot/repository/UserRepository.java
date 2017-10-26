package com.study.spring.boot.repository;

import com.study.spring.boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by ebinhon on 10/26/2017.
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByName(String name);

    User findUserByNameAndAge(String name, Integer age);

    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);
}
