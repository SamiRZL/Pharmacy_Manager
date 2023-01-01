package com.example.pharmacy_manager;

public interface SalesDaoIntrf {

    public void addSales( String name, int unites, int total, String date);
    public void updateSalesById(int id,  String name, int unites, int total, String date);
    public void deleteSalesById(int id);
    public void showSalesById(int id);
}
