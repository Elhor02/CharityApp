package ma.emsi.donationms.Service;

import ma.emsi.donationms.DAO.OrganisationModel;
import ma.emsi.donationms.DAO.UserModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("organisation-ms")
public interface OrganisationModelRestClient {
        @GetMapping("/organisations/getOrganisationById/{id}")
        OrganisationModel getOrganisationById(@PathVariable long id);
}
