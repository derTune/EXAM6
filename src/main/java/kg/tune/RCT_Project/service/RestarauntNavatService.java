package kg.tune.RCT_Project.service;

import kg.tune.RCT_Project.entity.RestarauntNavat;

import java.util.List;

public interface RestarauntNavatService {
    RestarauntNavat save(RestarauntNavat restarauntNavat);
    List<RestarauntNavat> getAll();
}
