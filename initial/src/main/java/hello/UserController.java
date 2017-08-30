package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <code></code>
 *
 * @author masonhsieh
 * @version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;


    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/create")
    @ResponseBody
    public User createUserRest(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/all")
    @ResponseBody
    public Iterable<User> findAllUsersRest() {
        return userRepository.findAll();
    }
}
