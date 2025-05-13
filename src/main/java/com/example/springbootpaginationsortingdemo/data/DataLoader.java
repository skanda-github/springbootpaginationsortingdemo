package com.example.springbootpaginationsortingdemo.data;

import com.example.springbootpaginationsortingdemo.entity.User;
import com.example.springbootpaginationsortingdemo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    private final UserRepository repo;

    public DataLoader(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        repo.save(new User(null, "Alice", "alice@example.com", 28));
        repo.save(new User(null, "Bob", "bob@example.com", 32));
        repo.save(new User(null, "Charlie", "charlie@example.com", 24));
        repo.save(new User(null, "David", "david@example.com", 35));
        repo.save(new User(null, "Eva", "eva@example.com", 27));
        repo.save(new User(null, "Frank", "frank@example.com", 30));
        repo.save(new User(null, "Grace", "grace@example.com", 26));
    }

}
