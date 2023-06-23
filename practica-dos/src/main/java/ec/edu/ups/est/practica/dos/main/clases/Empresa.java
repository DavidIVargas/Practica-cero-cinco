/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica.dos.main.clases;

/**
 *
 * @author davidvargas
 */
// Clase Empresa
public class Empresa {
    private String ruc;
    private String razonSocial;
    
    // Constructor
    public Empresa(String ruc, String razonSocial) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
    }
    
    // Getters y Setters
    public String getRuc() {
        return ruc;
    }
    
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
    public String getRazonSocial() {
        return razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void agregarEmpleado(Empleado empleado1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTotalEmpleados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

