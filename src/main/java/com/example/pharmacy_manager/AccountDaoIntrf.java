package com.example.pharmacy_manager;

public interface AccountDaoIntrf {

    public void addAccount(String name, String lastname, String job, int age, int phoneNbr);
    public void updateAccountById(int id, String name, String lastname, String job, int age, int phoneNbr);
    public void deleteAccountById(int id);
    public void showAccountById(int id);
}
