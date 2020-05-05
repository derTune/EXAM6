package kg.tune.RCT_Project.service.impl;

import kg.tune.RCT_Project.entity.RestarauntNavat;
import kg.tune.RCT_Project.repo.RestarauntNavatRepo;
import kg.tune.RCT_Project.service.RestarauntNavatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestarauntNavatServiceImpl implements RestarauntNavatService {
    @Autowired
    RestarauntNavatRepo restarauntNavatRepo;

    @Override
    public RestarauntNavat save(RestarauntNavat restarauntNavat) {
        return restarauntNavatRepo.save(restarauntNavat);
    }

    @Override
    public List<RestarauntNavat> getAll() {
        return restarauntNavatRepo.findAll();
    }
}
