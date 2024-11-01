/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;

public abstract class Producto {
    
    private String nombre;
    private String proveedor;
    private String precio;

    public Producto(String nombre, String proveedor, String precio) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio = precio;
    }
    
}
