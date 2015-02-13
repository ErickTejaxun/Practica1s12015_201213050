/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombis;

import Estructuras.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Erick
 */
public class MenuJZombis extends javax.swing.JFrame {

    /**
     * Creates new form MenuJPlanta
     */
    public Lista_jugadores listajugadores;
    public Lista_atributo listaatributo;
    public MenuJZombis() {
        listajugadores=new Lista_jugadores();
        listaatributo=new Lista_atributo();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        boton_agregarcampos = new javax.swing.JButton();
        boton_validar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PlantasVsZombis 1.0.0");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jLabel1.setText("Datos Jugador Planta");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 260, 40);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 70, 70, 30);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel3.setText("No. Personajes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 120, 30);

        txtnombre.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        getContentPane().add(txtnombre);
        txtnombre.setBounds(150, 60, 190, 30);

        txtnumero.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        getContentPane().add(txtnumero);
        txtnumero.setBounds(150, 110, 190, 30);

        boton_agregarcampos.setText("Agregar Campos");
        boton_agregarcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarcamposActionPerformed(evt);
            }
        });
        getContentPane().add(boton_agregarcampos);
        boton_agregarcampos.setBounds(20, 150, 140, 40);

        boton_validar.setText("Hecho");
        boton_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_validarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_validar);
        boton_validar.setBounds(170, 150, 170, 40);

        setBounds(0, 0, 470, 308);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_validarActionPerformed
//    this.show(false);
        String nombre_jugador=txtnombre.getText();
        int numero_personajes=Integer.valueOf(txtnumero.getText());
        String tipo_jugador="Zombie";
        nodo_jugador nuevo= new nodo_jugador(nombre_jugador,numero_personajes,tipo_jugador);
        PlantasvsZombis.jugadores.insertar(nuevo);
        nuevo.atributos=listaatributo;     
        listaatributo=null;       
        JOptionPane.showMessageDialog(this, "Jugador Planta Creado");
        this.show(false);
        
    }//GEN-LAST:event_boton_validarActionPerformed

    private void boton_agregarcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarcamposActionPerformed
  
    String nombre_campo=JOptionPane.showInputDialog("Ingrese el nombre del campo");
    String campo=JOptionPane.showInputDialog(nombre_campo);
    
    nodo_atributo nuevo=new nodo_atributo(nombre_campo,campo);
    listaatributo.insertar(nuevo);
    
    }//GEN-LAST:event_boton_agregarcamposActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuJZombis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJZombis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJZombis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJZombis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJZombis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregarcampos;
    private javax.swing.JButton boton_validar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
