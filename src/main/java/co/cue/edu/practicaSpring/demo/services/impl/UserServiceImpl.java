package co.cue.edu.practicaSpring.demo.services.impl;

import co.cue.edu.practicaSpring.demo.model.User;
import co.cue.edu.practicaSpring.demo.repositories.UserRepository;
import co.cue.edu.practicaSpring.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //define que es un service como el applicationScoped
public class UserServiceImpl implements UserService {

    @Autowired //Inyectamos la clase UserRepository
    private UserRepository repository;

    @Override
    public List<User> getUsers() { //Recordar que necesitamos los dtos, mappers ya que estamos devolviendo modelos y debemos devolver un dto para enviarlo al repositorio y decirle .MAPP hacer el mapeo de lo que me está devolviendo el repositorio.
        //Ya que hace un retorno
        return repository.listUsers();
    }

    @Override
    public void removeUser(Long id) {
        repository.removeUser(id);
    }

    @Override
    public void addUser(User user) {
        repository.addUser(user);
    }
}
