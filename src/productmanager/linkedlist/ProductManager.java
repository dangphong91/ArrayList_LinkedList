package productmanager.linkedlist;

import product.*;

import java.util.*;

public class ProductManager {
    LinkedList<Product> products;
    public ProductManager() {
        this.products = new LinkedList<>();
    }
    public void add(Product item) {
        products.add(item);
    }
    public void setProduct(int id, String name, long price) {
        for (Product product:
                products) {
            if(product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
            }
        }

    }
    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public void search(String name) {
        System.out.println("Search product:");
        boolean search = false;
        for (Product product:
                products) {
            if (product.getName() == name) {
                System.out.println(product);
                search = true;
            }
        }
        if (!search) {
            System.out.println("No Product !!!");
        }
    }

    public void sortProduct() {
        SortPrice sortPrice = new SortPrice();
        Collections.sort(products,sortPrice);
        System.out.println("Sort Price");
        for (Product product:
                products) {
            System.out.println(product);
        }
    }

    public void reverseProduct() {
        SortPrice sortPrice = new SortPrice();
        Collections.sort(products,sortPrice);
        Collections.reverse(products);
        System.out.println("Reverse Price");
        for (Product product:
                products) {
            System.out.println(product);
        }
    }

    @Override
    public String toString() {
        System.out.println("ProductManager");
        String print = "";
        for (Product product:
                products) {
            print+= product + "\n";
        }
        return print;
    }
}
