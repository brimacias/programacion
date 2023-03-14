package ej2oTrim.Arrays_Bidimensionales.Objetos;

import java.util.Arrays;

public class Arrays_Ej1DeObjetos {
    public static void main(String args[])
    {
        //Producto
//create an array of product object
        Product[] obj = new Product[5] ;

//create & initialize actual product objects using constructor
/*
        Product p0 = new Product(23907,"Dell Laptop");
        Product p1 = new Product(91240,"HP 630");
        Product p2 = new Product(29823,"LG OLED TV");
        Product p3 = new Product(11908,"MI Note Pro Max 9");
        Product p4 = new Product(43590,"Kingston USB");

        obj[0] = p0;
        obj[1] = p1;
        obj[2] = p2;
        obj[3] = p3;
        obj[4] = p4;*/

        obj[0] = new Product(23907,"Dell Laptop");
        obj[1] = new Product(91240,"HP 630");
        obj[2] = new Product(29823,"LG OLED TV");
        obj[3] = new Product(11908,"MI Note Pro Max 9");
        obj[4] = new Product(43590,"Kingston USB");


        //con un for
        /*
        for(int i=0;i< obj.length;i++){
            obj[i]= new Product (i+1,"producto_"+(i+1));
        }

         */

//display the product object data
        System.out.println("Product Object 1:");
        obj[0].display();
        System.out.println("Product Object 2:");
        obj[1].display();
        System.out.println("Product Object 3:");
        obj[2].display();
        System.out.println("Product Object 4:");
        obj[3].display();
        System.out.println("Product Object 5:");
        obj[4].display();

        System.out.println(obj[0].toString());

        //Visualización con for
        System.out.println("Visualización con for:");
        for (int i=0;i<obj.length;i++){
            obj[i].display();
        }

        //Visualización con forEach
        System.out.println("Visualización con forEach:");
        for (Product p:obj){
            p.display();
        }

        //Visualización con clase Arrays
        System.out.println("Visualización con Clase Arrays:");
        System.out.println(Arrays.toString(obj));


        //Cliente

        Customer[] arr = new Customer[2];
        //inicialización Forma1
        arr[0] = new Customer(709270, "Robert");
        arr[1] = new Customer(709219, "Neal");

        //inicialización Forma2
       // Customer[] arr = new Customer[] { new Customer(709270, "Robert"), new Customer(709219, "Neal")} ;

        arr[0].display();
        arr[1].display();
    }
}
//Product class with product Id and product name as attributes
class Product {
    int pro_Id;
    String pro_name;
    //Product class constructor
    Product(int pid, String n) {
        pro_Id = pid;
        pro_name = n;
    }

    public Product() {
    }

    public void display() {
        System.out.print("Product Id = "+pro_Id + "  " + " Product Name = "+pro_name);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Product{" +
                "pro_Id=" + pro_Id +
                ", pro_name='" + pro_name + '\'' +
                '}';
    }
}

class Customer {
    public int id;
    public String name;
    Customer(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void display(){
        System.out.println("Customer id is: " + id + " "
                + "and Customer name is: "
                + name);
    }
}
