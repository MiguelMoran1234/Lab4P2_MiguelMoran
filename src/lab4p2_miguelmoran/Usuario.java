/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_miguelmoran;

import java.util.ArrayList;

public abstract class Usuario {
    
    private String usuario;
    protected ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public abstract void Menu();

    @Override
    public String toString() {
        return usuario;
    }
    
}
