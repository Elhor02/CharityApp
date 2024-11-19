package ma.emsi.organisationms.userms.Repository;

import ma.emsi.organisationms.userms.DAO.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
}
