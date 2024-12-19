package vistas1;

import javax.swing.JOptionPane;
import modelo.beans1.Usuario;

/**
 *Interfaz gráfica Editar datos de mi usuario.
 **/
public class EditarMiUsuario extends javax.swing.JFrame {
Usuario usuario;
    /**
     * Constructor Interfaz gráfica Editar datos de mi usuario.
     **/
    public EditarMiUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.setLocationRelativeTo(null);
        initComponents();
        
        txtNuevoNombre.setText(usuario.getNombre());
        txtNuevoUsuario.setText(usuario.getUsuario());
        txtNuevoCorreo.setText(usuario.getCorreo());
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnListaDeTareas = new javax.swing.JButton();
        btnCrearTarea = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNuevoNombre = new javax.swing.JTextField();
        txtNuevoCorreo = new javax.swing.JTextField();
        txtNuevoUsuario = new javax.swing.JTextField();
        txtNuevaContraseña = new javax.swing.JTextField();
        btnActualizarMisDatos = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnMinimizarPanta = new javax.swing.JButton();
        btnCerrarPantalla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(144, 101, 101));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 55)); // NOI18N
        jLabel1.setText("BIENVENID@ A TareasMooz");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        btnListaDeTareas.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        btnListaDeTareas.setText("LISTA DE TAREAS");
        btnListaDeTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaDeTareasActionPerformed(evt);
            }
        });

        btnCrearTarea.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        btnCrearTarea.setText("CREAR TAREA");
        btnCrearTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTareaActionPerformed(evt);
            }
        });

        jPanel3.setMaximumSize(new java.awt.Dimension(300, 300));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setText("EDITAR MI USUARIO");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("Nombre Completo: ");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Correo:");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel6.setText("Nombre de usuario:");

        txtNuevoNombre.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        txtNuevoCorreo.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        txtNuevoUsuario.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        txtNuevaContraseña.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        btnActualizarMisDatos.setBackground(new java.awt.Color(153, 102, 0));
        btnActualizarMisDatos.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnActualizarMisDatos.setText("Actualizar mis datos");
        btnActualizarMisDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMisDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(116, 116, 116)
                        .addComponent(txtNuevoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(76, 76, 76)
                        .addComponent(txtNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(361, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(350, 350, 350))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnActualizarMisDatos)
                        .addGap(32, 32, 32))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnActualizarMisDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jButton6.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton6.setText("EDITAR USUARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnListaDeTareas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearTarea)
                        .addGap(152, 152, 152)
                        .addComponent(jButton6))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearTarea)
                    .addComponent(btnListaDeTareas)
                    .addComponent(jButton6))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btnMinimizarPanta.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnMinimizarPanta.setText("_");
        btnMinimizarPanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarPantaActionPerformed(evt);
            }
        });

        btnCerrarPantalla.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnCerrarPantalla.setText("X");
        btnCerrarPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarPantallaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1)
                        .addGap(0, 316, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinimizarPanta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrarPantalla)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinimizarPanta)
                    .addComponent(btnCerrarPantalla))
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     * Boton que al ser presionado nos lleva a la interfaz gráfica Lista de tareas.
     **/
    private void btnListaDeTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaDeTareasActionPerformed
        ListaDeTareasUsuario l = new ListaDeTareasUsuario(usuario);
        l.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnListaDeTareasActionPerformed
/**
     * Boton que al ser presionado nos lleva a la interfaz gráfica Crear tarea.
     **/
    private void btnCrearTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTareaActionPerformed
        // TODO add your handling code here:
        CrearTareaUsuario c = new CrearTareaUsuario(usuario);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearTareaActionPerformed
/**
     * Boton que al ser presionado modifica los datos del usuario.
     **/
    private void btnActualizarMisDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMisDatosActionPerformed
        // TODO add your handling code here:
        usuario.setNombre(txtNuevoNombre.getText());
        usuario.setCorreo(txtNuevoCorreo.getText());
        usuario.setUsuario(txtNuevoUsuario.getText());
        usuario.setContraseña(txtNuevaContraseña.getText());
        JOptionPane.showMessageDialog(this, "Se modifico los datos.");
    }//GEN-LAST:event_btnActualizarMisDatosActionPerformed
/**
     * Cerrar pantalla.
     **/
    private void btnCerrarPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarPantallaActionPerformed
        this.dispose();
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarPantallaActionPerformed
/**
     *Minimizar pantalla.
     **/
    private void btnMinimizarPantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarPantaActionPerformed
        setState(EditarMiUsuario.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarPantaActionPerformed

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
            java.util.logging.Logger.getLogger(EditarMiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarMiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarMiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarMiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarMiUsuario(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarMisDatos;
    private javax.swing.JButton btnCerrarPantalla;
    private javax.swing.JButton btnCrearTarea;
    private javax.swing.JButton btnListaDeTareas;
    private javax.swing.JButton btnMinimizarPanta;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtNuevaContraseña;
    private javax.swing.JTextField txtNuevoCorreo;
    private javax.swing.JTextField txtNuevoNombre;
    private javax.swing.JTextField txtNuevoUsuario;
    // End of variables declaration//GEN-END:variables
}
