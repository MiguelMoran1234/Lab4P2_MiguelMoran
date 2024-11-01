/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;


public class Ropa extends Producto{
    
    private String talla;
    private final double impuesto = 1.15;

    public Ropa(String talla, String nombre, String proveedor, double precio) {
        super(nombre, proveedor, precio);
        this.talla = talla;
    }

    @Override
    public double getPrecioTotal(double precio) {
        return precio*impuesto;
    }
    
    @Override
    public String toString() {
        return "nombre: " + nombre + " | proveedor: " + proveedor +  " | precio: " + precio + " | talla:" + talla + " | impuesto: " + impuesto;
    }
    
}
