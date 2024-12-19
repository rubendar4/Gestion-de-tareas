package vistas1;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.logic1.UsuarioLogic;

/**
 *Panel con las tareas del administrador.
 **/
public class Inicio extends javax.swing.JFrame {
DefaultTableModel nt = new DefaultTableModel();
    /**
     * Creates new form Inicio.
     **/
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        String idss [] = {"Usuario","Nombre de la tarea",  "Estado", "Prioridad","Fecha de Inicio","Fecha de Entrega","Descripción de la tarea"};
        nt.setColumnIdentifiers(idss);
        jTable1.setModel(nt);
        for (int i = 0; i < UsuarioLogic.getusuarios().size(); i++) {
           if(UsuarioLogic.getusuarios().get(i).lista().isEmpty()){
           nt.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),"", 
                "", 
                "", ""});
         
           }else{
            for (int j = 0; j < UsuarioLogic.getusuarios().get(i).lista().size(); j++) {
                nt.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
            }}
        }
        jTable1.setModel(nt);
        TableColumn columna = jTable1.getColumnModel().getColumn(6);
       columna.setPreferredWidth(400);
        class MiRenderizador extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Prioridad
        if (table.getColumnName(column).equals("Prioridad")) {
            if (value.equals("Alta")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("Media")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Baja")) {
                setBackground(java.awt.Color.GREEN);
            }
        }

        // Estado
        if (table.getColumnName(column).equals("Estado")) {
            if (value.equals("Por hacer")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("En progreso")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Completada")) {  
                setBackground(java.awt.Color.GREEN);
            }
        }

        return this;
    }}
    JTable miTabla = jTable1;

// Asigna renderizador a columnas
miTabla.getColumnModel().getColumn(3).setCellRenderer(new MiRenderizador()); // Prioridad
miTabla.getColumnModel().getColumn(2).setCellRenderer(new MiRenderizador()); // Estado
  miTabla.setRowHeight(30);
        
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminarUsuario = new javax.swing.JButton();
        btnAsignarTarea = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminarTarea = new javax.swing.JButton();
        txtNota = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        selectorEstado = new javax.swing.JComboBox<>();
        selectorPrioridad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarNota = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnMnimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        jButton6.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jButton6.setText("LISTA DE TAREAS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 55)); // NOI18N
        jLabel1.setText("BIENVENID@ A TareasMooz");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton1.setText("INICIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setMaximumSize(new java.awt.Dimension(300, 300));

        jTable1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Nombre de la tarea", "Estado", "Prioridad", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarUsuario.setText("Eliminar usuario");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnAsignarTarea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAsignarTarea.setText("Asignar Tarea");
        btnAsignarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarTareaActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminarTarea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarTarea.setText("Eliminar tarea");
        btnEliminarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTareaActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(153, 255, 255));
        btnBuscar.setText("🔎");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        selectorEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Por hacer", "En progreso", "Completada" }));
        selectorEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectorEstadoItemStateChanged(evt);
            }
        });

        selectorPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Alta", "Media", "Baja" }));
        selectorPrioridad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectorPrioridadItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Prioridad:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Estado:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(btnEliminarTarea)
                .addGap(108, 108, 108)
                .addComponent(btnAsignarTarea)
                .addGap(94, 94, 94)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(selectorPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtNota, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarUsuario)
                            .addComponent(btnEliminarTarea)
                            .addComponent(btnAsignarTarea)
                            .addComponent(btnActualizar)))))
        );

        btnAgregarNota.setBackground(new java.awt.Color(204, 255, 204));
        btnAgregarNota.setText("Agregar nota");
        btnAgregarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNotaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setText("HOLA ADMI!!!! BIENVENID@ DE NUEVO!!!!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(283, 283, 283)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarNota)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnMnimizar.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnMnimizar.setText("_");
        btnMnimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMnimizarActionPerformed(evt);
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
                .addGap(247, 247, 247)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMnimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMnimizar)
                    .addComponent(btnCerrar))
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked
/**
     *Selecciona un usuario de la tabla para ser eliminado.
     **/
    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        // TODO add your handling code here:
         int filaSeleccionada = jTable1.getSelectedRow();
     if(filaSeleccionada != -1){
         String nombreAEliminar = nt.getValueAt(filaSeleccionada,0).toString();
         UsuarioLogic.eliminar(nombreAEliminar);
         nt.removeRow(filaSeleccionada);
     }else{
         JOptionPane.showMessageDialog(this, "Selecciona una persona para eliminar");
     }
     DefaultTableModel nt4 = new DefaultTableModel();
        // TODO add your handling code here:
        String idss [] = {"Usuario","Nombre de la tarea",  "Estado", "Prioridad","Fecha de inicio","Fecha de Entrega","Descripción de la tarea"};
        nt4.setColumnIdentifiers(idss);
        jTable1.setModel(nt4);
        for (int i = 0; i < UsuarioLogic.getusuarios().size(); i++) {
           if(UsuarioLogic.getusuarios().get(i).lista().isEmpty()){
           nt4.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),"", 
                "", 
                "", ""});
         
           }else{
            for (int j = 0; j < UsuarioLogic.getusuarios().get(i).lista().size(); j++) {
                nt4.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
            }}
        }
        nt = nt4;
        jTable1.setModel(nt);
        TableColumn columna = jTable1.getColumnModel().getColumn(6);
       columna.setPreferredWidth(400);
        class MiRenderizador extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Prioridad
        if (table.getColumnName(column).equals("Prioridad")) {
            if (value.equals("Alta")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("Media")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Baja")) {
                setBackground(java.awt.Color.GREEN);
            }
        }

        // Estado
        if (table.getColumnName(column).equals("Estado")) {
            if (value.equals("Por hacer")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("En progreso")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Completada")) {  
                setBackground(java.awt.Color.GREEN);
            }
        }

        return this;
    }}
    JTable miTabla = jTable1;

// Asigna renderizador a columnas
miTabla.getColumnModel().getColumn(3).setCellRenderer(new MiRenderizador()); // Prioridad
miTabla.getColumnModel().getColumn(2).setCellRenderer(new MiRenderizador()); // Estado
miTabla.setRowHeight(30);
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed
/**
     * Cerrar pantalla.
     **/
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FrmLogin l = new FrmLogin();
        l.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed
/**
     * Selecciona un usuario para asignarle una tarea.
     **/
    private void btnAsignarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarTareaActionPerformed
        // TODO add your handling code here:
         int filaSeleccionada = jTable1.getSelectedRow();
     if(filaSeleccionada != -1){
         String nombreAObtener = nt.getValueAt(filaSeleccionada,0).toString();
         FrmAsignarTaera frmAsignarTarea = new FrmAsignarTaera(UsuarioLogic.obtener(nombreAObtener));
         frmAsignarTarea.setVisible(true);
     }else{
     }
    }//GEN-LAST:event_btnAsignarTareaActionPerformed
/**
     * Actuzalizar la tabla.
     **/
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
DefaultTableModel nt4 = new DefaultTableModel();
        // TODO add your handling code here:
        String idss [] = {"Usuario","Nombre de la tarea",  "Estado", "Prioridad","Fecha de inicio","Fecha de Entrega","Descripción de la tarea"};
        nt4.setColumnIdentifiers(idss);
        jTable1.setModel(nt4);
        for (int i = 0; i < UsuarioLogic.getusuarios().size(); i++) {
           if(UsuarioLogic.getusuarios().get(i).lista().isEmpty()){
           nt4.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),"", 
                "", 
                "", ""});
         
           }else{
            for (int j = 0; j < UsuarioLogic.getusuarios().get(i).lista().size(); j++) {
                nt4.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
            }}
        }
        nt = nt4;
        jTable1.setModel(nt);
        TableColumn columna = jTable1.getColumnModel().getColumn(6);
       columna.setPreferredWidth(400);
        class MiRenderizador extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Prioridad
        if (table.getColumnName(column).equals("Prioridad")) {
            if (value.equals("Alta")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("Media")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Baja")) {
                setBackground(java.awt.Color.GREEN);
            }
        }

        // Estado
        if (table.getColumnName(column).equals("Estado")) {
            if (value.equals("Por hacer")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("En progreso")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Completada")) {  
                setBackground(java.awt.Color.GREEN);
            }
        }

        return this;
    }}
    JTable miTabla = jTable1;

// Asigna renderizador a columnas
miTabla.getColumnModel().getColumn(3).setCellRenderer(new MiRenderizador()); // Prioridad
miTabla.getColumnModel().getColumn(2).setCellRenderer(new MiRenderizador()); // Estado
miTabla.setRowHeight(30);
txtBuscar.setText("");
    }//GEN-LAST:event_btnActualizarActionPerformed
/**
     * Selecciona una tarea de un usuario para ser eliminado.
     **/
    private void btnEliminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTareaActionPerformed
        // TODO add your handling code here:
         int filaSeleccionada = jTable1.getSelectedRow();
     if(filaSeleccionada != -1){
         String nombreUsuario = nt.getValueAt(filaSeleccionada,0).toString();
         String nombreTareaEli = nt.getValueAt(filaSeleccionada, 1).toString();
         UsuarioLogic.obtener(nombreUsuario).eliminar(nombreTareaEli);
         nt.removeRow(filaSeleccionada);
     }else{
         JOptionPane.showMessageDialog(this, "Selecciona una tarea para eliminar");
     }
    }//GEN-LAST:event_btnEliminarTareaActionPerformed
/**
     * Agregar una nota a la tarea de un usuario.
     **/
    private void btnAgregarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNotaActionPerformed
        // TODO add your handling code here:
         int filaSeleccionada = jTable1.getSelectedRow();
     if(filaSeleccionada != -1){
         String nombreUsuario = nt.getValueAt(filaSeleccionada,0).toString();
         String nombreTareaEli = nt.getValueAt(filaSeleccionada, 1).toString();
         UsuarioLogic.obtener(nombreUsuario).obtener(nombreTareaEli).setComentario(txtNota.getText());
       JOptionPane.showMessageDialog(this, "Nota agregada");
     }else{
         JOptionPane.showMessageDialog(this, "Selecciona una tarea para agregar nota");
     }
    }//GEN-LAST:event_btnAgregarNotaActionPerformed

    private boolean buscarPalabra(String palabra, String parrafo) {
    return parrafo.toLowerCase().contains(palabra.toLowerCase());
}
    /**
     * Buscar una tarea en específico.
     * Buscar a un usuario en específico.
     * Buscar mediante la descripcion de una tarea.
     **/
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       DefaultTableModel nt9 = new DefaultTableModel();
        String idss [] = {"Usuario","Nombre de la tarea",  "Estado", "Prioridad","Fecha de Inicio","Fecha de Entrega","Descripción de la tarea"};
        nt9.setColumnIdentifiers(idss);
        jTable1.setModel(nt9);
        for (int i = 0; i < UsuarioLogic.getusuarios().size(); i++) {
           if(UsuarioLogic.getusuarios().get(i).lista().isEmpty()){
           nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),"", 
                "", 
                "", ""});
         
           }else{
            for (int j = 0; j < UsuarioLogic.getusuarios().get(i).lista().size(); j++) {
                
                if("Todos".equals(selectorPrioridad.getSelectedItem().toString())){

                if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                    }else{
                        if(txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario()) ){ 
                            nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}
                }
            }else{ if(selectorEstado.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});

                }else{
                    if(txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion() )  || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario())){ 
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{}
        }
        }else{

            if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                if(selectorPrioridad.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});

                    }else{
                        if(txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario()) ){
                            nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}}
            }else{}

        }else{
            if(selectorPrioridad.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad()) && selectorEstado.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});

                }else{
                    if(buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion() ) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario())){ 
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{

        }
        }

        }
                
            }}
        }
        nt = nt9;
        jTable1.setModel(nt);
        TableColumn columna = jTable1.getColumnModel().getColumn(6);
       columna.setPreferredWidth(400);
        class MiRenderizador extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Prioridad
        if (table.getColumnName(column).equals("Prioridad")) {
            if (value.equals("Alta")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("Media")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Baja")) {
                setBackground(java.awt.Color.GREEN);
            }
        }

        // Estado
        if (table.getColumnName(column).equals("Estado")) {
            if (value.equals("Por hacer")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("En progreso")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Completada")) {  
                setBackground(java.awt.Color.GREEN);
            }
        }

        return this;
    }}
    JTable miTabla = jTable1;

// Asigna renderizador a columnas
miTabla.getColumnModel().getColumn(3).setCellRenderer(new MiRenderizador()); // Prioridad
miTabla.getColumnModel().getColumn(2).setCellRenderer(new MiRenderizador()); // Estado
  miTabla.setRowHeight(30);
    }//GEN-LAST:event_btnBuscarActionPerformed
/**
     * Selecciona una prioridad del selector para buscarlo en la tabla.
     **/
    private void selectorPrioridadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectorPrioridadItemStateChanged
       DefaultTableModel nt9 = new DefaultTableModel();
        String idss [] = {"Usuario","Nombre de la tarea",  "Estado", "Prioridad","Fecha de Inicio","Fecha de Entrega","Descripción de la tarea"};
        nt9.setColumnIdentifiers(idss);
        jTable1.setModel(nt9);
        for (int i = 0; i < UsuarioLogic.getusuarios().size(); i++) {
           if(UsuarioLogic.getusuarios().get(i).lista().isEmpty()){
           nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),"", 
                "", 
                "", ""});
         
           }else{
            for (int j = 0; j < UsuarioLogic.getusuarios().get(i).lista().size(); j++) {
                
                if("Todos".equals(selectorPrioridad.getSelectedItem().toString())){

                if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                    }else{
                        if(txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario()) ){ 
                            nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}
                }
            }else{ if(selectorEstado.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});

                }else{
                    if(txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion() )  || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario())){ 
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{}
        }
        }else{

            if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                if(selectorPrioridad.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});

                    }else{
                        if(txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario()) ){
                            nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}}
            }else{}

        }else{
            if(selectorPrioridad.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad()) && selectorEstado.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});

                }else{
                    if(buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion() ) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario())){ 
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{

        }
        }

        }
                
            }}
        }
        nt = nt9;
        jTable1.setModel(nt);
        TableColumn columna = jTable1.getColumnModel().getColumn(6);
       columna.setPreferredWidth(400);
        class MiRenderizador extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Prioridad
        if (table.getColumnName(column).equals("Prioridad")) {
            if (value.equals("Alta")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("Media")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Baja")) {
                setBackground(java.awt.Color.GREEN);
            }
        }

        // Estado
        if (table.getColumnName(column).equals("Estado")) {
            if (value.equals("Por hacer")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("En progreso")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Completada")) {  
                setBackground(java.awt.Color.GREEN);
            }
        }

        return this;
    }}
    JTable miTabla = jTable1;

// Asigna renderizador a columnas
miTabla.getColumnModel().getColumn(3).setCellRenderer(new MiRenderizador()); // Prioridad
miTabla.getColumnModel().getColumn(2).setCellRenderer(new MiRenderizador()); // Estado
  miTabla.setRowHeight(30);
    }//GEN-LAST:event_selectorPrioridadItemStateChanged
/**
     * Selecciona un estado del selector para buscarlo en la tabla.
     **/
    private void selectorEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectorEstadoItemStateChanged
        DefaultTableModel nt9 = new DefaultTableModel();
        String idss [] = {"Usuario","Nombre de la tarea",  "Estado", "Prioridad","Fecha de Inicio","Fecha de Entrega","Descripción de la tarea"};
        nt9.setColumnIdentifiers(idss);
        jTable1.setModel(nt9);
        for (int i = 0; i < UsuarioLogic.getusuarios().size(); i++) {
           if(UsuarioLogic.getusuarios().get(i).lista().isEmpty()){
           nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),"", 
                "", 
                "", ""});
         
           }else{
            for (int j = 0; j < UsuarioLogic.getusuarios().get(i).lista().size(); j++) {
                
                if("Todos".equals(selectorPrioridad.getSelectedItem().toString())){

                if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                    }else{
                        if(txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario()) ){ 
                            nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}
                }
            }else{ if(selectorEstado.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});

                }else{
                    if(txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion() )  || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario())){ 
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{}
        }
        }else{

            if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                if(selectorPrioridad.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});

                    }else{
                        if(txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario()) ){
                            nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}}
            }else{}

        }else{
            if(selectorPrioridad.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad()) && selectorEstado.getSelectedItem().toString().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});

                }else{
                    if(buscarPalabra(txtBuscar.getText(), UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion() ) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre()) || txtBuscar.getText().equals(UsuarioLogic.getusuarios().get(i).getUsuario())){ 
                        nt9.addRow(new Object[]{UsuarioLogic.getusuarios().get(i).getUsuario(),
                    UsuarioLogic.getusuarios().get(i).lista().get(j).getNombre(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getEstado(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getPrioridad(), 
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaIni(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getFechaEn(),
                UsuarioLogic.getusuarios().get(i).lista().get(j).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{

        }
        }

        }
                
            }}
        }
        nt = nt9;
        jTable1.setModel(nt);
        TableColumn columna = jTable1.getColumnModel().getColumn(6);
       columna.setPreferredWidth(400);
        class MiRenderizador extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Prioridad
        if (table.getColumnName(column).equals("Prioridad")) {
            if (value.equals("Alta")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("Media")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Baja")) {
                setBackground(java.awt.Color.GREEN);
            }
        }

        // Estado
        if (table.getColumnName(column).equals("Estado")) {
            if (value.equals("Por hacer")) {
                setBackground(java.awt.Color.RED);
            } else if (value.equals("En progreso")) {
                setBackground(java.awt.Color.YELLOW);
            } else if (value.equals("Completada")) {  
                setBackground(java.awt.Color.GREEN);
            }
        }

        return this;
    }}
    JTable miTabla = jTable1;

// Asigna renderizador a columnas
miTabla.getColumnModel().getColumn(3).setCellRenderer(new MiRenderizador()); // Prioridad
miTabla.getColumnModel().getColumn(2).setCellRenderer(new MiRenderizador()); // Estado
  miTabla.setRowHeight(30);
    }//GEN-LAST:event_selectorEstadoItemStateChanged
/**
     * Minimizar pantalla.
     **/
    private void btnMnimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMnimizarActionPerformed
        setState(Inicio.ICONIFIED);
    }//GEN-LAST:event_btnMnimizarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarNota;
    private javax.swing.JButton btnAsignarTarea;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminarTarea;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnMnimizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> selectorEstado;
    private javax.swing.JComboBox<String> selectorPrioridad;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
