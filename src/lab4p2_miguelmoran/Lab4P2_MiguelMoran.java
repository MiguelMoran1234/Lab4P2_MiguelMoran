/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_miguelmoran;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab4P2_MiguelMoran {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Administrador administrador = new Administrador("admin");
        administrador.getUsuarios().add(administrador);
        boolean seguir = true;
        while(seguir){
            System.out.print("Ingrese usuario: ");
            String usuario = sc.next();
        }
    }
    
}
