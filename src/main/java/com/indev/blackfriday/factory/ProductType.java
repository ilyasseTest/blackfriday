package com.indev.blackfriday.factory;

import com.indev.blackfriday.enteties.Capsule;
import com.indev.blackfriday.enteties.Machine;
import com.indev.blackfriday.enteties.Product;

public class ProductType {

    public static Product getProduct(String productType, int price){
        Product product = null;
        if("machine".equals(productType)){
            product = new Machine(price);
        }
        if("capsule".equals(productType)){
            product = new Capsule(price);

        }
        return product;
    }
}
