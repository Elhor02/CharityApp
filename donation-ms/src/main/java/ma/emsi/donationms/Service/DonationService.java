package ma.emsi.donationms.Service;

import ma.emsi.donationms.DAO.Donation;


import java.util.List;

public interface DonationService {
    public List<Donation> getAllDonations();
    public Donation createDonation(Donation org);
    public void deleteDonationById(Long id);
    public Donation findDonationById(Long id);
}
