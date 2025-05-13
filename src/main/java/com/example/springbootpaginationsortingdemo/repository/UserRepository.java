package com.example.springbootpaginationsortingdemo.repository;

import com.example.springbootpaginationsortingdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository already supports pagination and sorting
}
