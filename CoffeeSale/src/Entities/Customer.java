package Entities;

import Abstract.Entity;

import java.util.Date;

public class Customer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String nationalityId;

    public Customer(){

    }
    public Customer(int id, String firstName, String lastName, int yearOfBirth, String nationalityId){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.nationalityId = nationalityId;
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }
}
