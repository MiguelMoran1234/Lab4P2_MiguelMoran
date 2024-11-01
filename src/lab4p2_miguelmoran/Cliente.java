/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;

import java.util.Scanner;
import java.util.ArrayList;

public class Cliente extends Usuario{

    Scanner sc = new Scanner(System.in);
    ArrayList<Compra> historial = new ArrayList<>();
    
    public Cliente(String usuario) {
        super(usuario);
    }

    @Override
    public void Menu() {
        boolean seguir = true;
        while(seguir){
            System.out.println("1. Realizar Compra");
            System.out.println("2. Historial de Compras");
            System.out.print("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1 -> {
                    boolean seguir1 = true;
                    ArrayList<Producto> productos = new ArrayList<>();
                    Electronico electronico = new Electronico(0, "", "", 0);
                    while(seguir1){
                        Administrador.ListarProductos();
                        System.out.print("Elija un producto: ");
                        opcion = sc.nextInt();
                        Producto producto = electronico.getProductos().get(opcion);
                        productos.add(producto);
                        System.out.println("Desea seguir comprando?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        System.out.print("Elija una opcion: ");
                        opcion = sc.nextInt();
                        switch(opcion){
                            case 1 -> {
                            }
                            case 2 -> {
                                double subtotal = 0;
                                for (int i = 0; i < productos.size(); i++) {
                                    subtotal += productos.get(i).getPrecio();
                                }
                                double total = 0;
                                for (int i = 0; i < productos.size(); i++) {
                                    total += productos.get(i).getPrecioTotal(productos.get(i).getPrecio());
                                }
                                Compra compra = new Compra(productos, subtotal, total);
                                historial.add(compra);
                                seguir1 = false;
                            }
                            default -> {
                                System.out.println("Elija una opcion valida");
                            }
                        }
                    }
                }
                case 2 -> {
                    
                }
                default -> {
                    System.out.println("Elija una opcion valida");
                }
            }
        }
    }
    
    
}
