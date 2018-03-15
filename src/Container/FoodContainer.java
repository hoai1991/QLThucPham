/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Container;

import java.io.File;
import model.*;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class FoodContainer {

    final int max = 100;
    Product[] list = new Product[max];
    int count;

    public FoodContainer() {
        list = new Product[max];
        count = 0;
    }

    public void add(Product p) {
        if (count < max) {
            list[count] = p;
            count++;
        } else {
            System.out.println("Danh sach full");
        }
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            list[i].display();
        }
    }
//     public void remove() {
//        listfood = new Product[100];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap ten do an:");
//        fname = sc.nextLine();
//    }

    public void docfile() {
        File f = new File("data.txt");
        String id, name;
        int sl;
        double price;
        try {
            for (int i = 0; i < f.length(); i++) {
                Product product = list[i];
                Scanner sc = new Scanner(f);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    System.out.println(sc.next());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
