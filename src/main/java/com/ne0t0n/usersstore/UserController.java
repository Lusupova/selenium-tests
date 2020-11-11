package com.ne0t0n.usersstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{userId}")
    public Optional<User> getById(@PathVariable final Long userId) {
        return userService.getById(userId);
    }

    @PostMapping
    public void save(@RequestBody final User user) {
        userService.save(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteById(@PathVariable final Long userId) {
        userService.deleteById(userId);
    }
}
