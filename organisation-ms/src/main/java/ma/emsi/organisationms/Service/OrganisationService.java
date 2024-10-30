package ma.emsi.organisationms.Service;

import ma.emsi.organisationms.DAO.Organisation;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrganisationService {
    public List<Organisation> getAllOrganisations();
    public void createOrganisation(Organisation org);
    public void deleteOrganisationById(Long id);
    public Organisation findOrganisationById(Long id);
}
