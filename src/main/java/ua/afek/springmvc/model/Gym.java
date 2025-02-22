package ua.afek.springmvc.model;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="Gym")
public class Gym {

    @Id
    @GeneratedValue
    private int gymId;

    private String name;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private int zip;

    public Gym() { }

    public Gym(int gymId, String name, String street1, String street2, String city, String state, int zip) {
        this.gymId = gymId;
        this.name = name;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Gym(String name, String street1, String street2, String city, String state, int zip) {
        this.name = name;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Gym(Gym aGym) {
        this.gymId = aGym.getGymId();
        this.name = aGym.getName();
        this.street1 = aGym.getStreet1();
        this.street2 = aGym.getStreet2();
        this.city = aGym.getCity();
        this.state = aGym.getState();
        this.zip = aGym.getZip();
    }

    public int getGymId() {
        return gymId;
    }

    public String getName() {
        return name;
    }

    public String getStreet1() {
        return street1;
    }

    public String getStreet2() {
        return street2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public void setGymId(int id) {
        this.gymId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Gym0{" +
                "gymId=" + gymId +
                ", name='" + name + '\'' +
                ", street1='" + street1 + '\'' +
                ", street2='" + street2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
