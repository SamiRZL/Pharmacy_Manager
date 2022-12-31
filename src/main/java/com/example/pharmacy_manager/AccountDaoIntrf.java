package com.example.pharmacy_manager;

public interface AccountDaoIntrf {

    public void addAccount(String name, String lastname, String job, String username, String password);
    public void updateAccountById(int id, String name, String lastname, String job, String username, String password);
    public void deleteAccountById(int id);
    public void showAccountById(int id);
}
