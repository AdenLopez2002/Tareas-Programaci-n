/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chat_prueba;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Abad Castillo
 */
public class Ventana2 extends javax.swing.JFrame implements Observer {

    public Ventana2() {
        initComponents();
        this.getRootPane().setDefaultButton(this.btnEnviar);
        Servidor s = new Servidor(6002);
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        txtTextoEnviar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        lblname = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblname1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));

        jPanel1.setBackground(new java.awt.Color(181, 11, 71));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnviar.setBackground(new java.awt.Color(0, 51, 102));
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("SEND");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 80, 30));

        txtTextoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(txtTextoEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, 30));

        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        txtTexto.setFocusable(false);
        jScrollPane1.setViewportView(txtTexto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 340, 160));

        lblname.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("(nombre2)");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 150, 30));

        lblState.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_prueba/perf (2).jpg"))); // NOI18N
        lblState.setPreferredSize(new java.awt.Dimension(50, 59));
        jPanel1.add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 50));

        lblname1.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblname1.setForeground(new java.awt.Color(255, 255, 255));
        lblname1.setText("@correo_2");
        jPanel1.add(lblname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_prueba/call_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        String mensaje = "Usuario 2: " + this.txtTextoEnviar.getText() + "\n";

        this.txtTexto.append(mensaje);

        Cliente c = new Cliente(5002, mensaje);
        Thread t = new Thread(c);
        t.start();
        
        //limpiar
        this.txtTextoEnviar.setText(null);

    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtTextoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoEnviarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTextoEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblname1;
    private javax.swing.JTextArea txtTexto;
    private javax.swing.JTextField txtTextoEnviar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        this.txtTexto.append((String) arg);
    }
}
