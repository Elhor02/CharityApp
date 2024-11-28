package ma.emsi.donationms.Service;

import ma.emsi.donationms.DAO.UserModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-ms")
public interface UserModelRestClient {
    @GetMapping("/users/getUserById/{id}")
    UserModel getUserById(@PathVariable long id);
}
