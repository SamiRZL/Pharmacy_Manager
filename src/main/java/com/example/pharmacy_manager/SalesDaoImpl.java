package com.example.pharmacy_manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesDaoImpl implements SalesDaoIntrf{

    static Connection con = DBconnection.createDBconnection();
    static PreparedStatement statement = null;
    static ResultSet resultSet = null;




    @Override
    public void addSales(String name, int unites, int total, String date){
        String query = "insert into sales(Product_name, Unites, Total, Date) values(?, ?, ?, ?)";
        try {
            PreparedStatement  statement = con.prepareStatement(query);

            statement.setString(1, name);
            statement.setInt(2, unites);
            statement.setInt(3, total);
            statement.setString(4, date);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public  void updateSalesById(int id,String name, int unites, int total, String date){

        String query = "update product set Product_name = ?, Unites = ?, Total = ?, Date = ?, where Id_sale = ?";
        try {
            PreparedStatement  statement = con.prepareStatement(query);

            statement.setString(1, name);
            statement.setInt(2, unites);
            statement.setInt(3, total);
            statement.setString(4, date);
            statement.setInt(5, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public  void deleteSalesById(int id){
        String query = "delete from sales where Id_sale = ?";
        try {
            statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showSalesById(int id) {
        String query = "select * from sales where Id_sale = ?";
        try{
            statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
