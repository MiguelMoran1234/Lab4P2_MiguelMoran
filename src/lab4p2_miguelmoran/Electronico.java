/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;


public class Electronico extends Producto{
    
    private int garantia;
    private final double impuesto = 1.1;

    public Electronico(int garantia, String nombre, String proveedor, double precio) {
        super(nombre, proveedor, precio);
        this.garantia = garantia;
    }

    @Override
    public double getPrecioTotal(double precio) {
        return precio*impuesto;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + " | proveedor: " + proveedor +  " | precio: " + precio + " | garantia:" + garantia + " | impuesto: " + impuesto;
    }
    
    
    
}
