package ventanas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class VentanaPrincipal extends javax.swing.JFrame {
    
    private boolean casilla[][] = new boolean[3][3];
    private String turno = "usuario1";
    private int matriz[][] = new int[3][3];
    private String usuario1,usuario2;
    private int vecesGano1=0,vecesGano2=0,vecesEmpate=0;
    
    public VentanaPrincipal(String usuario1, String usuario2) {
        this.usuario1=usuario1;
        this.usuario2=usuario2;
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
    }
    
    private void llenarCasillas(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                casilla[i][j] = true;
            }
        }
    }
    
    private void llenarMatriz(){
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = 0;
            }
        }
    }
    
    private void dibujarX(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/x.png")));
        
    }
    
     private void dibujarO(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/o.png")));
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        arribaIzquierda = new javax.swing.JButton();
        Arriba = new javax.swing.JButton();
        arribaDerecha = new javax.swing.JButton();
        izquierda = new javax.swing.JButton();
        centro = new javax.swing.JButton();
        derecha = new javax.swing.JButton();
        abajoIzquierda = new javax.swing.JButton();
        abajo = new javax.swing.JButton();
        abajoDerecha = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comenzarDeNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(3, 3));

        arribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaIzquierdaActionPerformed(evt);
            }
        });
        panel.add(arribaIzquierda);

        Arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArribaActionPerformed(evt);
            }
        });
        panel.add(Arriba);

        arribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaDerechaActionPerformed(evt);
            }
        });
        panel.add(arribaDerecha);

        izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaActionPerformed(evt);
            }
        });
        panel.add(izquierda);

        centro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centroActionPerformed(evt);
            }
        });
        panel.add(centro);

        derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaActionPerformed(evt);
            }
        });
        panel.add(derecha);

        abajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoIzquierdaActionPerformed(evt);
            }
        });
        panel.add(abajoIzquierda);

        abajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoActionPerformed(evt);
            }
        });
        panel.add(abajo);

        abajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoDerechaActionPerformed(evt);
            }
        });
        panel.add(abajoDerecha);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        comenzarDeNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzarDeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reset.png"))); // NOI18N
        comenzarDeNuevo.setText("Comenzar de Nuevo");
        comenzarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarDeNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(comenzarDeNuevo);

        mostrarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tabla.png"))); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        mostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(mostrarResultados);
        menuJuego.add(separador);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void arribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaIzquierdaActionPerformed
        if(casilla[0][0] == true){
            if(turno.equals("usuario1")){
                dibujarX(arribaIzquierda);
                matriz[0][0] = 1;
                turno = "usuario2";
            }
            
            else{ //Turno usuario 2
                dibujarO(arribaIzquierda);
                matriz[0][0] = 2;
                turno = "usuario1";
            }
            
            casilla[0][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_arribaIzquierdaActionPerformed

    private void ArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArribaActionPerformed
         if(casilla[0][1] == true){
            if(turno.equals("usuario1")){
                dibujarX(Arriba);
                  matriz[0][1] = 1;
                turno = "usuario2";
            }
            
            else{ //Turno usuario 2
                dibujarO(Arriba);
                  matriz[0][1] = 2;
                turno = "usuario1";
            }
            
            casilla[0][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_ArribaActionPerformed

    private void arribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaDerechaActionPerformed
        if(casilla[0][2] == true){
            if(turno.equals("usuario1")){
                dibujarX(arribaDerecha);
                  matriz[0][2] = 1;
                turno = "usuario2";
            }
            
            else{ //Turno usuario 2
                dibujarO(arribaDerecha);
                  matriz[0][2] = 2;
                turno = "usuario1";
            }
            
            casilla[0][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_arribaDerechaActionPerformed

    private void izquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaActionPerformed
       if(casilla[1][0] == true){
            if(turno.equals("usuario1")){
                dibujarX(izquierda);
                  matriz[1][0] = 1;
                turno = "usuario2";
            }
            
            else{ //Turno usuario 2
                dibujarO(izquierda);
                  matriz[1][0] = 2;
                turno = "usuario1";
            }
            
            casilla[1][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_izquierdaActionPerformed

    private void centroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centroActionPerformed
         if(casilla[1][1] == true){
            if(turno.equals("usuario1")){
                dibujarX(centro);
                  matriz[1][1] = 1;
                turno = "usuario2";
            }
            
            else{ //Turno usuario 2
                dibujarO(centro);
                  matriz[1][1] = 2;
                turno = "usuario1";
            }
            
            casilla[1][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_centroActionPerformed

    private void derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaActionPerformed
        if(casilla[1][2] == true){
            if(turno.equals("usuario1")){
                dibujarX(derecha);
                  matriz[1][2] = 1;
                turno = "usuario2";
            }
            
            else{ //Turno usuario 2
                dibujarO(derecha);
                  matriz[1][2] = 2;
                turno = "usuario1";
            }
            
            casilla[1][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_derechaActionPerformed

    private void abajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoIzquierdaActionPerformed
       if(casilla[2][0] == true){
            if(turno.equals("usuario1")){
                dibujarX(abajoIzquierda);
                  matriz[2][0] = 1;
                turno = "usuario2";
            }
            
            else{ //Turno usuario 2
                dibujarO(abajoIzquierda);
                  matriz[2][0] = 2;
                turno = "usuario1";
            }
            
            casilla[2][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_abajoIzquierdaActionPerformed

    private void abajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoActionPerformed
       if(casilla[2][1] == true){
            if(turno.equals("usuario1")){
                dibujarX(abajo);
                  matriz[2][1] = 1;
                turno = "usuario2";
            }
            
            else{ //Turno usuario 2
                dibujarO(abajo);
                  matriz[2][1] = 2;
                turno = "usuario1";
            }
            
            casilla[2][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_abajoActionPerformed

    private void abajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoDerechaActionPerformed
         if(casilla[2][2] == true){
            if(turno.equals("usuario1")){
                dibujarX(abajoDerecha);
                  matriz[2][2] = 1;
                turno = "usuario2";
            }
            
            else{ //Turno usuario 2
                dibujarO(abajoDerecha);
                  matriz[2][2] = 2;
                turno = "usuario1";
            }
            
            casilla[2][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_abajoDerechaActionPerformed

    private void comenzarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarDeNuevoActionPerformed
     vecesGano1=0;
     vecesGano2=0;
     vecesEmpate=0;
     reiniciarJuego();
    }//GEN-LAST:event_comenzarDeNuevoActionPerformed

    private void mostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResultadosActionPerformed
        MostrarResultados ventanaMR = new MostrarResultados(this, true, usuario1, usuario2, vecesGano1, vecesGano2, vecesEmpate);
        ventanaMR.setVisible(true);
        
        
    }//GEN-LAST:event_mostrarResultadosActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://es.wikihow.com/jugar-al-triqui-(tres-en-raya)"));
            } catch (IOException ex) {
                //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked

    private void comprobarGanador(){
       boolean ganador1 = false;
       boolean ganador2 = false; 
       int casillasEmpate = 0;
       
       //Comprobar si el ganador es el usuario 1
       ganador1 = comprobar(1);
       ganador2 = comprobar(2);
       if(ganador1 == true){
           vecesGano1++;
          VentanaGanador ventanag = new VentanaGanador(this, true, usuario1);
          ventanag.setVisible(true);
           reiniciarJuego();
       }
       else if(ganador2 == true){
           vecesGano2++;
             VentanaGanador ventanag = new VentanaGanador(this, true, usuario2);
          ventanag.setVisible(true);
           reiniciarJuego();
       }else{ //el tablero esta lleno, es un empate
           for(int i=0;i<3;i++){
               for(int j=0;j<3;j++){
                   if(matriz[i][j]!=0){ //Puede haber un número 1 o un número 2
                       casillasEmpate++;
                   }
               }
           }
           
           if(casillasEmpate==9){
               vecesEmpate++;
                VentanaEmpate ventanae = new VentanaEmpate(this,true);
          ventanae.setVisible(true);
                reiniciarJuego();
           }else{
               casillasEmpate=0;
           }
       }
    }
    
    private boolean comprobar(int num){
        boolean ganador = false;
        
        if(matriz[0][0]==num && matriz[0][1]==num && matriz[0][2]==num){
            ganador = true;
        }
        else if(matriz[1][0]==num && matriz[1][1]==num && matriz[1][2]==num){
            ganador = true;
        }
        else if(matriz[2][0]==num && matriz[2][1]==num && matriz[2][2]==num){
            ganador = true;
        }
        else if(matriz[0][0]==num && matriz[1][0]==num && matriz[2][0]==num){
            ganador = true;
        }
         else if(matriz[0][1]==num && matriz[1][1]==num && matriz[2][1]==num){
            ganador = true;
        }
         else if(matriz[0][2]==num && matriz[1][2]==num && matriz[2][2]==num){
            ganador = true;
        }
         else if(matriz[0][0]==num && matriz[1][1]==num && matriz[2][2]==num){
            ganador = true;
        }
         else if(matriz[2][0]==num && matriz[1][1]==num && matriz[0][2]==num){
            ganador = true;
        }
        
        return ganador;
        
    }
    
    private void reiniciarJuego(){
        llenarCasillas();
        llenarMatriz();
        arribaIzquierda.setIcon(null);
        Arriba.setIcon(null);
        arribaDerecha.setIcon(null);
        izquierda.setIcon(null);
        centro.setIcon(null);
        derecha.setIcon(null);
        abajoIzquierda.setIcon(null);
        abajo.setIcon(null);
        abajoDerecha.setIcon(null);
        
        //Vamos a preguntar al usuario quien va a jugar primero
        quienJuegaPrimero();        
    }
    
    private void quienJuegaPrimero(){
        quienJuegaPrimero elegir = new quienJuegaPrimero(this,true,usuario1,usuario2);
        elegir.setVisible(true);
      turno = elegir.getTurno();
    }
    
  
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Arriba;
    private javax.swing.JButton abajo;
    private javax.swing.JButton abajoDerecha;
    private javax.swing.JButton abajoIzquierda;
    private javax.swing.JButton arribaDerecha;
    private javax.swing.JButton arribaIzquierda;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton centro;
    private javax.swing.JMenuItem comenzarDeNuevo;
    private javax.swing.JButton derecha;
    private javax.swing.JButton izquierda;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
}
