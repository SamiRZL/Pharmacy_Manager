package com.example.pharmacy_manager;

public interface ProductDaoIntrf {

    public void addProduct( String name, int qty, int price, String expDate);
    public void updateProductById(int id, String name, int qty, int price, String expDate);
    public void deleteProductById(int id);
    public void showProductById(int id);
}
