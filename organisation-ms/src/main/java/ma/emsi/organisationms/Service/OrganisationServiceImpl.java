package ma.emsi.organisationms.Service;

import ma.emsi.organisationms.DAO.Organisation;
import ma.emsi.organisationms.Repository.OrganisationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganisationServiceImpl implements OrganisationService{
    @Autowired
    private OrganisationRepo orgRepo;
    @Override
    public List<Organisation> getAllOrganisations() {
        return orgRepo.findAll();
    }

    @Override
    public Organisation createOrganisation(Organisation org) {
        orgRepo.save(org);
        return org;
    }

    @Override
    public void deleteOrganisationById(Long id) {
        orgRepo.deleteById(id);
    }

    @Override
    public Organisation findOrganisationById(Long id) {
        return orgRepo.findById(id).get();
    }

}

