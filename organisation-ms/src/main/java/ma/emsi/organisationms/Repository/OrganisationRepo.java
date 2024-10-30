package ma.emsi.organisationms.Repository;

import ma.emsi.organisationms.DAO.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationRepo extends JpaRepository<Organisation, Long> {
}
