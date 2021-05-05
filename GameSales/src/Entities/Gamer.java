package Entities;

import Abstract.Entity;

public class Gamer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private int yearOfBith;

    public Gamer(){

    }

    public Gamer(int id, String firstName, String lastName, String nationalityId, int yearOfBith){
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.yearOfBith = yearOfBith;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public int getYearOfBith() {
        return yearOfBith;
    }
}
