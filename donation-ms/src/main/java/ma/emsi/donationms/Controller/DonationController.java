package ma.emsi.donationms.Controller;

import ma.emsi.donationms.DAO.Donation;
import ma.emsi.donationms.Repository.DonationRepo;
import ma.emsi.donationms.Service.KafkaSender;
import ma.emsi.donationms.Service.OrganisationModelRestClient;
import ma.emsi.donationms.Service.UserModelRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Donations")
public class DonationController {
    @Autowired
    OrganisationModelRestClient orgRest;
    @Qualifier("ma.emsi.donationms.Service.UserModelRestClient")
    @Autowired
    UserModelRestClient usrRest;
    @Autowired
    DonationRepo donationRepo;
    @Autowired
    private KafkaSender kafkaSenderService;

    @GetMapping("/getDonationById/{id}")
    public Donation getDonationById(@PathVariable long id){
        Donation donation = donationRepo.findById(id).get();
        donation.setUsr(usrRest.getUserById(donation.getUserId()));
        donation.setOrg(orgRest.getOrganisationById(donation.getOrganisationId()));
        return donation;
    }

    @PostMapping("/{donationId}/notify")
    public String notifyDonation(@PathVariable Long donationId, @RequestParam String message) {
        kafkaSenderService.sendMessage(message);
        return "Message sent to Kafka topic for donation ID: " + donationId;
    }
}
