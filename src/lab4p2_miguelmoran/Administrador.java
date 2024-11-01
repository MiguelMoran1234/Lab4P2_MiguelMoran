/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;

import java.util.Scanner;

public class Administrador extends Usuario {

    Scanner sc = new Scanner(System.in);

    public Administrador(String usuario) {
        super(usuario);
    }

    @Override
    public void Menu() {
        boolean seguir = true;
        while (seguir) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver Productos");
            System.out.println("3. Registrar Cliente");
            System.out.println("4. Ver Clientes");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("1. Agregar Electronico");
                    System.out.println("2. Agregar Ropa");
                    System.out.println("3. Agregar Comida");
                    opcion = sc.nextInt();
                }
                case 2 -> {
                    System.out.println("1. Listar Todos");
                    System.out.println("2. Listar por tipo");
                    opcion = sc.nextInt();
                }
                case 3 -> {
                    System.out.print("Ingrese nombre de usuario del nuevo cliente: ");
                    String nombre = sc.next();
                    Cliente cliente = new Cliente(nombre);
                    usuarios.add(cliente);
                }
                case 4 -> {
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println((i + 1) + ". " + usuarios.get(i).toString());
                    }
                }
            }
        }
    }

}
