package ma.emsi.donationms.Controller;

import ma.emsi.donationms.DAO.Donation;
import ma.emsi.donationms.Service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Donations")
public class DonationController {
    @Autowired
    private DonationService donInterface;

    @RequestMapping("/getAllDonations")
    public List<Donation> getAllDonations(){
        return donInterface.getAllDonations();
    }

    @RequestMapping("/getDonationById/{id}")
    public Donation getdonation(@PathVariable Long id){
        return donInterface.findDonationById(id);
    }

    @PostMapping("/createDonation")
    public Donation createdonation(@RequestBody Donation org){
        return donInterface.createDonation(org);
    }

    @DeleteMapping("/deleteDonationById/{id}")
    public void deleteDonationById(@PathVariable Long id){
        donInterface.deleteDonationById(id);
    }
}
