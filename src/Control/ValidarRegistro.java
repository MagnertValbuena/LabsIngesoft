/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Sistema;
import Entidad.Usuario;
import Frontera.FramePrincipal;
import java.util.ArrayList;

/**
 *
 * @author Magnert
 */
public class ValidarRegistro{
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    boolean validar = true;
    private Sistema sistema = FramePrincipal.sistema;
    public ValidarRegistro(){}
    public String verificarRegistro(Usuario usuario, String password2){
        if(!verificarLongitudNombre(usuario.getNombre())){
            return("Longitud Nombre Incorrecta");
        }
        if(!verificarLongitudPassword(usuario.getPassword())){
            return("Longitud Password Incorrecta");
        }
        for(Usuario u: sistema.getUsuarios()){
            if(u.getNombre().equals(usuario.getNombre())){
                return("El nombre ya esta en uso");
            }
        }
        if(!verificarIgualdadCampos(usuario.getPassword(), password2)){
            return("Las contraseñas no coinciden");
        }
        usuarios.add(usuario);
        sistema.setUsuarios(usuarios);
        return("Usuario registrado");
    }
    public boolean verificarLongitudNombre(String nombre){
        return(nombre.length()>1 && nombre.length() <=6);
    }
    public boolean verificarLongitudPassword(String password){
        return(password.length()>=3 && password.length() <6);
    }
    public boolean verificarIgualdadCampos(String password1, String password2){
        return(password1.equals(password2));
    }
}
