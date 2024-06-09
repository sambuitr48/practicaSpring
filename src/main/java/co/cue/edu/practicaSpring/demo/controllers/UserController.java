package co.cue.edu.practicaSpring.demo.controllers;

import co.cue.edu.practicaSpring.demo.model.User;
import co.cue.edu.practicaSpring.demo.services.UserService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired //Se inyecta el servicio
    private UserService userService; //llamamos al servicio
    @GetMapping(value = "/get-users")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }
    @DeleteMapping(value = "/delete-user/{id}")
    public void removeUser(@PathVariable Long id) { userService.removeUser(id); } //pathvariable porque estamos recibiendo un id por parámetro

    @PostMapping(value ="/add-user")
    public void removeUser(@RequestBody User user) { userService.addUser(user); }


    @GetMapping(value = "/get-user")
    public User getUser(){
        return User.builder()
                .id(1L)
                .name("Samuelín")
                .age(18)
                .cellphone("3106769329")
                .email("sbuitrago2223@cue.edu.co")
                .build();
    }
    @GetMapping(value = "/get-user-by-id/{id}")
    public User getUserById(@PathVariable String id) throws BadRequestException {
        if (id.equalsIgnoreCase("1")){
            return User.builder()
                    .id(1L)
                    .name("Samuelín")
                    .age(18)
                    .cellphone("3106769329")
                    .email("sbuitrago2223@cue.edu.co")
                    .build();
        }
        throw new BadRequestException("Invalid id");
    }
}
