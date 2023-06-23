/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica.dos.main.clases;

/**
 *
 * @author davidvargas
 */
// Clase Empleado
public class Empleado {
    private String cedula;
    private String nombre;
    private String direccion;
    private String correoElectronico;
    private double sueldoBruto;
    
    // Constructor
    public Empleado(String cedula, String nombre, String direccion, String correoElectronico, double sueldoBruto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.sueldoBruto = sueldoBruto;
    }
    
    // Getters y Setters
    public String getCedula() {
        return cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    public double getSueldoBruto() {
        return sueldoBruto;
    }
    
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
}
