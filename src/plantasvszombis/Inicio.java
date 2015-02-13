/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombis;

import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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
        jPanel1 = new javax.swing.JPanel();
        boton_limpiar = new javax.swing.JButton();
        boton_comenzarjuego = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boton_crearJP = new javax.swing.JButton();
        boton_crearJZ = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PlantasVsZombis 1.0.0");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel1.setText("Plantas Vs Zombis USAC versión");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 380, 80);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        boton_limpiar.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        boton_limpiar.setText("Eliminar Datos");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_limpiar);
        boton_limpiar.setBounds(20, 100, 150, 29);

        boton_comenzarjuego.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        boton_comenzarjuego.setText("Iniciar Juego");
        boton_comenzarjuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_comenzarjuegoActionPerformed(evt);
            }
        });
        jPanel1.add(boton_comenzarjuego);
        boton_comenzarjuego.setBounds(20, 60, 150, 29);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel4.setText("Opiones de Juego");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 10, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 120, 180, 140);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        boton_crearJP.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        boton_crearJP.setText("Planta");
        boton_crearJP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearJPActionPerformed(evt);
            }
        });
        jPanel2.add(boton_crearJP);
        boton_crearJP.setBounds(30, 60, 100, 29);

        boton_crearJZ.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        boton_crearJZ.setText("Zombie");
        boton_crearJZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearJZActionPerformed(evt);
            }
        });
        jPanel2.add(boton_crearJZ);
        boton_crearJZ.setBounds(30, 100, 100, 29);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel3.setText("Crear Jugadores");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 10, 130, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 120, 190, 140);

        setBounds(0, 0, 435, 333);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_crearJZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearJZActionPerformed
    MenuJZombis j2=new MenuJZombis();
    j2.show(true);
    }//GEN-LAST:event_boton_crearJZActionPerformed

    private void boton_crearJPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearJPActionPerformed
     MenuJPlanta j1=new MenuJPlanta();
     j1.show(true);
    }//GEN-LAST:event_boton_crearJPActionPerformed

    private void boton_comenzarjuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_comenzarjuegoActionPerformed
        if(PlantasvsZombis.jugadores.vacio()){
        mensaje("No ha creado ningun jugador");
        }else if(PlantasvsZombis.jugadores.raiz.siguiente==null){
                if(PlantasvsZombis.jugadores.raiz.tipo_jugador.equals("Planta")){
                    mensaje("Debe crear al jugador zombi");
                }else{
                    mensaje("Debe crear al jugador Planta");
                }
    
        
        
        }else{
            MenuCreacionPlantas nuevo=new MenuCreacionPlantas();
             nuevo.show(true);
        }
        
        
        
    
    
    
   
    }//GEN-LAST:event_boton_comenzarjuegoActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        PlantasvsZombis.jugadores.vaciar();
    }//GEN-LAST:event_boton_limpiarActionPerformed
     public void mensaje(String mensaje){
    JOptionPane.showMessageDialog(null,mensaje);
    }
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_comenzarjuego;
    private javax.swing.JButton boton_crearJP;
    private javax.swing.JButton boton_crearJZ;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
