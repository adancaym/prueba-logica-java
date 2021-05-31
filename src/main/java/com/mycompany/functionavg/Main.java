/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.functionavg;

/**
 *
 * @author AdanC
 */
public class Main {
    
    
    public static void main(String[] args) {
        //ejercisio 2
        Hospital hospital = new Hospital();
        hospital.simular();
    }
    
    
    // ejercicio 1
    private static double avg(int items) {
        double[] values = new double[]{50, 80, 95, 40, 100, 90, 90, 90, 100, 85};
        items = (values.length >= items) ? items : values.length;
        double sum = 0;
        for (var i = 0; i < items; i++) sum += values[i];
        return sum/items;
    }
}
