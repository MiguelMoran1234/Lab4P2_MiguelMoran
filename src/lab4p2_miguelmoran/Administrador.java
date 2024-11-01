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
            System.out.print("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("1. Agregar Electronico");
                    System.out.println("2. Agregar Ropa");
                    System.out.println("3. Agregar Comida");
                    System.out.print("Ingrese una opcion: ");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1 -> {
                            AgregarElectronico();
                        }
                        case 2 -> {
                            AgregarRopa();
                        }
                        case 3 -> {
                            AgregarComida();
                        }
                    }
                }
                case 2 -> {
                    System.out.println("1. Listar Todos");
                    System.out.println("2. Listar por tipo");
                    System.out.print("Ingrese una opcion: ");
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

    public void AgregarElectronico() {
        System.out.print("Ingrese nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese proveedor: ");
        String proveedor = sc.next();
        System.out.print("Ingrese precio: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese garantia: ");
        int garantia = sc.nextInt();
        Electronico electronico = new Electronico(garantia, nombre, proveedor, precio);
        electronico.getProductos().add(electronico);
    }

    public void AgregarRopa() {
        System.out.print("Ingrese nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese proveedor: ");
        String proveedor = sc.next();
        System.out.print("Ingrese precio: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese talla: ");
        String talla = sc.next();
        Ropa ropa = new Ropa(talla, nombre, proveedor, precio);
        ropa.getProductos().add(ropa);
    }

    public void AgregarComida() {
        System.out.print("Ingrese nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese proveedor: ");
        String proveedor = sc.next();
        System.out.print("Ingrese precio: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese fecha de caducidad: ");
        String fecha = sc.next();
        Comida comida = new Comida(fecha, nombre, proveedor, precio);
        comida.getProductos().add(comida);
    }

    public void ListarProductos() {
        Electronico electronico = new Electronico(0, "", "", 0);
        for (int i = 0; i < electronico.getProductos().size(); i++) {
            if (electronico.getProductos().get(i) instanceof Electronico) {
                System.out.println((i + 1) + ". " + electronico.getProductos().get(i).toString());
            }
            if (electronico.getProductos().get(i) instanceof Ropa) {
                System.out.println((i + 1) + ". " + electronico.getProductos().get(i).toString());
            }
            if (electronico.getProductos().get(i) instanceof Comida) {
                System.out.println((i + 1) + ". " + electronico.getProductos().get(i).toString());
            }
        }
    }
    
    public void ListarporTipos() {
        Electronico electronico = new Electronico(0, "", "", 0);
        for (int i = 0; i < electronico.getProductos().size(); i++) {
            if (electronico.getProductos().get(i) instanceof Electronico) {
                System.out.println(electronico.getProductos().get(i).toString());
            }
        }
        for (int i = 0; i < electronico.getProductos().size(); i++) {
            if (electronico.getProductos().get(i) instanceof Ropa) {
                System.out.println(electronico.getProductos().get(i).toString());
            }
        }
        for (int i = 0; i < electronico.getProductos().size(); i++) {
            if (electronico.getProductos().get(i) instanceof Comida) {
                System.out.println(electronico.getProductos().get(i).toString());
            }
        }   
    }
}
