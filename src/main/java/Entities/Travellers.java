package Entities;

import java.util.Objects;

public class Travellers {
    private String numberOfRooms;
    private String numberOfAdults;
    private String numberOfKids;

    public Travellers(String numberOfRooms, String numberOfAdults, String numberOfKids) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfAdults = numberOfAdults;
        this.numberOfKids = numberOfKids;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(String numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public String getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(String numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Travellers that = (Travellers) o;
        return Objects.equals(numberOfRooms, that.numberOfRooms) && Objects.equals(numberOfAdults, that.numberOfAdults) && Objects.equals(numberOfKids, that.numberOfKids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfRooms, numberOfAdults, numberOfKids);
    }

    @Override
    public String toString() {
        return "Travellers{" +
                "numberOfRooms='" + numberOfRooms + '\'' +
                ", numberOfAdults='" + numberOfAdults + '\'' +
                ", numberOfKids='" + numberOfKids + '\'' +
                '}';
    }
}
