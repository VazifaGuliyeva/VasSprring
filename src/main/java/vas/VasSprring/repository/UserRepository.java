package vas.VasSprring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vas.VasSprring.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
