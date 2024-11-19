package ma.emsi.organisationms.userms.Service;

import ma.emsi.organisationms.userms.DAO.Users;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserInterface {
    public List<Users> getAllUsers();
    public void createUser(Users user);
    public void deleteUserById(Long id);
    public Users findUserById(Long id);
}
