/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Linda
 */
public class PerfilCajero extends javax.swing.JFrame {

    /**
     * Creates new form PerfilCajero
     */
    public PerfilCajero() {
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

        jPanel1 = new javax.swing.JPanel();
        pnltitulonuevaventa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnVentaCajero = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnVerCajero = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnClientesCajero = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnltitulonuevaventa.setBackground(new java.awt.Color(0, 93, 139));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vendedora.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 93, 139));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CAJERO");

        javax.swing.GroupLayout pnltitulonuevaventaLayout = new javax.swing.GroupLayout(pnltitulonuevaventa);
        pnltitulonuevaventa.setLayout(pnltitulonuevaventaLayout);
        pnltitulonuevaventaLayout.setHorizontalGroup(
            pnltitulonuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltitulonuevaventaLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(380, Short.MAX_VALUE))
        );
        pnltitulonuevaventaLayout.setVerticalGroup(
            pnltitulonuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltitulonuevaventaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnltitulonuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(pnltitulonuevaventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnVentaCajero.setBackground(new java.awt.Color(0, 93, 139));
        btnVentaCajero.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnVentaCajero.setForeground(new java.awt.Color(255, 255, 255));
        btnVentaCajero.setText("Nueva Ventra");
        btnVentaCajero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnVentaCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 111, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        jLabel4.setAutoscrolls(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        btnVerCajero.setBackground(new java.awt.Color(0, 93, 139));
        btnVerCajero.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnVerCajero.setForeground(new java.awt.Color(255, 255, 255));
        btnVerCajero.setText("Ver Producto");
        btnVerCajero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnVerCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 111, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clasificacion.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        btnClientesCajero.setBackground(new java.awt.Color(0, 93, 139));
        btnClientesCajero.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnClientesCajero.setForeground(new java.awt.Color(255, 255, 255));
        btnClientesCajero.setText("Clientes");
        btnClientesCajero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnClientesCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 111, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/punto-de-venta.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PerfilCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilCajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientesCajero;
    private javax.swing.JButton btnVentaCajero;
    private javax.swing.JButton btnVerCajero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnltitulonuevaventa;
    // End of variables declaration//GEN-END:variables
}