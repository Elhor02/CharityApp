package ma.emsi.organisationms.Controller;

import ma.emsi.organisationms.DAO.Organisation;
import ma.emsi.organisationms.Service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/organisations")
public class OrganisationController {
    @Autowired
    private OrganisationService orgInterface;

    @RequestMapping("/getAllOrganisations")
    public List<Organisation> getAllOrganisations(){
        return orgInterface.getAllOrganisations();
    }

    @RequestMapping("/getOrganisationById")
    public Organisation getOrganisation(Long id){
        return orgInterface.findOrganisationById(id);
    }

    @RequestMapping("/createOrganisation")
    public void createOrganisation(Organisation org){
        orgInterface.createOrganisation(org);
    }

    @RequestMapping("/deleteOrganisation")
    public void deleteOrganisationById(Long id){
        orgInterface.deleteOrganisationById(id);
    }
}
