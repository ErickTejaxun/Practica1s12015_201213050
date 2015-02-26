/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombis;

import Estructuras.Nodo;
import Estructuras.Personaje;
import Estructuras.nodo_atributo;
import Estructuras.nodo_jugador;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */

public class Graficas extends javax.swing.JFrame {
public String path;
public String direccionBase;
    /**
     * Creates new form Graficas
     */
    public Graficas() {
        initComponents();
        
        
        
            arboljugadores();
            arbolespersonajes();
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        arbol_jugadores = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        arbol_zombis = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        arbol_plantas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        arbol_matriz = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        arbol_personajes = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arbol_jugadores.setText("Arbol de Jugadores");

        jButton1.setText("ver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(arbol_jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(arbol_jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jugadores", jPanel1);

        arbol_zombis.setText("jLabel1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arbol_zombis, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(arbol_zombis, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Zombis", jPanel2);

        arbol_plantas.setText("jLabel1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arbol_plantas, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(arbol_plantas, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Plantas", jPanel3);

        arbol_matriz.setText("jLabel1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arbol_matriz, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(arbol_matriz, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Matriz", jPanel4);

        arbol_personajes.setText("jLabel1");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arbol_personajes, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(arbol_personajes, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Personajes", jPanel5);

        jButton2.setText("Ver Grafica");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jTabbedPane1))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 imprimir1();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
imprimir2();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficas().setVisible(true);
            }
        });
    }
    public void imprimir1(){
                    ImageIcon imagen = new ImageIcon(direccionBase+"\\jugadores.png");
                    ImageIcon imagenredimencionada= new ImageIcon(imagen.getImage().getScaledInstance(arbol_jugadores.getWidth(), arbol_jugadores.getHeight(),0));
                    arbol_jugadores.setIcon(imagenredimencionada);
    }
        public void imprimir2(){
                    ImageIcon imagen = new ImageIcon(direccionBase+"\\arbolpersonajes.png");
                    ImageIcon imagenredimencionada= new ImageIcon(imagen.getImage().getScaledInstance(arbol_personajes.getWidth(), arbol_personajes.getHeight(),0));
                    arbol_personajes.setIcon(imagenredimencionada);
    }

    private void arboljugadores(){
        String texto="";
        path="";
        direccionBase = "C:\\Users\\Erick\\Documents\\NetBeansProjects\\PlantasvsZombis\\Graficas\\";
        
            
            path=direccionBase+"\\arbolesjugadores.txt";
            try{
                FileWriter nuevo=new FileWriter(path);
                nuevo.close();
                JOptionPane.showMessageDialog(null,"Archivo Creado con Exito");
            }catch(IOException | HeadlessException e){
                System.out.println(e);
            }
            File abrir=new File(path);
            
                FileReader lector;
                try{
                    lector=new FileReader(abrir);
                    BufferedReader lee = new BufferedReader(lector);
                    String aux="";
                    nodo_jugador jugadores=PlantasvsZombis.jugadores.raiz;
                    nodo_atributo atributos=jugadores.atributos.raiz;
                        //Recolectamos los datos del primer jugador
                        int numeronodo=1;                       
                        texto+="digraph G{ \n" +
                        " rankidir = LR;\n" +
                        " node[shape = record]; \n" +
                        " rankidir = UD;\n" +
                        " {  rank = same; \n" + 
                        PlantasvsZombis.jugadores.raiz.tipo_jugador+";"+
                        "nodo0[label=\""+PlantasvsZombis.jugadores.raiz.nombre_jugador+"\"];\n" +
                        "nodo1[label=\""+PlantasvsZombis.jugadores.raiz.numero_personajes+"\"];";
                         while(atributos!=null){
                         texto+="nodo"+numeronodo+"[label=\""+atributos.nombre+"\"];\n";
                                 numeronodo++;
                         texto+="nodo"+numeronodo+"[label=\""+atributos.dato+"\"];\n";
                         atributos=atributos.siguiente;
                         numeronodo++;
                         }
                         texto+= PlantasvsZombis.jugadores.raiz.tipo_jugador+" -> nodo0;";
                         for(int g=0;g<(numeronodo-1);g++)
                         {
                             texto+=" nodo"+g+" -> nodo"+(g+1)+";";
                         }
                        //Recolectamos los datos del Segundo jugador
                        numeronodo=1;
                        nodo_atributo atributos2=jugadores.siguiente.atributos.raiz;
                        texto+="\n" + 
                        PlantasvsZombis.jugadores.ultimo.tipo_jugador+";"+
                        "nodos0[label=\""+PlantasvsZombis.jugadores.ultimo.nombre_jugador+"\"];\n" +
                        "nodos1[label=\""+PlantasvsZombis.jugadores.ultimo.numero_personajes+"\"];";
                         while(atributos2!=null){
                         texto+="nodos"+numeronodo+"[label=\""+atributos2.nombre+"\"];\n";
                         numeronodo++;
                         texto+="nodos"+numeronodo+"[label=\""+atributos2.dato+"\"];\n";
                         atributos2=atributos2.siguiente;
                         numeronodo++;
                         }
                         texto+= PlantasvsZombis.jugadores.ultimo.tipo_jugador+" -> nodos0;";
                         for(int g=0;g<(numeronodo-1);g++)
                         {
                             texto+="nodos"+g+" -> nodos"+(g+1)+";";
                         }
                         texto+="}; Jugadores -> "+PlantasvsZombis.jugadores.raiz.tipo_jugador+"; \n" +
                                    PlantasvsZombis.jugadores.raiz.tipo_jugador+" -> "+PlantasvsZombis.jugadores.ultimo.tipo_jugador+"; \n" +
                                  " } ";
                         
                         
                         
                         
                    
                    lee.close();
                    
                    generarArchivo(texto,"jugadores");
                    GenerarArbol("jugadores");
                    
                    
                    
                } catch (FileNotFoundException ex) {
                    
                } catch (IOException ex) {
                    
                }
            
            
        
    }
public void arbolespersonajes(){
      String texto="";
      String auxiliar="";
        path="";
        direccionBase = "C:\\Users\\Erick\\Documents\\NetBeansProjects\\PlantasvsZombis\\Graficas\\";
        
            
            path=direccionBase+"\\arbolpersonajes.txt";
            try{
                FileWriter nuevo=new FileWriter(path);
                nuevo.close();
            }catch(IOException | HeadlessException e){
                System.out.println(e);
            }
            File abrir=new File(path);
            
                FileReader lector;
                try{
                    
                    
                    //Error de sistemashkhdafkjgnkdg
                    lector=new FileReader(abrir);
                    BufferedReader lee = new BufferedReader(lector);
                    String aux="";
                    //Este es el puto errror
                   
                    Personaje plantas;
                    Nodo nodoauxiliar=PlantasvsZombis.Lista_plantas.raiz;
                    plantas=nodoauxiliar.contenido;
                    
                                            //Recolectamos los datos del primer jugador
                        int numeronodo=0;                       
                        texto+="digraph G{ \n" +
                                " rankidir = LR;\n" +
                                " node[shape = circle]; \n" +
                                " rankidir = UD;\n" +
                                " {  rank = same; \n" +
                                "Personajes;"
                                + "Plantas ->";
                        
                        
                        //       Planta -> Zombie; 
                        //       Zombie -> Zombie2;
                        //        Zombie2 -> Zombie3;  
                        
                        
                        
                        while(nodoauxiliar!=null){
                        texto+=plantas.nombre+"; \n "+plantas.nombre+" -> ";
                        if(nodoauxiliar.siguiente==null){
                        nodoauxiliar=nodoauxiliar.siguiente;}else{
                        nodoauxiliar=nodoauxiliar.siguiente;
                        plantas=nodoauxiliar.contenido;
                        }
                        }
                        
                         texto+=plantas.nombre+"; \n";
                         nodoauxiliar=PlantasvsZombis.Lista_plantas.raiz;
                         plantas=nodoauxiliar.contenido;
                         while(nodoauxiliar!=null){
                         texto+=plantas.nombre+"[label=\"Nombre: "+plantas.nombre+"\"];\n";
                         numeronodo++;
                         texto+=numeronodo+"nodo[label=\"Ataque: "+plantas.ataque+"\"];\n";
                         numeronodo++;
                         texto+=numeronodo+"nodo[label=\"Defensa: "+plantas.defensa+"\"];\n";
                         numeronodo++;
                         texto+=numeronodo+"nodo[label=\"Tipo: "+plantas.tipo+"\"];\n";
                         numeronodo++;
//                       texto+=numeronodo+"nodo"+numeronodo+"[label=\"Path "+plantas.pathimagen+"\"];\n";
                         nodoauxiliar=nodoauxiliar.siguiente;
                         numeronodo++;
                         texto+= PlantasvsZombis.Lista_plantas.raiz.contenido.nombre+" -> nodo0;";
                         for(int g=0;g<numeronodo;g++)
                         {
                             texto+=numeronodo+"nodo"+g+" -> "+numeronodo+"nodo"+(g+1)+";";
                         }
                         if(nodoauxiliar.siguiente==null){
                         nodoauxiliar=nodoauxiliar.siguiente;
                         }else{
                         nodoauxiliar=nodoauxiliar.siguiente;
                         plantas=nodoauxiliar.contenido;}
                         
                         }                       
                         texto+="}\n" +
                                    " } ";
                         
                         
                    
                    lee.close();
                    
                    generarArchivo(texto,"arbolpersonajes");
                    GenerarArbol("arbolpersonajes");
                    
                    
                    
                } catch (FileNotFoundException ex) {
                    
                } catch (IOException ex) {
                    
                }
            
            
        
    
    
    
}

public void GenerarArbol(String nombrearchivo)
    {
        try{
           String dotPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe"; 
           String fileInputPath="C:\\Users\\Erick\\Documents\\NetBeansProjects\\PlantasvsZombis\\Graficas\\"+nombrearchivo+".txt";
           String fileOutputPath="C:\\Users\\Erick\\Documents\\NetBeansProjects\\PlantasvsZombis\\Graficas\\"+nombrearchivo+".png";
           String tParam="-Tjpg";
           String tOParam="-o";
           
           
           String[] cmd=new String[5];
           cmd[0]=dotPath;
           cmd[1]=tParam;
           cmd[2]=fileInputPath;
           cmd[3]=tOParam;
           cmd[4]=fileOutputPath;
           
           Runtime rt=Runtime.getRuntime();
           rt.exec(cmd);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arbol_jugadores;
    private javax.swing.JLabel arbol_matriz;
    private javax.swing.JLabel arbol_personajes;
    private javax.swing.JLabel arbol_plantas;
    private javax.swing.JLabel arbol_zombis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void generarArchivo(String texto,String nombre) throws FileNotFoundException {    
    PrintWriter writer = new PrintWriter(direccionBase+"\\"+nombre+".txt");
    writer.print(texto);
    writer.close();             
    }
}
