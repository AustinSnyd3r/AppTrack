package com.Appy.Appy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Applications")
public class App {
    
    @Id               //id is primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //Auto increment it. 
    private int id;
    private String company;
    private String position;
    private String status;

    public App(){

    }

    //Getters and setters
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
