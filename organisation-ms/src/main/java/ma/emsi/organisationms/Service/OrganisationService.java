package ma.emsi.organisationms.Service;

import ma.emsi.organisationms.DAO.Organisation;

import java.util.List;

public interface OrganisationService {
    public List<Organisation> getAllOrganisations();
    public Organisation createOrganisation(Organisation org);
    public void deleteOrganisationById(Long id);
    public Organisation findOrganisationById(Long id);
}
