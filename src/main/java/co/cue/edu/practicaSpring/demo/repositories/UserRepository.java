package co.cue.edu.practicaSpring.demo.repositories;

import co.cue.edu.practicaSpring.demo.model.User;

import java.util.List;

public interface UserRepository {
    List<User> listUsers();
    void removeUser(Long id);
    void addUser(User user);
}
