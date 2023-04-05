package online.pythonbot.FullStackApplicationbackend.controller;
import  java.util.List;
import online.pythonbot.FullStackApplicationbackend.model.User;
import online.pythonbot.FullStackApplicationbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class userController {
    @Autowired
    private UserRepository userRepository ;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAlluser(){
        return userRepository.findAll();
    }
}
