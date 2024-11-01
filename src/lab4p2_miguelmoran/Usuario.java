/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;


public abstract class Usuario {
    String usuario;

    public Usuario(String usuario) {
        this.usuario = usuario;
    }
    
    public abstract void Menu();
}
