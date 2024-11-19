package ma.emsi.organisationms.Controller;

import ma.emsi.organisationms.DAO.Organisation;
import ma.emsi.organisationms.Service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/getOrganisationById/{id}")
    public Organisation getOrganisation(@PathVariable Long id){
        return orgInterface.findOrganisationById(id);
    }

    @PostMapping("/createOrganisation")
    public Organisation createOrganisation(@RequestBody Organisation org){
        return orgInterface.createOrganisation(org);
    }

    @DeleteMapping("/deleteOrganisationById/{id}")
    public void deleteOrganisationById(@PathVariable Long id){
        orgInterface.deleteOrganisationById(id);
    }
}
