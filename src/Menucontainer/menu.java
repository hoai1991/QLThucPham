/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menucontainer;

import Container.FoodContainer;
import java.util.Scanner;
import model.*;

/**
 *
 * @author hoai
 */
public class menu {

    int choice, id = 0;
    String lc;

    public int menudisplay() {
        System.out.println("Menu");
        System.out.println("=======&=======");
        System.out.println("1. Them san pham");
        System.out.println("2. Hien thi toan bo san pham");
        System.out.println("3. Chinh sua san pham");
        System.out.println("4. Xoa san pham");
        System.out.println("5. Sap xep");
        System.out.println("6. Tim kiem san pham");
        System.out.println("7. Doc file");
        System.out.println("8. Luu file");
        System.out.println("9. Thoat");
        System.out.println("Nhap lua chon cua ban:");
        Scanner sc = new Scanner(System.in);
        choice = 0;
        choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public void suly(){
        FoodContainer them = new FoodContainer();
        Product obj = new Product();
        Scanner sc = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.println("Chon loai thuc pham ban muon them:");
                System.out.println("1. Thit");
                System.out.println("2. Rau");
                System.out.println("3. Ca");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        obj = new Meal();
                        obj.input();
                    case 2:
                        obj = new Vegatable();
                        obj.input();
                    case 3:
                        obj = new Fish();
                        obj.input();
                }
                them.add(obj);
                this.menudisplay();
            case 2:
                them.display();
                this.menudisplay();
            case 3:
                them.display();
                System.out.println("Nhap ID thuc pham muon sua:");
                id = Integer.parseInt(sc.nextLine());
                this.menudisplay();
            case 7:
                them.docfile();
                this.menudisplay();
            case 9:
                System.out.println("Ban co muon thoat!");
                System.out.println("Y/N");
                System.out.println("Lua chon cua ban:");
                lc = sc.nextLine();
                if (lc.equals("y")) {
                    break;
                } else {
                    this.menudisplay();
                }
            default:
                System.out.println("MONG GAP BAN LAN SAU!");
        }
    }
}
