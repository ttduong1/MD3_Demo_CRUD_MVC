package navbar;

import config.Config;
import model.Product;
import service.Service;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Product> productList = new ArrayList<>();
    public static void main(String[] args) {
        productList.add(new Product(10,"name1",12,100,"abc","pink"));
        productList.add(new Product(11,"name2",12,100,"abc","pink"));
        productList.add(new Product(12,"name3",12,100,"abc","pink"));
        productList.add(new Product(13,"name4",12,100,"abc","pink"));
        int choice;
        do {
            System.out.println("1. Show all product list.");
            System.out.println("2. Add product.");
            System.out.println("3. Edit product.");
            System.out.println("4. Delete product.");
            System.out.println("0. End.");
            choice = Config.getScanner().nextInt();
            switch (choice){
                case 1:
                    System.out.println(productList);
                    break;
                case 2:
                    Service.addProduct();
                    break;
                case 3:
                    Service.editProduct();
                    break;
                case 4:
                    Service.deleteById();
                    break;
            }
        }while (choice != 0);
    }
}