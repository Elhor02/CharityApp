package ma.emsi.donationms.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import ma.emsi.donationms.DAO.UserModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-ms")
public interface UserModelRestClient {
    @CircuitBreaker(name = "donationCB", fallbackMethod = "fallbackGetUserById")
    @GetMapping("/users/getUserById/{id}")
    public UserModel getUserById(@PathVariable("id") long id);
    default UserModel fallbackGetUserById(long id, Throwable throwable) {
        return new UserModel("Service indisponible pour le moment", id);
    }
}
