
package ventanas;


public class VentanaTurno extends javax.swing.JDialog {
    
    private String usuario1, usuario2, turno;

    public String getTurno() {
        return turno;
    }

    
    public VentanaTurno(java.awt.Frame parent, boolean modal,String usuario1, String usuario2) {
        super(parent, modal);
        this.setUndecorated(true);
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        turnoUsuario1 = new javax.swing.JButton();
        turnoUsuario2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione un turno");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 480, -1));

        turnoUsuario1.setBackground(new java.awt.Color(0, 0, 102));
        turnoUsuario1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        turnoUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        turnoUsuario1.setText(usuario1);
        turnoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnoUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(turnoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        turnoUsuario2.setBackground(new java.awt.Color(0, 0, 102));
        turnoUsuario2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        turnoUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        turnoUsuario2.setText(usuario2);
        turnoUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnoUsuario2ActionPerformed(evt);
            }
        });
        jPanel1.add(turnoUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/elegir.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void turnoUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnoUsuario1ActionPerformed
        turno = "usuario1";
        dispose();
    }//GEN-LAST:event_turnoUsuario1ActionPerformed

    private void turnoUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnoUsuario2ActionPerformed
        turno = "usuario2";
        dispose();
    }//GEN-LAST:event_turnoUsuario2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTurno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaTurno dialog = new VentanaTurno(new javax.swing.JFrame(), true,null,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton turnoUsuario1;
    private javax.swing.JButton turnoUsuario2;
    // End of variables declaration//GEN-END:variables
}
