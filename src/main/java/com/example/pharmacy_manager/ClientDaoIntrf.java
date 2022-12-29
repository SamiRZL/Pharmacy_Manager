package com.example.pharmacy_manager;

public interface ClientDaoIntrf {

    public void addClient( String name, String lastname, int age, double phoneNbr);
    public void updateClientById(int id, String name, String lastname, int age, double phoneNbr);
    public void deleteClientById(int id);
    public void showClientById(int id);
}
