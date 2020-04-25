/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;


public class VentanaInicial extends javax.swing.JFrame {

    private String usuario1;
    private String usuario2;
    
    public VentanaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        botonComenzar.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNombre1 = new javax.swing.JLabel();
        cajaNombre1 = new javax.swing.JTextField();
        etiquetaNombre2 = new javax.swing.JLabel();
        cajaNombre2 = new javax.swing.JTextField();
        gif = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra2 = new javax.swing.JLabel();
        etiquetaMuestra1 = new javax.swing.JLabel();
        botonComenzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 0, 0));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Tic - Tae - Toe");
        panel.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, 706, -1));

        etiquetaNombre1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        etiquetaNombre1.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre1.setText("Ingrese el usuario1:");
        panel.add(etiquetaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        panel.add(cajaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 257, 36));

        etiquetaNombre2.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        etiquetaNombre2.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre2.setText("Ingrese el usuario2:");
        panel.add(etiquetaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        panel.add(cajaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 257, 36));

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/source.gif"))); // NOI18N
        panel.add(gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        botonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        botonGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        panel.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 316, 151, 46));

        etiquetaMuestra2.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        etiquetaMuestra2.setForeground(new java.awt.Color(255, 255, 255));
        panel.add(etiquetaMuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 315, 24));

        etiquetaMuestra1.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        etiquetaMuestra1.setForeground(new java.awt.Color(255, 255, 255));
        panel.add(etiquetaMuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 315, 40));

        botonComenzar.setBackground(new java.awt.Color(255, 255, 255));
        botonComenzar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonComenzar.setText("Comenzar Juego");
        botonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarActionPerformed(evt);
            }
        });
        panel.add(botonComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        usuario1 = cajaNombre1.getText().trim().toUpperCase();
        usuario2 = cajaNombre2.getText().trim().toUpperCase();
        
        botonGuardar.setVisible(false);
        
        etiquetaMuestra1.setText(usuario1+"  Jugara primero, su ficha es X");
        etiquetaMuestra2.setText(usuario2+"  Su ficha es O");
        
        botonComenzar.setVisible(true);
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarActionPerformed
        VentanaPrincipal ventP = new VentanaPrincipal(usuario1, usuario2);
        ventP.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonComenzarActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaNombre1;
    private javax.swing.JTextField cajaNombre2;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaNombre1;
    private javax.swing.JLabel etiquetaNombre2;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel gif;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
