    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica.dos.main.clases;

/**
 *
 * @author davidvargas
 */
public class Factura {

    public static String getTotalFacturas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static String getTotalIngresos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
private String numero;
private Cliente cliente;
private Empleado empleado;
private double total;

// Constructor
public Factura(String numero, Cliente cliente, Empleado empleado, double total) {
    this.numero = numero;
    this.cliente = cliente;
    this.empleado = empleado;
    this.total = total;
}

// Getters y Setters
public String getNumero() {
    return numero;
}

public void setNumero(String numero) {
    this.numero = numero;
}

public Cliente getCliente() {
    return cliente;
}

public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}

public Empleado getEmpleado() {
    return empleado;
}

public void setEmpleado(Empleado empleado) {
    this.empleado = empleado;
}

public double getTotal() {
    return total;
}

public void setTotal(double total) {
    this.total = total;
}
}
