package com.tony.fullstackapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;

    private String jobTitle;

    private String phoneNumber;

    private String email;

    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String employeeCode;


    // EMPTY CONSTRUCTOR
    public Employee() {
    }


    // SETTERS AND GETTERS


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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }


    @Override
    public String toString() {
        return "Employee [" + "id=" + id + ", name=" + name + ", jobTitle=" + jobTitle + ", phoneNumber=" + phoneNumber + ", " + "email=" + email + ", imageUrl=" + imageUrl + "employeeCode=" + employeeCode + "]";
    }
}
