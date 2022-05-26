package com.qlspfileBinary;

import com.filenhiphan.Student;

import java.util.ArrayList;
import java.util.List;

import static com.qlspfileBinary.service.ManagerProduct.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("bút",1,"anh",10000));
        products.add(new Product("bút1",2,"anh",11000));
        products.add(new Product("bút2",3,"anh",12000));
        writeToFile("product.txt", products);
//        List<Product> studentDataFromFile = readDataFromFile("product.txt");
        for (Product product : readDataFromFile("product.txt")){
            System.out.println(product);
        }
    }
}
