package online.pythonbot.FullStackApplicationbackend.controller;

import online.pythonbot.FullStackApplicationbackend.model.User;
import online.pythonbot.FullStackApplicationbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class userController {
    @Autowired
    private UserRepository userRepository ;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }
}
