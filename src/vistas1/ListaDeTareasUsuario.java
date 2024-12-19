package vistas1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.beans1.Usuario;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;

/**
 Tabla con las tareas de mi usuario.
 **/
public class ListaDeTareasUsuario extends javax.swing.JFrame {
Usuario usuario;
    DefaultTableModel mt = new DefaultTableModel();
    
    /**
     * Creates new form ListaDeTareasUsuario.
     **/
    public ListaDeTareasUsuario(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        this.setLocationRelativeTo(null);
        String ids [] = {"Tarea","Prioridad", "Estado","Fecha de Inicio", "Fecha de entrega", "Descripción"};
        mt.setColumnIdentifiers(ids);
        jTable1.setModel(mt);
        for (int i = 0; i < usuario.lista().size(); i++) {
            mt.addRow(new Object[]{usuario.lista().get(i).getNombre(),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(),usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()  });
        }
       TableColumn columna = jTable1.getColumnModel().getColumn(5);
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
miTabla.getColumnModel().getColumn(1).setCellRenderer(new MiRenderizador()); // Prioridad
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btnCrearTarea = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        selectorPrioridad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        selectorEstado = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        BtnModificarTarea = new javax.swing.JButton();
        btnBorrarTarea = new javax.swing.JButton();
        btnActualizarTabla = new javax.swing.JButton();
        btnVerNota = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnMnimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(144, 101, 101));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 55)); // NOI18N
        jLabel1.setText("BIENVENID@ A TareasMooz");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jButton3.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton3.setText("LISTA DE TAREAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel3.setText("BUSCAR: ");

        txtBuscar.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

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
                "Nombre de la tarea", "Descripción", "Estado", "Prioridad", "Fecha de entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Prioridad:");

        selectorPrioridad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectorPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Baja", "Media", "Alta" }));
        selectorPrioridad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectorPrioridadItemStateChanged(evt);
            }
        });
        selectorPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorPrioridadActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Estado:");

        selectorEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectorEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Por hacer", "En progreso", "Completada" }));
        selectorEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectorEstadoItemStateChanged(evt);
            }
        });
        selectorEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectorEstadoMouseEntered(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(204, 255, 255));
        btnBuscar.setText("🔎");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        BtnModificarTarea.setBackground(new java.awt.Color(0, 102, 102));
        BtnModificarTarea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnModificarTarea.setForeground(new java.awt.Color(204, 255, 204));
        BtnModificarTarea.setText("MODIFICAR");
        BtnModificarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarTareaActionPerformed(evt);
            }
        });

        btnBorrarTarea.setBackground(new java.awt.Color(153, 0, 0));
        btnBorrarTarea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBorrarTarea.setForeground(new java.awt.Color(204, 255, 255));
        btnBorrarTarea.setText("BORRAR");
        btnBorrarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTareaActionPerformed(evt);
            }
        });

        btnActualizarTabla.setBackground(new java.awt.Color(0, 153, 204));
        btnActualizarTabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizarTabla.setText("ACTUALIZAR");
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        btnVerNota.setText("VER NOTA");
        btnVerNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(selectorPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(selectorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(BtnModificarTarea)
                .addGap(365, 365, 365)
                .addComponent(btnActualizarTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrarTarea)
                .addGap(48, 48, 48))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(518, 518, 518)
                .addComponent(btnVerNota)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selectorPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(selectorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificarTarea)
                    .addComponent(btnActualizarTabla)
                    .addComponent(btnBorrarTarea))
                .addGap(27, 27, 27)
                .addComponent(btnVerNota)
                .addContainerGap())
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
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(209, 209, 209)
                        .addComponent(btnCrearTarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarUsuario))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearTarea)
                    .addComponent(jButton3)
                    .addComponent(btnEditarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMnimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMnimizar)
                    .addComponent(btnCerrar))
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
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
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
/**
     * boton que al ser presionado, nos lleva a la interfaz gráfica Crear tarea.
     **/
    private void btnCrearTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTareaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CrearTareaUsuario c = new CrearTareaUsuario(usuario);
        c.setVisible(true);
        
    }//GEN-LAST:event_btnCrearTareaActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked
/**
     * boton que al ser presionado, nos lleva a la interfaz gráfica Editar datos de mi usuario.
     **/
    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        
         EditarMiUsuario e = new EditarMiUsuario(usuario);
         e.setLocationRelativeTo(null);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed
private boolean buscarPalabra(String palabra, String parrafo) {
    return parrafo.toLowerCase().contains(palabra.toLowerCase());
}
/**
     * Buscar una tarea en específico.
     * Buscar mediante la descripcion de una tarea.
     **/
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mt1 = new DefaultTableModel();
        String ids [] = {"Tarea","Prioridad", "Estado", "Fecha de inicio","Fecha de entrega", "Descripción"};
        mt1.setColumnIdentifiers(ids);
        jTable1.setModel(mt1);
        for (int i = 0; i < usuario.lista().size(); i++) {
            if("Todos".equals(selectorPrioridad.getSelectedItem().toString())){

                if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(),usuario.lista().get(i).getFechaIni(), usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                    }else{
                        if(txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) || buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion())  ){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}
                }
            }else{ if(selectorEstado.getSelectedItem().toString().equals(usuario.lista().get(i).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                }else{
                    if(txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) || buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion() )){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{}
        }
        }else{

            if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                if(selectorPrioridad.getSelectedItem().toString().equals(usuario.lista().get(i).getPrioridad())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                    }else{
                        if(txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) || buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion()) ){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}}
            }else{}

        }else{
            if(selectorPrioridad.getSelectedItem().toString().equals(usuario.lista().get(i).getPrioridad()) && selectorEstado.getSelectedItem().toString().equals(usuario.lista().get(i).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                }else{
                    if(buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion() ) || txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) ){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{

        }
        }

        }

        }
        mt=mt1;
        jTable1.setModel(mt);
        TableColumn columna = jTable1.getColumnModel().getColumn(5);
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
miTabla.getColumnModel().getColumn(1).setCellRenderer(new MiRenderizador()); // Prioridad
miTabla.getColumnModel().getColumn(2).setCellRenderer(new MiRenderizador()); // Estado
miTabla.setRowHeight(30);

    }//GEN-LAST:event_btnBuscarActionPerformed
/**
     * Selecciona una tarea para ser eliminada.
     **/
    private void btnBorrarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTareaActionPerformed
        // TODO add your handling code here:
          int filaSeleccionada = jTable1.getSelectedRow();
     if(filaSeleccionada != -1){
         String nombreAEliminar = mt.getValueAt(filaSeleccionada,0).toString();
         usuario.eliminar(nombreAEliminar);
         mt.removeRow(filaSeleccionada);
     }else{
         JOptionPane.showMessageDialog(this, "Selecciona una tarea para eliminar");
     }
    }//GEN-LAST:event_btnBorrarTareaActionPerformed
/**
     *Cerrar pantalla.
     * Abre la interfaz gráfica login.
     **/
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed
/**
     * Selecciona una tarea para ser modificada.
     **/
    private void BtnModificarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarTareaActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTable1.getSelectedRow();
     if(filaSeleccionada != -1){
         String nombreAModificar = mt.getValueAt(filaSeleccionada,0).toString();
         EditarMiTareaUsuario e = new EditarMiTareaUsuario(usuario.obtener(nombreAModificar));
         e.setVisible(true);
       
     }else{
         JOptionPane.showMessageDialog(this, "Selecciona una tarea para modificar");
     }
    }//GEN-LAST:event_BtnModificarTareaActionPerformed
/**
     * Actualizar la tabla.
     **/
    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        DefaultTableModel mt4 = new DefaultTableModel();
        String ids [] = {"Tarea","Prioridad", "Estado","Fecha de inicio", "Fecha de entrega", "Descripción"};
        mt4.setColumnIdentifiers(ids);
        jTable1.setModel(mt4);
        for (int i = 0; i < usuario.lista().size(); i++) {
            mt4.addRow(new Object[]{usuario.lista().get(i).getNombre(),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(),usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()  });
        }
       mt=mt4;
        jTable1.setModel(mt);
        TableColumn columna = jTable1.getColumnModel().getColumn(5);
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
miTabla.getColumnModel().getColumn(1).setCellRenderer(new MiRenderizador()); // Prioridad
miTabla.getColumnModel().getColumn(2).setCellRenderer(new MiRenderizador()); // Estado
miTabla.setRowHeight(30);
txtBuscar.setText("");
    
    }//GEN-LAST:event_btnActualizarTablaActionPerformed
/**
     *Ver si la tarea tiene una nota.
     **/
    private void btnVerNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerNotaActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTable1.getSelectedRow();
     if(filaSeleccionada != -1){
         String nombreAModificar = mt.getValueAt(filaSeleccionada,0).toString();
         JOptionPane.showMessageDialog(this,usuario.obtener(nombreAModificar).getComentario() );
       
     }else{
         JOptionPane.showMessageDialog(this, "Selecciona una tarea para ver la nota");
     }
    }//GEN-LAST:event_btnVerNotaActionPerformed

    private void selectorEstadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectorEstadoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_selectorEstadoMouseEntered
/**
     * Selecciona una prioridad del selector para buscarlo en la tabla.
     **/
    private void selectorPrioridadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectorPrioridadItemStateChanged
       DefaultTableModel mt1 = new DefaultTableModel();
        String ids [] = {"Tarea","Prioridad", "Estado", "Fecha de inicio","Fecha de entrega", "Descripción"};
        mt1.setColumnIdentifiers(ids);
        jTable1.setModel(mt1);
        for (int i = 0; i < usuario.lista().size(); i++) {
            if("Todos".equals(selectorPrioridad.getSelectedItem().toString())){

                if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(),usuario.lista().get(i).getFechaIni(), usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                    }else{
                        if(txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) || buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion())  ){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}
                }
            }else{ if(selectorEstado.getSelectedItem().toString().equals(usuario.lista().get(i).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                }else{
                    if(txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) || buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion() )){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{}
        }
        }else{

            if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                if(selectorPrioridad.getSelectedItem().toString().equals(usuario.lista().get(i).getPrioridad())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                    }else{
                        if(txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) || buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion()) ){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}}
            }else{}

        }else{
            if(selectorPrioridad.getSelectedItem().toString().equals(usuario.lista().get(i).getPrioridad()) && selectorEstado.getSelectedItem().toString().equals(usuario.lista().get(i).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                }else{
                    if(buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion() ) || txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) ){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{

        }
        }

        }

        }
        mt=mt1;
        jTable1.setModel(mt);
        TableColumn columna = jTable1.getColumnModel().getColumn(5);
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
miTabla.getColumnModel().getColumn(1).setCellRenderer(new MiRenderizador()); // Prioridad
miTabla.getColumnModel().getColumn(2).setCellRenderer(new MiRenderizador()); // Estado
miTabla.setRowHeight(30);

    }//GEN-LAST:event_selectorPrioridadItemStateChanged
/**
     * Selecciona un estado del selector para buscarlo en la tabla.
     **/
    private void selectorEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectorEstadoItemStateChanged
       DefaultTableModel mt1 = new DefaultTableModel();
        String ids [] = {"Tarea","Prioridad", "Estado", "Fecha de inicio","Fecha de entrega", "Descripción"};
        mt1.setColumnIdentifiers(ids);
        jTable1.setModel(mt1);
        for (int i = 0; i < usuario.lista().size(); i++) {
            if("Todos".equals(selectorPrioridad.getSelectedItem().toString())){

                if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(),usuario.lista().get(i).getFechaIni(), usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                    }else{
                        if(txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) || buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion())  ){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}
                }
            }else{ if(selectorEstado.getSelectedItem().toString().equals(usuario.lista().get(i).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                }else{
                    if(txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) || buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion() )){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{}
        }
        }else{

            if("Todos".equals(selectorEstado.getSelectedItem().toString())){
                if(selectorPrioridad.getSelectedItem().toString().equals(usuario.lista().get(i).getPrioridad())){
                    if(txtBuscar.getText().isEmpty()){
                        System.out.println("Funcioa");
                        mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                    }else{
                        if(txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) || buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion()) ){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                        System.out.println("Funcioa1234");}else{}}
            }else{}

        }else{
            if(selectorPrioridad.getSelectedItem().toString().equals(usuario.lista().get(i).getPrioridad()) && selectorEstado.getSelectedItem().toString().equals(usuario.lista().get(i).getEstado())){
                if(txtBuscar.getText().isEmpty()){
                    System.out.println("Funcioa");
                    mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});

                }else{
                    if(buscarPalabra(txtBuscar.getText(), usuario.lista().get(i).getDescripcion() ) || txtBuscar.getText().equals(usuario.lista().get(i).getNombre()) ){ mt1.addRow(new Object[]{usuario.lista().get(i),usuario.lista().get(i).getPrioridad(),usuario.lista().get(i).getEstado(), usuario.lista().get(i).getFechaIni(),usuario.lista().get(i).getFechaEn(),usuario.lista().get(i).getDescripcion()});
                    System.out.println("Funcioa1234");}else{}}
        }else{

        }
        }

        }

        }
        mt=mt1;
        jTable1.setModel(mt);
        TableColumn columna = jTable1.getColumnModel().getColumn(5);
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
miTabla.getColumnModel().getColumn(1).setCellRenderer(new MiRenderizador()); // Prioridad
miTabla.getColumnModel().getColumn(2).setCellRenderer(new MiRenderizador()); // Estado
miTabla.setRowHeight(30);
    }//GEN-LAST:event_selectorEstadoItemStateChanged

    private void selectorPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorPrioridadActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_selectorPrioridadActionPerformed
/**
     * Minimizar pantalla.
     **/
    private void btnMnimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMnimizarActionPerformed
        setState(ListaDeTareasUsuario.ICONIFIED);
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
            java.util.logging.Logger.getLogger(ListaDeTareasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeTareasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeTareasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeTareasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeTareasUsuario(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModificarTarea;
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnBorrarTarea;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrearTarea;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnMnimizar;
    private javax.swing.JButton btnVerNota;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> selectorEstado;
    private javax.swing.JComboBox<String> selectorPrioridad;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
