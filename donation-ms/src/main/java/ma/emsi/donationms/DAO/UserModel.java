package ma.emsi.donationms.DAO;

import lombok.Data;

@Data
public class UserModel {
    private Long id;
    private String fullName;
    private String email;
    private int phone;
}
