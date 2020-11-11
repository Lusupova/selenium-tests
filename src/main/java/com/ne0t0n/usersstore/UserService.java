package com.ne0t0n.usersstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> getById(final Long id) {
        return userRepository.findById(id);
    }

    public boolean save(final User user) {
        if (user.getId() != null && userRepository.findById(user.getId()).isPresent()) {
            return false;
        }
        userRepository.save(user);
        return true;
    }

    public boolean deleteById(final Long id) {
        if (userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
