package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
    List<Product> products= new ArrayList<>(  Arrays.asList(
            new Product(101,"IPhone", 50000),
            new Product(102,"Canon Camera", 40000),
            new Product(103,"Shure Mic", 30000)
    ));
    public List<Product> getProducts(){
        return products;
    }
    public Product getProductById(int prodId){
        return products.stream().filter(t -> t.getProdId()==prodId).findFirst()
                .orElse(new Product(0,"No Product",0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int prodId, Product product) {
        for (int i = 0; i < products.size(); i++) {
            Product t = products.get(i);
            if (t.getProdId() == prodId) {
                products.set(i, product);
                return;
            }
        }
    }

    public void deleteProduct(int prodId) {
        products.removeIf(t -> t.getProdId() == prodId);
    }

}
