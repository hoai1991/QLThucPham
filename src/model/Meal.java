/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hoai
 */
public class Meal extends Product{
    String type,date;

    public Meal() {
    }

    public Meal(String id, String name, int sl, double price) {
        super(id, name, sl, price);
    }
    
}
