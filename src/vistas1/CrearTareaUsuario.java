package vistas1;

import javax.swing.JOptionPane;
import modelo.beans1.Tarea;
import modelo.beans1.Usuario;

/**
 *Interfaz gráfica Crear tarea por parte del usuario.
 **/
public class CrearTareaUsuario extends javax.swing.JFrame {
Usuario usuario;
    /**
     * Constructor Crear tarea por parte del usuario.
     **/
    public CrearTareaUsuario(Usuario usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuario = usuario;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnCreaTarea = new javax.swing.JButton();
        comboBoxPrioridad = new javax.swing.JComboBox<>();
        comboBoxEstado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotas = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JEditorPane();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaIni = new javax.swing.JTextField();
        btnEditarUsuario = new javax.swing.JButton();
        btnMinimizarPantalla = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

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
        jLabel2.setText("DATOS DE LA TAREA");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Nombre de la tarea:");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel6.setText("Prioridad:");

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel7.setText("Descripción:");

        txtNombre.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        btnCreaTarea.setBackground(new java.awt.Color(153, 102, 0));
        btnCreaTarea.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnCreaTarea.setText("Crear Tarea");
        btnCreaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaTareaActionPerformed(evt);
            }
        });

        comboBoxPrioridad.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        comboBoxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Media", "Baja" }));

        comboBoxEstado.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        comboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por hacer", "En progreso", "Completada" }));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel8.setText("Notas:");

        txtNotas.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(txtNotas);

        txtDescripcion.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel9.setText("Fecha de Entrega:");

        txtFecha.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Fecha de Inicio:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(31, 31, 31)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtFechaIni)
                                        .addGap(106, 106, 106)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(433, 433, 433))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(txtFechaIni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboBoxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnCreaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        btnEditarUsuario.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        btnEditarUsuario.setText("EDITAR USUARIO");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnListaDeTareas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearTarea)
                        .addGap(212, 212, 212)
                        .addComponent(btnEditarUsuario))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearTarea)
                    .addComponent(btnListaDeTareas)
                    .addComponent(btnEditarUsuario))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnMinimizarPantalla.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnMinimizarPantalla.setText("_");
        btnMinimizarPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarPantallaActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMinimizarPantalla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinimizarPantalla)
                    .addComponent(btnSalir))
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void btnCrearTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearTareaActionPerformed
/**
     * Boton que al ser presionado se crea la tarea y lo guarda a la lista de tareas del usuario.
     **/
    private void btnCreaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaTareaActionPerformed
        // TODO add your handling code here:
        if(txtFecha.getText().length() == 10 && txtFechaIni.getText().length() == 10 ){
        Tarea tarea = new Tarea(txtNombre.getText(), txtDescripcion.getText(),comboBoxPrioridad.getSelectedItem().toString() ,comboBoxEstado.getSelectedItem().toString(),txtFecha.getText(),txtFechaIni.getText());
       tarea.setComentario(txtNotas.getText());
        usuario.agregarTarea(tarea);
       JOptionPane.showMessageDialog(this, "Se creo la tarea "+ txtNombre.getText() + ".");
        
        }else{
        JOptionPane.showMessageDialog(this, "Selecciona un formato de fecha valido.");
        }
        
    }//GEN-LAST:event_btnCreaTareaActionPerformed
/**
     * Boton que al ser presionado nos lleva a la interfaz gráfica Editar datos de mi usuario.
     **/
    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        EditarMiUsuario e = new EditarMiUsuario(usuario);
        e.setLocationRelativeTo(null);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed
/**
     * Boton que al ser presionado cierra la pantalla.
     **/
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
this.dispose();
        FrmLogin login = new FrmLogin();
        login.setVisible(true);    }//GEN-LAST:event_btnSalirActionPerformed
/**
     * Boton que al ser presionado minimiza la pantalla.
     **/
    private void btnMinimizarPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarPantallaActionPerformed
        setState(CrearTareaUsuario.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarPantallaActionPerformed

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
            java.util.logging.Logger.getLogger(CrearTareaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearTareaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearTareaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearTareaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearTareaUsuario(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreaTarea;
    private javax.swing.JButton btnCrearTarea;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnListaDeTareas;
    private javax.swing.JButton btnMinimizarPantalla;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JComboBox<String> comboBoxPrioridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JEditorPane txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaIni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JEditorPane txtNotas;
    // End of variables declaration//GEN-END:variables
}
