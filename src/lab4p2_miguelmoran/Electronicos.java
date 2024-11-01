/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;


public class Electronicos extends Producto{
    
    private int garantia;
    private final double impuesto = 1.1;

    public Electronicos(int garantia, String nombre, String proveedor, String precio) {
        super(nombre, proveedor, precio);
        this.garantia = garantia;
    }
    
    
    
}
