package com.example.springbootpaginationsortingdemo.service;
import com.example.springbootpaginationsortingdemo.entity.User;
import com.example.springbootpaginationsortingdemo.repository.UserRepository;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Page<User> getAllUsers(int page, int size, String sortBy, String sortDir){
        Sort sort = sortDir.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return userRepository.findAll(pageable);
    }

}
