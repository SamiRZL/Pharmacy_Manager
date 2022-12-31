package com.example.pharmacy_manager;

import java.sql.*;


public class LoginPage {

    private JFrame frame;
    static Connection con = DBconnection.createDBconnection();
    static PreparedStatement statement = null;
    static ResultSet resultSet = null;

    String username = edtUsername.getText();
    String password = edtPassword.getText();

    {

    String query = " select username, password from account where username='" + username + "' and password='" + password + "'";

        try {
            statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery(query);

            if (rs.next()) {
                String job = resultSet.getString("job");
                dispose();
                DashBoardPage dbPage = new DashBoardPage();
                dbPage.setVisible(true);
                if (job == "vendor") {

                }
            }else {
                errorLabel.setText("Username or password entered is wrong");
                edtUsername.setText(" ");
                edtPassword.setText(" ");
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
