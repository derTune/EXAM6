package kg.tune.RCT_Project.service.impl;

import kg.tune.RCT_Project.entity.CinemaBroadway;
import kg.tune.RCT_Project.repo.CinemaBroadwayRepo;
import kg.tune.RCT_Project.service.CinemaBroadwayService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CinemaBroadwayServiceImpl implements CinemaBroadwayService {
    @Autowired
    CinemaBroadwayRepo cinemaBroadwayRepo;

    @Override
    public CinemaBroadway save(CinemaBroadway cinemaBroadway) {
        return cinemaBroadwayRepo.save(cinemaBroadway);
    }

    @Override
    public List<CinemaBroadway> getAll() {
        return cinemaBroadwayRepo.findAll();
    }
}
