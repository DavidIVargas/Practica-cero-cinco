/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.dao;

import ec.edu.ups.practica.idao.IDAO;
import ec.edu.ups.practica.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */

public class PersonaDAO implements IDAO<Persona> {
    private List<Persona> personas;

    public PersonaDAO() {
        personas = new ArrayList<>();
    }

    @Override
    public void guardar(Persona persona) {
        personas.add(persona);
    }

    @Override
    public void eliminar(Persona persona) {
        personas.remove(persona);
    }

    @Override
    public Persona obtener(int id) {
        for (Persona persona : personas) {
            if (persona.getCodigo() == id) {
                return persona;
            }
        }
        return null;
    }

    @Override
    public List<Persona> obtenerTodos() {
        return personas;
    }
}

