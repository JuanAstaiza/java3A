package ejercicios;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN CARLOS ASTAIZA
 */
public class StringManager extends javax.swing.JFrame {
        String yName="",yNameU=""; //yNameU variable nombre unido.
        int NCharacters=0;
    /**
     * Creates new form StringManager
     */
    public StringManager() {
        initComponents();
        //Centramos el JFrame en nuestra Pantalla
        this.setLocationRelativeTo(null);
        //Cambiar el icono a un frame
        setIconImage(new ImageIcon(getClass().getResource("cubo.png")).getImage());
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanelPrincipal = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnSpanish = new javax.swing.JButton();
        btnEnglish = new javax.swing.JButton();
        jPInformation = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        lolName = new javax.swing.JLabel();
        jLabelNameMay = new javax.swing.JLabel();
        jLabelNameMin = new javax.swing.JLabel();
        lolNameMay = new javax.swing.JLabel();
        lolNameMin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelNumberCharacters = new javax.swing.JLabel();
        lolCharacters = new javax.swing.JLabel();
        lolNameMayMin = new javax.swing.JLabel();
        jLabelNameMayMin = new javax.swing.JLabel();
        jPanelLetterFinder = new javax.swing.JPanel();
        txtNumberCharacters = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtLetter = new javax.swing.JLabel();
        lolLetter = new javax.swing.JLabel();
        btnMIN = new javax.swing.JButton();
        btnMAY = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("String Manager");
        setPreferredSize(new java.awt.Dimension(360, 600));
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 153));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setText("Your name:");

        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtName.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtNameAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 102, 0));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.setEnabled(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnShow.setBackground(new java.awt.Color(102, 0, 0));
        btnShow.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("SHOW");
        btnShow.setEnabled(false);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnSpanish.setBackground(new java.awt.Color(255, 102, 0));
        btnSpanish.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSpanish.setForeground(new java.awt.Color(255, 255, 255));
        btnSpanish.setText("Sp");
        btnSpanish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpanishActionPerformed(evt);
            }
        });

        btnEnglish.setBackground(new java.awt.Color(0, 0, 153));
        btnEnglish.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEnglish.setForeground(new java.awt.Color(255, 255, 255));
        btnEnglish.setText("En");
        btnEnglish.setEnabled(false);
        btnEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnglishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(129, 129, 129)
                        .addComponent(btnEnglish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSpanish)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEnglish)
                        .addComponent(btnSpanish))
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPInformation.setBackground(new java.awt.Color(255, 204, 102));
        jPInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelName.setText("Your name is:");

        lolName.setText("_");

        jLabelNameMay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNameMay.setText("Your name in MAY:");

        jLabelNameMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNameMin.setText("Your name in MIN:");

        lolNameMay.setText("_");

        lolNameMin.setText("_");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabelNumberCharacters.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNumberCharacters.setText("Total characters:");

        lolCharacters.setText("_");

        lolNameMayMin.setText("_");

        jLabelNameMayMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNameMayMin.setText("Initial capital letters:");

        jPanelLetterFinder.setBackground(new java.awt.Color(204, 255, 102));
        jPanelLetterFinder.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Letter finder", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        btnSearch.setBackground(new java.awt.Color(255, 255, 0));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtLetter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtLetter.setText("Type a number:");

        lolLetter.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        lolLetter.setText("?");

        btnMIN.setBackground(new java.awt.Color(255, 102, 0));
        btnMIN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMIN.setForeground(new java.awt.Color(255, 255, 255));
        btnMIN.setText("MIN");
        btnMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMINActionPerformed(evt);
            }
        });

        btnMAY.setBackground(new java.awt.Color(0, 0, 153));
        btnMAY.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMAY.setForeground(new java.awt.Color(255, 255, 255));
        btnMAY.setText("MAY");
        btnMAY.setEnabled(false);
        btnMAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLetterFinderLayout = new javax.swing.GroupLayout(jPanelLetterFinder);
        jPanelLetterFinder.setLayout(jPanelLetterFinderLayout);
        jPanelLetterFinderLayout.setHorizontalGroup(
            jPanelLetterFinderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLetterFinderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLetterFinderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumberCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLetter))
                .addGap(59, 59, 59)
                .addComponent(lolLetter)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLetterFinderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMAY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanelLetterFinderLayout.setVerticalGroup(
            jPanelLetterFinderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLetterFinderLayout.createSequentialGroup()
                .addGroup(jPanelLetterFinderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLetterFinderLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lolLetter)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLetterFinderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMAY)
                            .addComponent(btnMIN)))
                    .addGroup(jPanelLetterFinderLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtLetter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumberCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPInformationLayout = new javax.swing.GroupLayout(jPInformation);
        jPInformation.setLayout(jPInformationLayout);
        jPInformationLayout.setHorizontalGroup(
            jPInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInformationLayout.createSequentialGroup()
                .addGroup(jPInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPInformationLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNameMin)
                            .addComponent(jLabelNameMay)
                            .addComponent(jLabelNameMayMin)))
                    .addComponent(jLabelNumberCharacters))
                .addGap(42, 42, 42)
                .addGroup(jPInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lolNameMayMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lolCharacters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lolNameMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lolNameMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lolName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
            .addGroup(jPInformationLayout.createSequentialGroup()
                .addGroup(jPInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPInformationLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel6))
                    .addComponent(jPanelLetterFinder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPInformationLayout.setVerticalGroup(
            jPInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName)
                    .addComponent(lolName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNameMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lolNameMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNameMin)
                    .addComponent(lolNameMin, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumberCharacters)
                    .addComponent(lolCharacters))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNameMayMin)
                    .addComponent(lolNameMayMin, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanelLetterFinder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(356, 356, 356))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        yName=txtName.getText();
        if(yName.equals("")){
            btnShow.setEnabled(false);
            
            lolName.setText("");
            lolNameMay.setText("");
            lolNameMin.setText("");
            lolCharacters.setText("");
            lolNameMayMin.setText("");            
            lolLetter.setText("?");
            txtNumberCharacters.setText("");
            
            btnReset.setEnabled(false);
        }else{
            btnShow.setEnabled(true);
            txtName.setText(null);
            btnReset.setEnabled(true);
        }
        
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        yName=txtName.getText();
        
        if(yName.equals("")){
            btnShow.setEnabled(false);
            
            lolName.setText("");
            lolNameMay.setText("");
            lolNameMin.setText("");
            lolCharacters.setText("");
            lolNameMayMin.setText("");            
            lolLetter.setText("?");
            txtNumberCharacters.setText("");

            btnReset.setEnabled(false);
            
        }else{
            btnShow.setEnabled(true);
            System.out.println("Your name is: "+yName);
        
            lolName.setText(yName);

            lolNameMay.setText(yName.toUpperCase());
            lolNameMin.setText(yName.toLowerCase());

            yNameU=yName.replace(" ","");
            lolCharacters.setText(""+yName.length());

            String [] palabras = yName.split(" ");
            String NewName=May_Min(palabras);
            lolNameMayMin.setText(NewName); 
            
            btnReset.setEnabled(true);
        }
        

        
    }//GEN-LAST:event_btnShowActionPerformed

    public String May_Min(String cadenareal[]){ 
            String nuevacadena=""; 
            for(int i = 0; i < cadenareal.length; i++) {
            nuevacadena += cadenareal[i].substring(0, 1).toUpperCase() + cadenareal[i].substring(1, cadenareal[i].length()).toLowerCase() + " ";
            }
            nuevacadena = nuevacadena.trim();
        return nuevacadena;
    }

    
    
    
    private void btnSpanishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpanishActionPerformed
        btnEnglish.setEnabled(true);
        setTitle("Administrador de cadenas");
        lblName.setText("Tu nombre:");
        btnShow.setText("MOSTRAR");
        btnReset.setText("LIMPIAR");
        jPInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Información"));
        TitledBorder titledBorder = (TitledBorder)jPInformation.getBorder();
        titledBorder.setTitleColor(Color.RED);
        jLabelName.setText("Tu nombre es:");
        jLabelNameMay.setText("Tu nombre en MAY:");
        jLabelNameMin.setText("Tu nombre en MIN:");
        jLabelNumberCharacters.setText("Total caracteres:");
        jLabelNameMayMin.setText("Iniciales mayúsculas:");
        jPanelLetterFinder.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscador de letras"));
        TitledBorder titledBorderLetterFinder = (TitledBorder)jPanelLetterFinder.getBorder();
        titledBorderLetterFinder.setTitleColor(Color.RED); 
        txtLetter.setText("Digite un número:");
        btnSearch.setText("BUSCAR");
        btnSpanish.setEnabled(false);
    }//GEN-LAST:event_btnSpanishActionPerformed

    private void btnEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnglishActionPerformed
        btnSpanish.setEnabled(true);
        setTitle("String Manager");
        lblName.setText("Your Name:");
        btnShow.setText("SHOW");
        btnReset.setText("RESET");
        jPInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        TitledBorder titledBorder = (TitledBorder)jPInformation.getBorder();
        titledBorder.setTitleColor(Color.RED);
        jLabelName.setText("Your name is:");
        jLabelNameMay.setText("Your name in MAY:");
        jLabelNameMin.setText("Your name in MIN:");
        jLabelNumberCharacters.setText("Total characters:");
        jLabelNameMayMin.setText("Initial capital letters:");
        jPanelLetterFinder.setBorder(javax.swing.BorderFactory.createTitledBorder("Letter finder"));
        TitledBorder titledBorderLetterFinder = (TitledBorder)jPanelLetterFinder.getBorder();
        titledBorderLetterFinder.setTitleColor(Color.RED);        
        btnSearch.setText("SEARCH");
        txtLetter.setText("Type a number:");
        btnEnglish.setEnabled(false);

    }//GEN-LAST:event_btnEnglishActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        NCharacters=Integer.parseInt(txtNumberCharacters.getText());    
        lolLetter.setText(""+yName.charAt(NCharacters-1));
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnMAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAYActionPerformed
        btnMIN.setEnabled(true);
        lolLetter.setText(""+yName.toUpperCase().charAt(NCharacters-1));
        btnMAY.setEnabled(false);

    }//GEN-LAST:event_btnMAYActionPerformed

    private void btnMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMINActionPerformed
        btnMAY.setEnabled(true);
        lolLetter.setText(""+yName.toLowerCase().charAt(NCharacters-1));
        btnMIN.setEnabled(false);
    }//GEN-LAST:event_btnMINActionPerformed

    private void txtNameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtNameAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameAncestorAdded

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
       if(txtName.getText()!=""){
        btnShow.setEnabled(true);
        btnReset.setEnabled(true);
       }else{
        btnShow.setEnabled(false);
        btnReset.setEnabled(false);
       }
    }//GEN-LAST:event_txtNameKeyPressed

    
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
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnglish;
    private javax.swing.JButton btnMAY;
    private javax.swing.JButton btnMIN;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSpanish;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNameMay;
    private javax.swing.JLabel jLabelNameMayMin;
    private javax.swing.JLabel jLabelNameMin;
    private javax.swing.JLabel jLabelNumberCharacters;
    private javax.swing.JPanel jPInformation;
    private javax.swing.JPanel jPanelLetterFinder;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lolCharacters;
    private javax.swing.JLabel lolLetter;
    private javax.swing.JLabel lolName;
    private javax.swing.JLabel lolNameMay;
    private javax.swing.JLabel lolNameMayMin;
    private javax.swing.JLabel lolNameMin;
    private javax.swing.JLabel txtLetter;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumberCharacters;
    // End of variables declaration//GEN-END:variables
}
