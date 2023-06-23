/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ESTUDIANTE
 **/

public class Compositor extends Persona {
    private int numeroDeComposiciones;
    private Cancion[] cancionesTop100Billboard;
    private Cantante[] clientes;

    public Compositor(int codigo, String nombre, int edad, String nacionalidad, double salario,
            int numeroDeComposiciones) {
        super(codigo, nombre, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    public void agregarCancion(int codigo, String titulo, String letra, double tiempoEnMinutos) {
        //
    }

    public void agregarCliente(Cantante cliente) {
        //
    }

    @Override
    public double calcularSalario() {
        //
        return 0.0;
    }
}

