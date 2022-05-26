package com.qlspfileBinary.service;

import com.filenhiphan.Student;
import com.qlspfileBinary.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerProduct implements Manager<Product> {
    private ArrayList<Product> listProduct = new ArrayList<>();
    @Override
    public void add(Product product) {
        listProduct.add(product);
    }

    @Override
    public void show() {
        for (Product product : listProduct) {
            System.out.println(product);
        }
        ;
    }

    @Override
    public Product findByName(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return  product;
            }
        }
        return null;
    }
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
