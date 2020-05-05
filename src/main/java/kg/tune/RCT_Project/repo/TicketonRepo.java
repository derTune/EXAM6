package kg.tune.RCT_Project.repo;

import kg.tune.RCT_Project.entity.Ticketon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketonRepo extends JpaRepository<Ticketon, Long> {
}
