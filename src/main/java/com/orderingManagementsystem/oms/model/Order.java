package com.orderingManagementsystem.oms.model;

import java.util.List;

public class Order {
    private String id;
    private User user;
    private List<Product> productList;
    private double totalPrice;

    public Order() {
    }

    public Order(String id) {
        this.id = id;
    }

    public Order(String id, User user, List<Product> productList, double totalPrice) {
        this.id = id;
        this.user = user;
        this.productList = productList;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
