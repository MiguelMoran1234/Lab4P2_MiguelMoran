/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;

import java.util.Scanner;
import java.util.ArrayList;

public class Administrador extends Usuario{
    
    Scanner sc = new Scanner(System.in);
    
    public Administrador(String usuario) {
        super(usuario);
    }

    @Override
    public void Menu() {
        boolean seguir = true;
        while(seguir){
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver Productos");
            System.out.println("3. Registrar Cliente");
            System.out.println("4. Ver Clientes");
            int opcion = sc.nextInt();
        }
    }
    
    
}
