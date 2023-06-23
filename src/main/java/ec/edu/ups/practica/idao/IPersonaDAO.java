/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica.idao;

import ec.edu.ups.practica.modelo.Persona;

/**
 *
 * @author ESTUDIANTE
 */

public interface IPersonaDAO {
    void agregarPersona(Persona persona);
    void eliminarPersona(int codigo);
    Persona buscarPersona(int codigo);
    Persona[] obtenerTodasLasPersonas();
}
