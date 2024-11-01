/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;

import java.util.ArrayList;

public class Compra {
    ArrayList<Producto> productos = new ArrayList<>();
    private double subtotal;
    private double total;

    public Compra(ArrayList<Producto> productos, double subtotal, double total) {
        this.subtotal = subtotal;
        this.total = total;
        this.productos = (ArrayList<Producto>) productos.clone();
    }
    
}
