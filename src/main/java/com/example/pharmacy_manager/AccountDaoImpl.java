package com.example.pharmacy_manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDaoIntrf {

    static Connection con = DBconnection.createDBconnection();
    static PreparedStatement statement = null;
    static ResultSet resultSet = null;




    @Override
    public void addAccount( String name, String lastname, String job, String username , String password){
        String query = "insert into account(name, lastname, job, username, password) values(?, ?, ?, ?, ?)";
        try {
            PreparedStatement  statement = con.prepareStatement(query);

            statement.setString(1, name);
            statement.setString(2, lastname);
            statement.setString(3, job);
            statement.setString(4, username);
            statement.setString(5, password);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public  void updateAccountById(int id, String name, String lastname, String job, String username, String password){

        String query = "update account set name = ?, lastname = ?, job = ?, age = ?, phoneNbr = ?, where id = ?";
        try {
            PreparedStatement  statement = con.prepareStatement(query);

            statement.setString(1, name);
            statement.setString(2, lastname);
            statement.setString(3, job);
            statement.setString(4, username);
            statement.setString(5, password);
            statement.setInt(6, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public  void deleteAccountById(int id){
        String query = "delete from account where id = ?";
        try {
            statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showAccountById(int id) {
        String query = "select * from account where id = ?";
        try{
            statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
