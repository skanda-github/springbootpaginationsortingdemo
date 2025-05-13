package com.example.springbootpaginationsortingdemo.controller;
import com.example.springbootpaginationsortingdemo.entity.User;
import com.example.springbootpaginationsortingdemo.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController (UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public Page<User> getUsers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir) {
        return userService.getAllUsers(page, size, sortBy, sortDir);
    }

}
