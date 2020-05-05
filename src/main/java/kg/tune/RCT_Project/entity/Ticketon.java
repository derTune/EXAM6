package kg.tune.RCT_Project.entity;

import kg.tune.RCT_Project.logic.FactoryEnt;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "e_ticketon")
public class Ticketon implements FactoryEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "payment_type")
    String paymentType;

    @Column(name = "website")
    String website;

    private static Ticketon instance;

    public Ticketon() {
        instance = new Ticketon();
    }

    public FactoryEnt getInstance() {
        return instance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
