
package ventanas;

import java.awt.Toolkit;


public class VentanaInicial extends javax.swing.JFrame {
    
    private String usuario1;
    private String usuario2;

   
    public VentanaInicial() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icono.png")));
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etiquetaNombre1 = new javax.swing.JLabel();
        etiquetaNombre2 = new javax.swing.JLabel();
        cajaNombre1 = new javax.swing.JTextField();
        cajaNombre2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra1 = new javax.swing.JLabel();
        etiquetaMuestra2 = new javax.swing.JLabel();
        comenzarJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Juego de Triqui");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 688, -1));

        etiquetaNombre1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaNombre1.setText("Digite el nombre del usuario 1:");
        panel.add(etiquetaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 157, -1, -1));

        etiquetaNombre2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaNombre2.setText("Digite el nombre del usuario 2:");
        panel.add(etiquetaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 203, -1, -1));

        cajaNombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 154, 308, 32));

        cajaNombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 198, 308, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.gif"))); // NOI18N
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 323, -1, -1));

        botonGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        panel.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 284, 108, 37));

        etiquetaMuestra1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel.add(etiquetaMuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        etiquetaMuestra2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel.add(etiquetaMuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        comenzarJuego.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comenzarJuego.setText("Comenzar Juego");
        comenzarJuego.setVisible(false);
        comenzarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarJuegoActionPerformed(evt);
            }
        });
        panel.add(comenzarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 491, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
       usuario1 = cajaNombre1.getText();
       usuario2 = cajaNombre2.getText();
       
       botonGuardar.setVisible(false);
       etiquetaMuestra1.setText(usuario1+", jugara primero y su ficha es: X");
       etiquetaMuestra2.setText(usuario2+", jugara segundo y su ficha es: O");
       comenzarJuego.setVisible(true);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void comenzarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarJuegoActionPerformed
       VentanaPrincipal ventap = new VentanaPrincipal(usuario1,usuario2);
       ventap.setVisible(true);
       dispose();
    }//GEN-LAST:event_comenzarJuegoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaNombre1;
    private javax.swing.JTextField cajaNombre2;
    private javax.swing.JButton comenzarJuego;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaNombre1;
    private javax.swing.JLabel etiquetaNombre2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
