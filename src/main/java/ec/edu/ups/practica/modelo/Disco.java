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

public class Disco {
    private int codigo;
    private String nombre;
    private int anioDeLanzamiento;

    public Disco(int codigo, String nombre, int anioDeLanzamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

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

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    

    @Override
    public String toString() {
        return "Disco [codigo=" + codigo + ", nombre=" + nombre + ", anioDeLanzamiento=" + anioDeLanzamiento + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Disco disco = (Disco) obj;
        return codigo == disco.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
