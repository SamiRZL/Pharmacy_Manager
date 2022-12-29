package com.example.pharmacy_manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDaoImpl implements ProductDaoIntrf{

    static Connection con = DBconnection.createDBconnection();
    static PreparedStatement statement = null;
    static ResultSet resultSet = null;




    @Override
    public void addProduct( String name, int qty, int price, String expDate){
        String query = "insert into product(name, qty, price, expDate) values(?, ?, ?, ?)";
        try {
            PreparedStatement  statement = con.prepareStatement(query);

            statement.setString(1, name);
            statement.setInt(2, qty);
            statement.setInt(3, price);
            statement.setString(4, expDate);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public  void updateProductById(int id, String name, int qty, int price, String expDate){

        String query = "update product set name = ?, qty = ?, price = ?, expDate = ?, where id = ?";
        try {
            PreparedStatement  statement = con.prepareStatement(query);

            statement.setString(1, name);
            statement.setInt(2, qty);
            statement.setInt(3, price);
            statement.setString(4, expDate);
            statement.setInt(5, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public  void deleteProductById(int id){
        String query = "delete from product where id = ?";
        try {
            statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showProductById(int id) {
        String query = "select * from product where id = ?";
        try{
            statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}

