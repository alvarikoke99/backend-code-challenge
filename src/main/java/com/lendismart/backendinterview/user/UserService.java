package com.lendismart.backendinterview.user;

import exception.UserAlreadyExistsException;
import exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private UserRepository userRepository;

    public User createUser(User user) {
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new UserAlreadyExistsException("Username already exists: " + user.getUsername());
        }
        return userRepository.save(user);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("User not found with username: " + username));
    }

    public User updateUser(Long id, User userDetails) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found"));

        if (!existingUser.getUsername().equals(userDetails.getUsername())
                && userRepository.findByUsername(userDetails.getUsername()).isPresent()) {
            throw new UserAlreadyExistsException("Username already exists: " + userDetails.getUsername());
        }

        existingUser.setUsername(userDetails.getUsername());
        existingUser.setPhoneNumber(userDetails.getPhoneNumber());
        existingUser.setCountryCode(userDetails.getCountryCode());

        return userRepository.save(existingUser);
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> new UserDTO(user.getUsername()))
                .collect(Collectors.toList());
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        userRepository.delete(user);
    }

    public void deleteUsers(List<Long> userIds) {
        List<User> users = (List<User>) userRepository.findAllById(userIds);
        if (users.isEmpty()) {
            throw new UserNotFoundException("No users found for the given IDs");
        }
        userRepository.deleteAll(users);
    }
}
