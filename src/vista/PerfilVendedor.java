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
public class PerfilVendedor extends javax.swing.JFrame {

    /** Creates new form PerfilVendedor */
    public PerfilVendedor() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlperfilVendedor = new javax.swing.JPanel();
        pnltitulonuevaventa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnClienteVendedor = new javax.swing.JButton();
        btnVerProductVend = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(890, 676));
        setMinimumSize(new java.awt.Dimension(890, 676));

        pnlperfilVendedor.setBackground(new java.awt.Color(255, 255, 255));

        pnltitulonuevaventa.setBackground(new java.awt.Color(0, 93, 139));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vendedora.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 93, 139));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENDEDOR");

        javax.swing.GroupLayout pnltitulonuevaventaLayout = new javax.swing.GroupLayout(pnltitulonuevaventa);
        pnltitulonuevaventa.setLayout(pnltitulonuevaventaLayout);
        pnltitulonuevaventaLayout.setHorizontalGroup(
            pnltitulonuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltitulonuevaventaLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        pnltitulonuevaventaLayout.setVerticalGroup(
            pnltitulonuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltitulonuevaventaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnltitulonuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnClienteVendedor.setBackground(new java.awt.Color(0, 93, 139));
        btnClienteVendedor.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnClienteVendedor.setForeground(new java.awt.Color(255, 255, 255));
        btnClienteVendedor.setText("Clientes");
        btnClienteVendedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnVerProductVend.setBackground(new java.awt.Color(0, 93, 139));
        btnVerProductVend.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        btnVerProductVend.setForeground(new java.awt.Color(255, 255, 255));
        btnVerProductVend.setText("Ver Producto");
        btnVerProductVend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clasificacion.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        jLabel3.setAutoscrolls(true);

        javax.swing.GroupLayout pnlperfilVendedorLayout = new javax.swing.GroupLayout(pnlperfilVendedor);
        pnlperfilVendedor.setLayout(pnlperfilVendedorLayout);
        pnlperfilVendedorLayout.setHorizontalGroup(
            pnlperfilVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnltitulonuevaventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlperfilVendedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlperfilVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlperfilVendedorLayout.createSequentialGroup()
                        .addComponent(btnVerProductVend, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(btnClienteVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlperfilVendedorLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(181, 181, 181)
                        .addComponent(jLabel4)
                        .addGap(281, 281, 281))))
        );
        pnlperfilVendedorLayout.setVerticalGroup(
            pnlperfilVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlperfilVendedorLayout.createSequentialGroup()
                .addComponent(pnltitulonuevaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(pnlperfilVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(pnlperfilVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClienteVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerProductVend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlperfilVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlperfilVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(PerfilVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClienteVendedor;
    private javax.swing.JButton btnVerProductVend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnlperfilVendedor;
    private javax.swing.JPanel pnltitulonuevaventa;
    // End of variables declaration//GEN-END:variables

}
