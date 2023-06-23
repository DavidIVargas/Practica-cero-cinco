/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.modelo;

import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */

public abstract class Persona {
    private int codigo;
    private String nombre;
    private int edad;
    private String nacionalidad;
    private double salario;

    public Persona(int codigo, String nombre, int edad, String nacionalidad, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.salario = salario;
    }

    public abstract double calcularSalario();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona [codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad
                + ", salario=" + salario + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        return codigo == persona.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
