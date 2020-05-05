package kg.tune.RCT_Project.controller;

import kg.tune.RCT_Project.entity.RestarauntNavat;
import kg.tune.RCT_Project.service.CinemaBroadwayService;
import kg.tune.RCT_Project.service.RestarauntNavatService;
import kg.tune.RCT_Project.service.TicketonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.sun.tools.javac.jvm.ByteCodes.ret;

@RestController
@RequestMapping("/book")
public class FactoryController {
    @Autowired
    RestarauntNavatService restarauntNavatService;

    @GetMapping
    public List<RestarauntNavat> getAll() {
        save();
        return restarauntNavatService.getAll();
    }

    public RestarauntNavat save() {
        return restarauntNavatService.save(RestarauntNavat.getRestarauntNavat());
    }

    @GetMapping("/{value}")
    public RestarauntNavat getNavat(@PathVariable("value") String value) {
        ret
    }
}
