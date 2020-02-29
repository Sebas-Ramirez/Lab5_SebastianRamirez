package lab5_sebastianramirez;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        DefaultComboBoxModel  modelo = (DefaultComboBoxModel)ComboBox_Personajes.getModel();
        modelo.addElement(new Superheroes());
        modelo.addElement(new Villanos());
        ComboBox_Personajes.setModel(modelo);
        tf_muertes.setEnabled(false);
        RadioBoton_no.setEnabled(false);
        RadioBoton_si.setEnabled(false);
        setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Frame_Personajes = new javax.swing.JFrame();
        ComboBox_Personajes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_edad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_planeta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_altura = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List_SuperHeroes = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        tf_villanos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        RadioBoton_si = new javax.swing.JRadioButton();
        RadioBoton_no = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        tf_muertes = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        arbol_personajes = new javax.swing.JTree();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        List_Villanos = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Mortal_Si = new javax.swing.JRadioButton();
        Mortal_no = new javax.swing.JRadioButton();
        PopUp = new javax.swing.JPopupMenu();
        Agregar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextField_Usuario = new javax.swing.JTextField();
        PasswordField_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        ComboBox_Personajes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBox_PersonajesItemStateChanged(evt);
            }
        });

        jLabel4.setText("Nombre");

        jLabel5.setText("Edad");

        jLabel6.setText("Planeta de Origen");

        jLabel7.setText("Altura");

        List_SuperHeroes.setModel(new DefaultListModel()
        );
        List_SuperHeroes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List_SuperHeroesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(List_SuperHeroes);

        jLabel8.setText("Villanos Atrapados");

        jLabel9.setText("Esta en la carcel?");

        RadioBoton_si.setText("Si");
        RadioBoton_si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioBoton_siMouseClicked(evt);
            }
        });

        RadioBoton_no.setText("No");
        RadioBoton_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioBoton_noMouseClicked(evt);
            }
        });

        jLabel10.setText("Muertes Causadas");

        jButton2.setText("Crear Personaje");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Personajes");
        arbol_personajes.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(arbol_personajes);

        jLabel11.setText("Super Heroes");

        List_Villanos.setModel(new DefaultListModel());
        List_Villanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List_VillanosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(List_Villanos);

        jLabel12.setText("Villanos");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab5_sebastianramirez/Icons/marvel.png"))); // NOI18N

        jLabel14.setText("Poder");

        jLabel15.setText("Descripcion");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, null, 10, 1));

        jLabel16.setText("Es Mortal?");

        Mortal_Si.setText("SI");
        Mortal_Si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mortal_SiMouseClicked(evt);
            }
        });

        Mortal_no.setText("No");
        Mortal_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mortal_noMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Frame_PersonajesLayout = new javax.swing.GroupLayout(Frame_Personajes.getContentPane());
        Frame_Personajes.getContentPane().setLayout(Frame_PersonajesLayout);
        Frame_PersonajesLayout.setHorizontalGroup(
            Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(ComboBox_Personajes, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel13))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(RadioBoton_si)
                        .addGap(6, 6, 6)
                        .addComponent(RadioBoton_no, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(tf_muertes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(tf_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel15)
                        .addGap(14, 14, 14)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Mortal_Si, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Mortal_no, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_villanos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        Frame_PersonajesLayout.setVerticalGroup(
            Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(ComboBox_Personajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RadioBoton_si)
                    .addComponent(RadioBoton_no))
                .addGap(12, 12, 12)
                .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_muertes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))))
                .addGap(12, 12, 12)
                .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addComponent(tf_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel14))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mortal_Si)
                    .addComponent(Mortal_no)
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11))
                    .addGroup(Frame_PersonajesLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel12))
                    .addComponent(tf_villanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Frame_PersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Agregar.setText("jMenuItem1");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        PopUp.add(Agregar);

        Eliminar.setText("jMenuItem2");
        PopUp.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Log In");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Contraseña");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab5_sebastianramirez/Icons/iconfinder_exit-enter-leave-door-in_2931189.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextField_Usuario)
                        .addComponent(PasswordField_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(TextField_Usuario.getText().equals("stanlee")&&PasswordField_pass.getText().equals("spiderman99")){
            Frame_Personajes.pack();
            Frame_Personajes.setVisible(true);
            Frame_Personajes.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String nombre = tf_nombre.getText();
        int edad = Integer.parseInt(tf_edad.getText());
        String planeta = tf_planeta.getText();
        int altura = Integer.parseInt(tf_altura.getText());
        int poder = (int)jSpinner1.getValue();
        String descripcion = jTextField1.getText();
        boolean mortal = true;
        if (Mortal_Si.isSelected()) {
            mortal = true;
        }else if (Mortal_no.isSelected())
            mortal= false;
        if(ComboBox_Personajes.getSelectedItem() instanceof Superheroes){
            DefaultListModel modelo = (DefaultListModel) List_SuperHeroes.getModel();
            int villanos = Integer.parseInt(tf_villanos.getText());
            modelo.addElement(new Superheroes(nombre, planeta, edad, altura, villanos, new Superpoderes(poder, descripcion, mortal)));
            JOptionPane.showMessageDialog(this,"Personaje Creado");
        }else if(ComboBox_Personajes.getSelectedItem() instanceof Villanos){
            boolean carcel = true;
            int muertes = Integer.parseInt(tf_muertes.getText());
            if (RadioBoton_si.isSelected()) {
            carcel = true;
            }else if (RadioBoton_no.isSelected())
            carcel= false;
            DefaultListModel modelo2 = (DefaultListModel) List_Villanos.getModel();
            modelo2.addElement(new Villanos(nombre, planeta, edad, altura, muertes, carcel, new Superpoderes(poder, descripcion, mortal), new Superpoderes(poder, descripcion, mortal)));
            JOptionPane.showMessageDialog(this,"Personaje Creado");
        }
        String blanco = "";
        tf_nombre.setText(blanco);    
        tf_altura.setText(blanco);
        tf_edad.setText(blanco);
        tf_muertes.setText(blanco);
        tf_planeta.setText(blanco);
        tf_villanos.setText(blanco);
    }//GEN-LAST:event_jButton2MouseClicked

    private void RadioBoton_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioBoton_noMouseClicked
        RadioBoton_si.setSelected(false);
    }//GEN-LAST:event_RadioBoton_noMouseClicked

    private void RadioBoton_siMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioBoton_siMouseClicked
        RadioBoton_no.setSelected(false);
    }//GEN-LAST:event_RadioBoton_siMouseClicked

    private void ComboBox_PersonajesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBox_PersonajesItemStateChanged
        if (evt.getStateChange()==2) {
            if(ComboBox_Personajes.getSelectedItem() instanceof Superheroes){
                tf_villanos.setEnabled(true);
                tf_muertes.setEnabled(false);
                RadioBoton_no.setEnabled(false);
                RadioBoton_si.setEnabled(false);
            }else if(ComboBox_Personajes.getSelectedItem() instanceof Villanos){
                tf_villanos.setEnabled(false);
                tf_muertes.setEnabled(true);
                RadioBoton_no.setEnabled(true);
                RadioBoton_si.setEnabled(true);
            }

        }
    }//GEN-LAST:event_ComboBox_PersonajesItemStateChanged

    private void Mortal_SiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mortal_SiMouseClicked
        Mortal_no.setSelected(false);
    }//GEN-LAST:event_Mortal_SiMouseClicked

    private void Mortal_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mortal_noMouseClicked
        Mortal_Si.setSelected(false);
    }//GEN-LAST:event_Mortal_noMouseClicked

    private void List_SuperHeroesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List_SuperHeroesMouseClicked
        if (List_SuperHeroes.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                PopUp.show(evt.getComponent(),
                    evt.getX(), evt.getY());

            }
        }
    }//GEN-LAST:event_List_SuperHeroesMouseClicked

    private void List_VillanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List_VillanosMouseClicked
        if (List_Villanos.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                PopUp.show(evt.getComponent(),
                    evt.getX(), evt.getY());

            }
        }
    }//GEN-LAST:event_List_VillanosMouseClicked

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        
        DefaultTreeModel arbol = (DefaultTreeModel) List_SuperHeroes.getModel();
        DefaultMutableTreeNode modelo = (DefaultMutableTreeNode) arbol.getRoot();
        String nombre;
    }//GEN-LAST:event_AgregarMouseClicked

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agregar;
    private javax.swing.JComboBox<String> ComboBox_Personajes;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JFrame Frame_Personajes;
    private javax.swing.JList<String> List_SuperHeroes;
    private javax.swing.JList<String> List_Villanos;
    private javax.swing.JRadioButton Mortal_Si;
    private javax.swing.JRadioButton Mortal_no;
    private javax.swing.JPasswordField PasswordField_pass;
    private javax.swing.JPopupMenu PopUp;
    private javax.swing.JRadioButton RadioBoton_no;
    private javax.swing.JRadioButton RadioBoton_si;
    private javax.swing.JTextField TextField_Usuario;
    private javax.swing.JTree arbol_personajes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tf_altura;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_muertes;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_planeta;
    private javax.swing.JTextField tf_villanos;
    // End of variables declaration//GEN-END:variables
}
