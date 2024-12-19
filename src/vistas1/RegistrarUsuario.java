package vistas1;

import javax.swing.JOptionPane;
import modelo.beans1.Usuario;
import modelo.logic1.UsuarioLogic;

/**
 *Interfaz gráfica Registrarse.
 **/
public class RegistrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarUsuario
     */
    public RegistrarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnCrearUsuario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel9.setText("HOLA!!!!  BIENVENID@!!!!!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 55)); // NOI18N
        jLabel1.setText("BIENVENID@ A TareasMooz");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setMaximumSize(new java.awt.Dimension(300, 300));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setText("CREAR USUARIO");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("Nombre Completo: ");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Correo:");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel6.setText("Nombre de usuario:");

        txtNombre.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        txtCorreo.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        txtContraseña.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        btnCrearUsuario.setBackground(new java.awt.Color(153, 102, 0));
        btnCrearUsuario.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel8.setText("HOLA!!!!  BIENVENID@!!!!!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(116, 116, 116)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(76, 76, 76)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 787, Short.MAX_VALUE)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel8)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel11.setText("Hola!! Registrate a TareasMooz");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11)))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btnMinimizar.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnMinimizar.setText("_");
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnCerrar.setText("X");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMinimizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinimizar)
                    .addComponent(btnCerrar))
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /**
     * Cerrar pantalla y volver al login.
     **/
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
 /**
     * registrarse como usuario.
     **/
    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed

        if(!txtNombre.getText().isEmpty() && !txtCorreo.getText().isEmpty() &&
            !txtUsuario.getText().isEmpty() &&
            !txtContraseña.getText().isEmpty()){
            Usuario jugador = new Usuario(txtNombre.getText(),txtUsuario.getText(), txtContraseña.getText(),txtCorreo.getText());
            if(UsuarioLogic.insertar(jugador)){
                JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente");
            }else{
                JOptionPane.showMessageDialog(this, "Usuario ya registrado");
            }

        }
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed
/**
     * Mnimizar pantalla.
     **/
    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        setState(RegistrarUsuario.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

     /**
     * @param args los argumentos de la línea de comandos.
     **/
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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
