package com.qlspfileBinary;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private int id;
    private String brand;
    private double price;

    public Product(String name, int id, String brand, double price) {
        this.name = name;
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
