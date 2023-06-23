/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica.idao;

import ec.edu.ups.practica.modelo.Compositor;

/**
 *
 * @author ESTUDIANTE
 */

public interface ICompositorDAO extends IPersonaDAO {
    void agregarCompositor(Compositor compositor);
    void eliminarCompositor(int codigo);
    Compositor buscarCompositor(int codigo);
    Compositor[] obtenerTodosLosCompositores();
}
