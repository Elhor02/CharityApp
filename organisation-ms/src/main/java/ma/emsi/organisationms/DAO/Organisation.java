package ma.emsi.organisationms.DAO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Organisation {
    @Id
    private Long organizationId;
    private String name;
    private String description;
    private String type;
    private String registrationNumber;
}
