/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.modelo;

import java.util.Objects;

/**
 *
 * @author davidvargas
 */

public class Cancion {
    private int codigo;
    private String titulo;
    private String letra;
    private double tiempoEnMinutos;

    public Cancion(int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.letra = letra;
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public double getTiempoEnMinutos() {
        return tiempoEnMinutos;
    }

    public void setTiempoEnMinutos(double tiempoEnMinutos) {
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    @Override
    public String toString() {
        return "Cancion [codigo=" + codigo + ", titulo=" + titulo + ", letra=" + letra + ", tiempoEnMinutos="
                + tiempoEnMinutos + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cancion cancion = (Cancion) obj;
        return codigo == cancion.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
