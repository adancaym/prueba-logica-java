/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.functionavg;

import java.io.Serializable;

/**
 *
 * @author AdanC
 */
public class Paciente implements Serializable{
    protected int gravedad;

    public Paciente(int gravedad) {
        this.gravedad = gravedad;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }
}
