package ma.emsi.organisationms.userms.Controller;

import ma.emsi.organisationms.userms.DAO.User;
import ma.emsi.organisationms.userms.Service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserInterface userInterface;

    @RequestMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userInterface.getAllUsers();
    }

    @RequestMapping("/getUserById")
        public User getUser(Long id){
        return userInterface.findUserById(id);
    }

    @RequestMapping("/createUser")
    public void createUser(User user){
        userInterface.createUser(user);
    }

    @RequestMapping("/deleteUser")
    public void deleteUserById(Long id){
        userInterface.deleteUserById(id);
    }
}
