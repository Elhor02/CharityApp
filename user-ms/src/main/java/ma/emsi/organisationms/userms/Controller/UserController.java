package ma.emsi.organisationms.userms.Controller;

import ma.emsi.organisationms.userms.DAO.Users;
import ma.emsi.organisationms.userms.Service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserInterface userInterface;

    @RequestMapping("/getAllUsers")
    public List<Users> getAllUsers(){
        return userInterface.getAllUsers();
    }

    @RequestMapping("/getUserById/{id}")
        public Users getUser(@PathVariable Long id){
        return userInterface.findUserById(id);
    }

    @PostMapping("/createUser")
    public void createUser(@RequestBody Users user){
        userInterface.createUser(user);
    }

    @DeleteMapping("/deleteUserById/{id}")
    public void deleteUserById(@PathVariable Long id){
        userInterface.deleteUserById(id);
    }
}
