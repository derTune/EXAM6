package kg.tune.RCT_Project.service;

import kg.tune.RCT_Project.entity.CinemaBroadway;
import java.util.List;

public interface CinemaBroadwayService {
    CinemaBroadway save(CinemaBroadway cinemaBroadway);
    List<CinemaBroadway> getAll();
}
