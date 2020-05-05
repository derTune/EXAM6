package kg.tune.RCT_Project.service;

import kg.tune.RCT_Project.entity.Ticketon;

import java.util.List;

public interface TicketonService {
    Ticketon save(Ticketon ticketon);
    List<Ticketon> getAll();
}
