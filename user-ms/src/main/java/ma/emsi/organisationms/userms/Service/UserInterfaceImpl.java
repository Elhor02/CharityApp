package ma.emsi.organisationms.userms.Service;

import ma.emsi.organisationms.userms.DAO.Users;
import ma.emsi.organisationms.userms.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInterfaceImpl implements UserInterface{
    @Autowired
    private UserRepo userRepo;
    @Override
    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public void createUser(Users user) {
        userRepo.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public Users findUserById(Long id) {
        return userRepo.findById(id).get();
    }
}
