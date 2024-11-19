package ma.emsi.organisationms.userms;

import ma.emsi.organisationms.userms.Service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserMsApplication {
    public static void main(String[] args) {

        SpringApplication.run(UserMsApplication.class, args);
    }
}
