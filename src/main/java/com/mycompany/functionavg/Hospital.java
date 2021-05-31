/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.functionavg;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author AdanC
 */
public class Hospital {

    Queue<Paciente> rojo = new LinkedList();
    Queue<Paciente> amarillo = new LinkedList();
    Queue<Paciente> verde = new LinkedList();

    public void simular() {
        for (var i = 0; i <= 100; i++) {
            pacienteArriba();
        }
        System.out.println(this.getNextPatient());
    }

    public Paciente getNextPatient() {
        if (this.rojo.size() > 0) {
            return this.rojo.poll();
        }
        if (this.amarillo.size() > 0) {
            return this.amarillo.poll();
        }
        return this.verde.poll();
    }

    public void pacienteArriba() {
        Paciente paciente = new Paciente(evaluarPaciente());
        switch (paciente.getGravedad()) {
            case 1: {
                this.verde.add(paciente);
            }
            case 2: {
                this.amarillo.add(paciente);
            }
            case 3: {
                this.rojo.add(paciente);
            }
        }
    }

    public static int evaluarPaciente() {
        return (int) Math.floor(Math.random() * 3 + 1);
    }
}
