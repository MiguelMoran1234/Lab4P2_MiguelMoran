/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;

import java.util.ArrayList;

public abstract class Producto {
    
    protected String nombre;
    protected String proveedor;
    protected double precio;
    ArrayList<Producto> productos = new ArrayList<>();
    
    public Producto(String nombre, String proveedor, double precio) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public abstract double PrecioTotal(double precio);
    
}
