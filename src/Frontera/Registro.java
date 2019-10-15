/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarRegistro;
import Entidad.Usuario;

/**
 *
 * @author Magnert
 */
public class Registro extends javax.swing.JPanel {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        contrasena = new javax.swing.JLabel();
        validarContrasena = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        contrasenaTF = new javax.swing.JTextField();
        validarContrasenaTF = new javax.swing.JTextField();
        aceptarB = new javax.swing.JButton();

        nombre.setText("Nombre");

        contrasena.setText("Contraseña");

        validarContrasena.setText("Validar Contraseña");

        aceptarB.setText("Aceptar");
        aceptarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addComponent(contrasena)
                            .addComponent(validarContrasena))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreTF, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(contrasenaTF)
                            .addComponent(validarContrasenaTF)))
                    .addComponent(aceptarB))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrasena)
                    .addComponent(contrasenaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validarContrasena)
                    .addComponent(validarContrasenaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aceptarB)
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBActionPerformed
        Usuario usuario = new Usuario();
        usuario.setNombre(nombreTF.getText());
        usuario.setPassword(contrasenaTF.getText());
        ValidarRegistro validar = new ValidarRegistro();
        System.out.println("------------");
        String resultado = validar.verificarRegistro(usuario, validarContrasenaTF.getText());
        System.out.println(resultado);
    }//GEN-LAST:event_aceptarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarB;
    private javax.swing.JLabel contrasena;
    private javax.swing.JTextField contrasenaTF;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JLabel validarContrasena;
    private javax.swing.JTextField validarContrasenaTF;
    // End of variables declaration//GEN-END:variables
}
