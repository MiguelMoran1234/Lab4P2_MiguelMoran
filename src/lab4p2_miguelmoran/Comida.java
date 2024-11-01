/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;

public class Comida extends Producto{
    
    private String fecha;
    private final double impuesto = 1.05;

    public Comida(String fecha, String nombre, String proveedor, double precio) {
        super(nombre, proveedor, precio);
        this.fecha = fecha;
    }

    @Override
    public double PrecioTotal(double precio) {
        return precio*impuesto;
    }
    
    
    
}
