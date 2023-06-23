/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.idao;

import ec.edu.ups.practica.modelo.Cantante;

/**
 *
 * @author ESTUDIANTE
 */

public interface ICantanteDAO extends IPersonaDAO {
    void agregarCantante(Cantante cantante);
    void eliminarCantante(int codigo);
    Cantante buscarCantante(int codigo);
    Cantante[] obtenerTodosLosCantantes();
}
