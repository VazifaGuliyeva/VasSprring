package vas.VasSprring.controller;

import org.springframework.web.bind.annotation.*;
import vas.VasSprring.entity.User;
import vas.VasSprring.manager.UserManager;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserManager userManager;

    public UserController(UserManager userManager) {
        this.userManager = userManager;
    }
    @GetMapping("/users")
    public List<User> getall(){
        return userManager.getAll();
    }
    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id){
        return userManager.getById(id);
    }
    @PostMapping("/user")
    public void saveUser(@RequestBody User user){
        userManager.saveUser(user);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id){
        userManager.deleteUser(id);
    }

}
