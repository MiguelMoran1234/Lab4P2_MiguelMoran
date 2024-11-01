/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;

import java.util.Scanner;
import java.util.ArrayList;

public class Cliente extends Usuario{

    public Cliente(String usuario) {
        super(usuario);
    }

    @Override
    public void Menu() {
        boolean seguir = true;
        while(seguir){
            System.out.println("1. Realizar Compra");
            System.out.println("2. Historial de Compras");
        }
    }
    
    
}
