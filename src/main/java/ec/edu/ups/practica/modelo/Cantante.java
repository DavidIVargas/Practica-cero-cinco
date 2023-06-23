/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.modelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */

public class Cantante extends Persona {
    private String nombreArtistico;
    private String generoMusical;
    private int numeroDeSencillos;
    private int numeroDeConciertos;
    private int numeroDeGiras;
    private Disco[] discografia;

    public Cantante(int codigo, String nombre, int edad, String nacionalidad, double salario, String nombreArtistico,
            String generoMusical) {
        super(codigo, nombre, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
    }

    public void agregarDisco(int codigo, String nombre, int anioDeLanzamiento) {
        // Implementar la lógica para agregar un disco al arreglo discografia
    }

    @Override
    public double calcularSalario() {
        // Implementar la lógica para calcular el salario final del cantante según las condiciones especificadas
        return 0.0;
    }
}
