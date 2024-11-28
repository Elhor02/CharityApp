package ma.emsi.donationms.Controller;

import ma.emsi.donationms.DAO.Donation;
import ma.emsi.donationms.Repository.DonationRepo;
import ma.emsi.donationms.Service.OrganisationModelRestClient;
import ma.emsi.donationms.Service.UserModelRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Donations")
public class DonationController {
    @Autowired
    OrganisationModelRestClient orgRest;
    @Autowired
    UserModelRestClient usrRest;
    @Autowired
    DonationRepo donationRepo;

    @GetMapping("/getDonationById/{id}")
    public Donation getDonationById(@PathVariable long id){
        Donation donation = donationRepo.findById(id).get();
        donation.setUsr(usrRest.getUserById(donation.getUserId()));
        donation.setOrg(orgRest.getOrganisationById(donation.getOrganisationId()));
        return donation;
    }
}
