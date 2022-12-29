package com.example.pharmacy_manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDaoImpl implements ClientDaoIntrf{

    static Connection con = DBconnection.createDBconnection();
    static PreparedStatement statement = null;
    static ResultSet resultSet = null;




    @Override
    public void addClient( String name, String lastname, int age, double phoneNbr){
        String query = "insert into client(name, lastname, age, phoneNbr) values(?, ?, ?, ?)";
        try {
            PreparedStatement  statement = con.prepareStatement(query);

            statement.setString(1, name);
            statement.setString(2, lastname);
            statement.setInt(3, age);
            statement.setDouble(4, phoneNbr);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public  void updateClientById(int id,String name, String lastname, int age, double phoneNbr){

        String query = "update client set name = ?, lastname = ?, age = ?, phoneNbr = ?, where id = ?";
        try {
            PreparedStatement  statement = con.prepareStatement(query);

            statement.setString(1, name);
            statement.setString(2, lastname);
            statement.setInt(3, age);
            statement.setDouble(4, phoneNbr);
            statement.setInt(5, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public  void deleteClientById(int id){
        String query = "delete from client where id = ?";
        try {
            statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showClientById(int id) {
        String query = "select * from client where id = ?";
        try{
            statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
