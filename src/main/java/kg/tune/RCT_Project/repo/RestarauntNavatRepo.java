package kg.tune.RCT_Project.repo;

import kg.tune.RCT_Project.entity.RestarauntNavat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestarauntNavatRepo extends JpaRepository<RestarauntNavat, Long> {
}
