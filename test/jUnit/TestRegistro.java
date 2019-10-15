/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jUnit;

import Control.ValidarRegistro;
import Entidad.Usuario;
import static Frontera.FramePrincipal.sistema;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Magnert
 */
public class TestRegistro {
    
    private static ValidarRegistro validarregistro = new ValidarRegistro();
    
    private String LONG_NOMBRE_INCORRECTA = "Longitud Nombre Incorrecta";
    private String LONG_PASSWORD_INCORRECTA = "Longitud Password Incorrecta";
    private String NOMBRE_EN_USO = "El nombre ya esta en uso";
    private String CONTRASENA_NO_COINCIDE = "Las contraseñas no coinciden";
    private String USUARIO_AUTORIZADO = "Usuario registrado";
    
    public TestRegistro() {
    }
    
    @BeforeClass
    public static void setUpClass(){
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        Usuario c = new Usuario();
        a.setNombre("Juan");
        a.setPassword("1234");
        b.setNombre("Pedro");
        b.setPassword("123");
        c.setNombre("Maria");
        c.setPassword("12345");
        usuarios.add(a);
        usuarios.add(b);
        usuarios.add(c);
        sistema.setUsuarios(usuarios);
        for(Usuario u: sistema.getUsuarios()){
            System.out.println(u.getNombre());
            System.out.println(u.getPassword());
            System.out.println("------------");
        }
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown(){
    }
    
    @Test
     public void testLongitudNombre(){
         Usuario u = new Usuario();
         u.setNombre("R");
         u.setPassword("123456");
         assertEquals(validarregistro.verificarRegistro(u, u.getPassword()), LONG_NOMBRE_INCORRECTA);
         
         u.setNombre("Roberto");
         u.setPassword("123456");
         assertEquals(validarregistro.verificarRegistro(u, u.getPassword()), LONG_NOMBRE_INCORRECTA);    
     }
     
    @Test
     public void testLongitudContrasenia(){
         Usuario u = new Usuario();
         u.setNombre("Pepe");
         u.setPassword("12");
         assertEquals(validarregistro.verificarRegistro(u, u.getPassword()), LONG_PASSWORD_INCORRECTA);
         
         u.setNombre("Pepe");
         u.setPassword("123456");
         assertEquals(validarregistro.verificarRegistro(u, u.getPassword()), LONG_PASSWORD_INCORRECTA); 
     } 
     
    @Test
     public void testNombreEnUso(){
         Usuario u = new Usuario();
         u.setNombre("Juan");
         u.setPassword("1234");
         assertEquals(validarregistro.verificarRegistro(u, u.getPassword()), NOMBRE_EN_USO);
     }  
     
    @Test
     public void testContrasenaNoCoincide(){
         Usuario u = new Usuario();
         u.setNombre("Pepe");
         u.setPassword("1234");
         assertEquals(validarregistro.verificarRegistro(u, "1235"), CONTRASENA_NO_COINCIDE); 
     }
     
    @Test
     public void testTodoCorrecto(){
         Usuario u = new Usuario();
         u.setNombre("Stevan");
         u.setPassword("1234");
         assertEquals(validarregistro.verificarRegistro(u, u.getPassword()), USUARIO_AUTORIZADO); 
     } 
}
