package kg.tune.RCT_Project.logic;

public interface FactoryEnt {
    static FactoryEnt getInstance(String value) {
        return Factory.getInstance();
    }
}
