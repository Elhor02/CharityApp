package ma.emsi.donationms.Repository;

import ma.emsi.donationms.DAO.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface DonationRepo extends JpaRepository<Donation, Long> {
}
