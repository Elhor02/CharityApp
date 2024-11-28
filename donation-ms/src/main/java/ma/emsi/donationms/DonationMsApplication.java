package ma.emsi.donationms;

import ma.emsi.donationms.DAO.Donation;
import ma.emsi.donationms.DAO.OrganisationModel;
import ma.emsi.donationms.DAO.UserModel;
import ma.emsi.donationms.Repository.DonationRepo;
import ma.emsi.donationms.Service.OrganisationModelRestClient;
import ma.emsi.donationms.Service.UserModelRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DonationMsApplication implements CommandLineRunner {
    @Autowired
    OrganisationModelRestClient orgRest;
    @Autowired
    UserModelRestClient usrRest;
    @Autowired
    DonationRepo donationRepo;

    public static void main(String[] args) {
        SpringApplication.run(DonationMsApplication.class, args);
    }
    //userid152  6
    @Override
    public void run(String... args) throws Exception {
        UserModel user = usrRest.getUserById(152);
        OrganisationModel orga = orgRest.getOrganisationById(1);
        Donation donation = donationRepo.save(Donation.builder()
                .userId(user.getId())
                .organisationId(orga.getOrganizationId())
                .amount(100.0)
                .org(orga)
                .usr(user)
                .build());
    }
}
