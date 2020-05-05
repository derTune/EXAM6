package kg.tune.RCT_Project.entity;

import kg.tune.RCT_Project.logic.FactoryEnt;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "e_cinema")
public class CinemaBroadway implements FactoryEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "capacity")
    Integer capacity;

    @Column(name = "address")
    String address;

    @Column(name = "website")
    String website;

    private static CinemaBroadway instance;

    public CinemaBroadway() {
        instance = new CinemaBroadway();
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public static FactoryEnt getInstance(String value) {
        return instance;
    }
}
