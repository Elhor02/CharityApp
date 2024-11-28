package ma.emsi.donationms.DAO;

import lombok.Data;

@Data
public class OrganisationModel {
    private Long organizationId;
    private String name;
    private String description;
    private String type;
    private String registrationNumber;
}
