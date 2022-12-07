package com.example.pharmacy_manager;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClientDaoImpl implements ClientDaoIntrf{

    Connection con;

    @Override
    public void addClient() {
        con = DBconnection.createDBconnection();
        String query = "insert into client values(?,?,?,?,?)";
       try {
           PreparedStatement pstm = con.prepareStatement(query);
           pstm.setInt(1,idField.getText());
           pstm.setString(1,nameField.getText());
           pstm.setString(1,lastnameField.getText());
           pstm.setInt(1,ageField.getText());
           pstm.setDouble(1,phoneNbrField.getText());
       }catch (Exception ex){
           ex.printStackTrace();
       }

    }

    @Override
    public void updateClientById(int id) {

    }

    @Override
    public void deleteClientById(int id) {

    }

    @Override
    public void showClientById(int id) {

    }
}
