package com.indev.blackfriday;

import com.indev.blackfriday.enteties.Product;
import com.indev.blackfriday.factory.ProductType;

import java.util.HashMap;
import java.util.Map;

public class Company {

    public Map<Product,Integer> stock = new HashMap<Product,Integer>();
    public float sells(String capsule) {
        return 0;
    }

    public void stock(int i, String capsule, int price) {
          stock.put(ProductType.getProduct(capsule,price),i);
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int totalAsserts=0;
        for (Map.Entry<Product,Integer> map: stock.entrySet()) {
            Product product = map.getKey();
           int  quantity = map.getValue();
            totalAsserts += product.gitPrice()*quantity ;
        }
        return totalAsserts;
    }

    public Company blackFriday() {
        return this;
    }
}
