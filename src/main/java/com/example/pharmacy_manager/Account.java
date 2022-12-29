package com.example.pharmacy_manager;

public class Account {

    private int id;
    private String name;
    private String lastname;
    private String job;
    private int age;
    private int phoneNbr;

    public Account(int id, String name, String lastname, String job, int age, int phoneNbr) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.job = job;
        this.age = age;
        this.phoneNbr = phoneNbr;
    }

    public Account(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(int phoneNbr) {
        this.phoneNbr = phoneNbr;
    }
}
