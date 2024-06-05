package co.cue.edu.practicaSpring.demo.controllers;

import co.cue.edu.practicaSpring.demo.model.User;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @GetMapping(value = "/get-user")
    public User getUser(){
        return User.builder()
                .id("1")
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
                    .id("1")
                    .name("Samuelín")
                    .age(18)
                    .cellphone("3106769329")
                    .email("sbuitrago2223@cue.edu.co")
                    .build();
        }
        throw new BadRequestException("Invalid id");
    }
}
