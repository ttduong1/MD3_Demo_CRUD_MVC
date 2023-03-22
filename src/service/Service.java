package service;

import config.Config;
import model.Product;
import navbar.Main;

public class Service {
    public static Product createPrd(){
        System.out.println("Enter product info: ");
        System.out.println("Enter id: ");
        int id = Config.getScanner().nextInt();
        System.out.println("Enter name: ");
        String name = Config.getScanner().nextLine();
        System.out.println("Enter price: ");
        double price = Config.getScanner().nextDouble();
        System.out.println("Enter quantity: ");
        long quantity = Config.getScanner().nextLong();
        System.out.println("Enter brand: ");
        String brand = Config.getScanner().nextLine();
        System.out.println("Enter color: ");
        String color = Config.getScanner().nextLine();
        return new Product(id,name,price,quantity,brand,color);
    }
    public static void addProduct(){
        Main.productList.add(createPrd());
    }

    public static void editProduct(){
        System.out.println("Enter id of product you want to edit: ");
        int id = Config.getScanner().nextInt();
        int index = findIndexById(id);
        if (index != -1){
            Main.productList.set(index, createPrd());
        }
    }

    public static int findIndexById(int id){
        for (int i = 0; i < Main.productList.size(); i++) {
            if (id == Main.productList.get(i).getId()){
                return i;
            }
        }
        System.out.println("Cannot find this product in list");
        return -1;
    }
    public static void deleteById(){
        System.out.println("Enter id product you want to delete: ");
        int id = Config.getScanner().nextInt();
        int index = findIndexById(id);
        if (index != -1){
            Main.productList.remove(index);
            System.out.println("Delete successfully !");
        }
    }
}
