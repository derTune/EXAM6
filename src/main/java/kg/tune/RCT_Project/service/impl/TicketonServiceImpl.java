package kg.tune.RCT_Project.service.impl;

import kg.tune.RCT_Project.entity.Ticketon;
import kg.tune.RCT_Project.repo.TicketonRepo;
import kg.tune.RCT_Project.service.TicketonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketonServiceImpl implements TicketonService {
    @Autowired
    TicketonRepo ticketonRepo;

    @Override
    public Ticketon save(Ticketon ticketon) {
        return ticketonRepo.save(ticketon);
    }

    @Override
    public List<Ticketon> getAll() {
        return ticketonRepo.findAll();
    }
}
