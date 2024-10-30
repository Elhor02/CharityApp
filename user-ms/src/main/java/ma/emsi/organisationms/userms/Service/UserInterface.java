package ma.emsi.organisationms.userms.Service;

import ma.emsi.organisationms.userms.DAO.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserInterface {
    public List<User> getAllUsers();
    public void createUser(User user);
    public void deleteUserById(Long id);
    public User findUserById(Long id);
}
