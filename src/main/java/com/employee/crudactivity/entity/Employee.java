package com.employee.crudactivity.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Entity
@Table(name="employee")
    public class Employee{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "company")
    private String company;

    public Employee (){};//No arg constructor

    public Employee (String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String email) {
        this.company = email;
    }

    @Override
    public String toString() {
        return "Employeee {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}