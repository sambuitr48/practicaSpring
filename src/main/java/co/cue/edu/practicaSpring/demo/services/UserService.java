package co.cue.edu.practicaSpring.demo.services;

import co.cue.edu.practicaSpring.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void removeUser(Long id);
    void addUser(User user);
}
