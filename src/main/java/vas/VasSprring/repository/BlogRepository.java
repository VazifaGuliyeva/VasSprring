package vas.VasSprring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vas.VasSprring.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
