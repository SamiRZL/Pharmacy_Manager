package com.example.pharmacy_manager;

public interface ClientDaoIntrf {

    public void addClient(Client client);
    public void updateClientById(int id);
    public void deleteClientById(int id);
    public void showClientById(int id);
}
