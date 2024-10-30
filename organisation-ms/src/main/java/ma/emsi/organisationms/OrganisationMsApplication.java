package ma.emsi.organisationms;

import ma.emsi.organisationms.DAO.Organisation;
import ma.emsi.organisationms.Repository.OrganisationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrganisationMsApplication implements CommandLineRunner {
    @Autowired
    private OrganisationRepo orgRepo;
    public static void main(String[] args) {
        SpringApplication.run(OrganisationMsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for(long i = 0L; i<10; i++){
            orgRepo.save(new Organisation(i,"a","b","c","d"));
        }
    }
}
