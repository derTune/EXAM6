package kg.tune.RCT_Project.logic;

import kg.tune.RCT_Project.entity.CinemaBroadway;
import kg.tune.RCT_Project.entity.RestarauntNavat;
import kg.tune.RCT_Project.entity.Ticketon;

public class Factory implements FactoryEnt {
    String value;
    private static Factory instance;

    private Factory() {
        instance = new Factory();
    }

    public FactoryEnt getInstance(String value) {
        if(value.equals('R')) {
            return new RestarauntNavat();
        }
        else if(value.equals('C')) {
            return new CinemaBroadway();
        }
        else if(value.equals('T')) {
            return new Ticketon();
        }
        return null;
    }

    public static Factory getInstance() {
        return instance;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
