package productmanager.linkedlist;

import product.*;
import productmanager.arr.ProductManager;

public class TestLinkedlist {
    public static void main(String[] args) {
        productmanager.arr.ProductManager phone = new ProductManager();
        Product iphone_5 = new Product(1, "I Phone 5", 3000000);
        Product iphone_6s = new Product(2, "I Phone 6s", 4500000);
        Product iphone_5s = new Product(3, "I Phone 5s", 3500000);
        Product iphone_6 = new Product(4, "I Phone 6", 4000000);
        Product iphone_X = new Product(5, "I Phone X", 10000000);
        phone.add(iphone_5);
        phone.add(iphone_6s);
        phone.add(iphone_5s);
        phone.add(iphone_6);
        phone.add(iphone_X);
        System.out.println(phone);
        phone.setProduct(3,"I phone SE", 5000000);
        System.out.println(phone);
        phone.removeProduct(4);
        System.out.println(phone);
        phone.add(iphone_6);
        System.out.println(phone);
        phone.search("I Phone 6");
        System.out.println();
        phone.sortProduct();
        System.out.println();
        phone.reverseProduct();
    }
}
