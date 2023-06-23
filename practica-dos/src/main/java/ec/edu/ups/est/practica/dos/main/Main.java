/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.est.practica.dos.main;

import ec.edu.ups.est.practica.dos.main.clases.Cliente;
import ec.edu.ups.est.practica.dos.main.clases.Empleado;
import ec.edu.ups.est.practica.dos.main.clases.Empresa;
import ec.edu.ups.est.practica.dos.main.clases.Factura;


public class Main {
    public static void main(String[] args) {
        // Crear objetos de prueba
        Empresa empresa1 = new Empresa("123456789", "Empresa1");
        Empresa empresa2 = new Empresa("987654321", "Empresa2");
        
        Empleado empleado1 = new Empleado("11111111", "Empleado1", "Dirección1", "correo1@example.com", 2000.0);
        Empleado empleado2 = new Empleado("22222222", "Empleado2", "Dirección2", "correo2@example.com", 2500.0);
        Empleado empleado3 = new Empleado("33333333", "Empleado3", "Dirección3", "correo3@example.com", 3000.0);
        
        Directivo directivo1 = new Directivo("44444444", "Director1", "Dirección4", "correo4@example.com", 4000.0, "Categoría1");
        Directivo directivo2 = new Directivo("55555555", "Director2", "Dirección5", "correo5@example.com", 4500.0, "Categoría2");
        
        Cliente cliente1 = new Cliente("111111111", "Cliente1", "Dirección6", "correo6@example.com", "1234567890");
        Cliente cliente2 = new Cliente("222222222", "Cliente2", "Dirección7", "correo7@example.com", "9876543210");
        
        Factura factura1 = new Factura("F001", cliente1, empleado1, 100.0);
        Factura factura2 = new Factura("F002", cliente2, empleado2, 150.0);
        Factura factura3 = new Factura("F003", cliente1, empleado3, 200.0);
        
        // Manipular objetos
        empresa1.agregarEmpleado(empleado1);
        empresa1.agregarEmpleado(empleado2);
        empresa2.agregarEmpleado(empleado3);
        
        director1.agregarSubordinado(empleado1);
        director1.agregarSubordinado(empleado2);

        System.out.println(empresa1.getTotalEmpleados() + "Total de empleados en Empresa1: ");
        System.out.println("Total de empleados en Empresa2: " + empresa2.getTotalEmpleados());
        
        System.out.println("Subordinados de Director1: " + director1.getSubordinados());
        System.out.println("Subordinados de Director2: " + director2.getSubordinados());
        
        System.out.println("Total de facturas emitidas: " + Factura.getTotalFacturas());
        System.out.println("Total de ingresos por todas las facturas: " + Factura.getTotalIngresos());
    }
}
