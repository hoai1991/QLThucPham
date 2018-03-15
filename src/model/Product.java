/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Product {
    String id,name;
    int sl;
    double price;

    public Product(String id, String name, int sl, double price) {
        this.id = id;
        this.name = name;
        this.sl = sl;
        this.price = price;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSl() {
        return sl;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void display(){
        System.out.println("ID: "+id+" ,Name: "+name+" ,So luong: "+sl+" ,Gia: "+price);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID:");
        id = sc.nextLine();
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap so luong:");
        sl = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia:");
        price = Double.parseDouble(sc.nextLine());               
    }
}
