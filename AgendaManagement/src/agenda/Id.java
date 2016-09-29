package agenda;

import java.util.Comparator;

/**
 * @author paul.swapnil
 */
public class Id implements Comparator<Id>, Comparable<Id> {

    public String name;
    public String lastName;
    public String cap;
    public String address;
    public String city;

    public Id(String name, String lastName, String cap, String address, String city) {
        this.name = name;
        this.lastName = lastName;
        this.cap = cap;
        this.address = address;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return name + lastName + cap + address + city;
    }

    @Override
    public int compare(Id o1, Id o2) {
        return o1.name.compareToIgnoreCase(o2.name);
    }

    @Override
    public int compareTo(Id o) {
        return this.name.compareToIgnoreCase(o.name);
    }

}
