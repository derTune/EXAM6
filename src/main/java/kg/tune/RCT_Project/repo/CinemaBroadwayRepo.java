package kg.tune.RCT_Project.repo;

import kg.tune.RCT_Project.entity.CinemaBroadway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaBroadwayRepo extends JpaRepository<CinemaBroadway, Long> {
}
