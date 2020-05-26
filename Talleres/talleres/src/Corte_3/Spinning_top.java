package Corte_3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanc
 */

public class Spinning_top extends javax.swing.JFrame {

    /**
     * Creates new form Spinning_top
     */
    int jugador=1,acumuladorMonedas=0;
    String numeroMonedas;
    
    ArrayList<Integer>  monedas = new ArrayList<Integer>();
    ArrayList<JTextField>  txtField = new ArrayList<JTextField>();
    ArrayList<Color>  colorTxtfield = new ArrayList<Color>();

    public Spinning_top() {
        initComponents();
        //No permitimos cambiar tamaño
        setResizable(false);
        //Cambiar el icono a un frame
        setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
        
        txtField.add(txt_CoinsPlayer1);
        txtField.add(txt_CoinsPlayer2);
        txtField.add(txt_CoinsPlayer3);
        txtField.add(txt_CoinsPlayer4);
        
        Color colorPlayer1=new Color(255,102,0);
        Color colorPlayer2=new Color(0,102,102);
        Color colorPlayer3=new Color(0,102,51);
        Color colorPlayer4=new Color(0,0,204);

        colorTxtfield.add(colorPlayer1);
        colorTxtfield.add(colorPlayer2);
        colorTxtfield.add(colorPlayer3);
        colorTxtfield.add(colorPlayer4);  
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
        jPanel2 = new javax.swing.JPanel();
        txt_CoinsPlayer1 = new javax.swing.JTextField();
        txt_CoinsPlayer2 = new javax.swing.JTextField();
        txt_CoinsPlayer3 = new javax.swing.JTextField();
        txt_CoinsPlayer4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        img_Pirinola = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_Play = new javax.swing.JButton();
        cmb_Coins = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_acumulador = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_ganador = new javax.swing.JLabel();
        btn_reiniciarJuego = new javax.swing.JButton();
        btn_players = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spinning top");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Play zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        txt_CoinsPlayer1.setEditable(false);
        txt_CoinsPlayer1.setBackground(new java.awt.Color(255, 102, 0));
        txt_CoinsPlayer1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_CoinsPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        txt_CoinsPlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_CoinsPlayer2.setEditable(false);
        txt_CoinsPlayer2.setBackground(new java.awt.Color(0, 102, 102));
        txt_CoinsPlayer2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_CoinsPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        txt_CoinsPlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_CoinsPlayer3.setEditable(false);
        txt_CoinsPlayer3.setBackground(new java.awt.Color(0, 102, 51));
        txt_CoinsPlayer3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_CoinsPlayer3.setForeground(new java.awt.Color(255, 255, 255));
        txt_CoinsPlayer3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_CoinsPlayer4.setEditable(false);
        txt_CoinsPlayer4.setBackground(new java.awt.Color(0, 0, 204));
        txt_CoinsPlayer4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_CoinsPlayer4.setForeground(new java.awt.Color(255, 255, 255));
        txt_CoinsPlayer4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Coins");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Coins");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Coins");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Coins");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Player 4");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Player 1");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Player 2");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 255, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Player 3");

        img_Pirinola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_Pirinola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesCorte3/question.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_CoinsPlayer4)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_CoinsPlayer3)
                            .addComponent(txt_CoinsPlayer1)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(img_Pirinola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_CoinsPlayer2)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_CoinsPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_CoinsPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CoinsPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(img_Pirinola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_CoinsPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Config zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        btn_Play.setBackground(new java.awt.Color(0, 102, 102));
        btn_Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesCorte3/play.png"))); // NOI18N
        btn_Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PlayActionPerformed(evt);
            }
        });

        cmb_Coins.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "5", "10", "20", "30" }));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Coins per player:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_Coins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_Play, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Coins, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Play, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Acumulated", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        txt_acumulador.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        txt_acumulador.setForeground(new java.awt.Color(255, 0, 0));
        txt_acumulador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_acumulador.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_acumulador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txt_acumulador, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Winner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        txt_ganador.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        txt_ganador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_ganador.setText("?");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_ganador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txt_ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        btn_reiniciarJuego.setBackground(new java.awt.Color(0, 102, 51));
        btn_reiniciarJuego.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_reiniciarJuego.setForeground(new java.awt.Color(255, 255, 255));
        btn_reiniciarJuego.setText("Reiniciar Juego");
        btn_reiniciarJuego.setEnabled(false);
        btn_reiniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarJuegoActionPerformed(evt);
            }
        });

        btn_players.setBackground(new java.awt.Color(204, 0, 0));
        btn_players.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_players.setForeground(new java.awt.Color(255, 255, 255));
        btn_players.setText("Spin around -> Player #");
        btn_players.setEnabled(false);
        btn_players.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_players, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_reiniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reiniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_players, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PlayActionPerformed
        jugador=1;
        acumuladorMonedas=0;
        numeroMonedas= cmb_Coins.getSelectedItem().toString();
        
        if(numeroMonedas.equals("Seleccione una opción")){
           JOptionPane.showMessageDialog(null, "Seleccione la cantidad de monedas.");
        }else{
            for (int i = 0; i < txtField.size(); i++) {
                txtField.get(i).setText(numeroMonedas);
                txtField.get(i).setBackground(colorTxtfield.get(i));
              
            }
            
            btn_Play.setEnabled(false);
            cmb_Coins.setEnabled(false);
            btn_players.setEnabled(true);
            btn_reiniciarJuego.setEnabled(true);
            btn_players.setText("Spin around -> Player 1");
            
            txt_ganador.setText("?");
            txt_acumulador.setText("0");

            for (int i = 1; i <= 4; i++) {
                monedas.add(Integer.parseInt(numeroMonedas));     
            }    
            System.out.println("MONEDAS DE CADA JUGADOR: "+monedas);

        }
    }//GEN-LAST:event_btn_PlayActionPerformed

    private void btn_reiniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarJuegoActionPerformed
        jugador=1;
        acumuladorMonedas=0;
        monedas.clear();
        txt_acumulador.setText("0");
        txt_ganador.setText("?");

        
        for (int i = 0; i < txtField.size(); i++) {
                txtField.get(i).setText(numeroMonedas);
                txtField.get(i).setBackground(colorTxtfield.get(i));
              
        }

        btn_Play.setEnabled(false);
        cmb_Coins.setEnabled(false);
        btn_players.setEnabled(true);
        btn_reiniciarJuego.setEnabled(true);
        btn_players.setText("Spin around -> Player 1");
             

            for (int i = 1; i <= 4; i++) {
                monedas.add(Integer.parseInt(numeroMonedas));     
            }    
        System.out.println("MONEDAS DE CADA JUGADOR: "+monedas);
    }//GEN-LAST:event_btn_reiniciarJuegoActionPerformed

    private void btn_playersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playersActionPerformed
 
        Random Pirinola = new Random();
        int cara;
        
        cara = (int)(Pirinola.nextDouble()* 6 + 1);
        //MOSTRAR CARA DE LA PIRINOLA
        for (int i = 1; i<=6; i++) {
          if(i==cara){
              img_Pirinola.setIcon(new ImageIcon(getClass().getResource("/imagesCorte3/"+i+".png")));
          }           
        }  
        //VALIDAR CARAS DE LA PIRINOLA PARA LOS JUGADORES
        int monedaActual=monedas.get(jugador-1);
        int monedaActualActualizada=0,valorMoneda=0;
        int jugadoractual=jugador-1;

        switch(cara){
            case 1:
                System.out.println("PON 1");
                if(monedaActual>0){
                    monedas.set(jugador-1, monedaActual-1);
                    acumuladorMonedas=acumuladorMonedas+1;   
                    monedaActualActualizada=monedas.get(jugador-1);
                    validarJugador(monedaActualActualizada,jugadoractual);
                } 
                break;
            case 2:
                valorMoneda=2;
                if(monedaActual>0){
                    if(monedaActual==1){
                        valorMoneda=1;
                    }
                    System.out.println("PON 2");
                    monedas.set(jugador-1, monedaActual-valorMoneda);
                    acumuladorMonedas=acumuladorMonedas+valorMoneda;
                    monedaActualActualizada=monedas.get(jugador-1);
                    validarJugador(monedaActualActualizada,jugadoractual);
                }
                break;
           case 3:
                if(acumuladorMonedas>0){
                    if(monedaActual>0){
                        System.out.println("TOMA 1");
                        monedas.set(jugador-1, monedaActual+1);
                        acumuladorMonedas=acumuladorMonedas-1;
                        monedaActualActualizada=monedas.get(jugador-1);
                        validarJugador(monedaActualActualizada,jugadoractual);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El banco no tiene saldo para pagar.");     
                }
                break;
            case 4:
                valorMoneda=2;
                if(acumuladorMonedas>0){
                    if(monedaActual>0){
                        if(acumuladorMonedas==1){
                            valorMoneda=1;
                        }
                        System.out.println("TOMA 2");
                        monedas.set(jugador-1, monedaActual+valorMoneda);
                        acumuladorMonedas=acumuladorMonedas-valorMoneda;
                        monedaActualActualizada=monedas.get(jugador-1);
                        validarJugador(monedaActualActualizada,jugadoractual);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El banco no tiene saldo para pagar.");     
                }   
                break;
            case 5:
              System.out.println("TOMA TODO");
               if(acumuladorMonedas>0){
                    if(monedaActual>0){
                        monedas.set(jugador-1, monedaActual+acumuladorMonedas);
                        acumuladorMonedas=acumuladorMonedas-acumuladorMonedas;  
                    } 
                    monedaActualActualizada=monedas.get(jugador-1);
                    validarJugador(monedaActualActualizada,jugadoractual);
               }else{
                    JOptionPane.showMessageDialog(null, "El banco no tiene saldo para pagar.");
               }  
                break;
            case 6:
                System.out.println("TODOS PONEN");
                for (int i = 0; i <= monedas.size()-1; i++) {
                    monedaActual=monedas.get(i);
                    if(monedaActual>0){
                        monedas.set(i, monedaActual-1);  
                        acumuladorMonedas++; 
                        monedaActualActualizada=monedas.get(i);
                        validarJugador(monedaActualActualizada,i);
                    }
                }
                break;
        }
        
        System.out.println("MODENA ARRAY LIST: "+monedas);
        
        System.out.println("ACUMULADOR: "+acumuladorMonedas);
        


        txt_acumulador.setText(Integer.toString(acumuladorMonedas));

        
        turnos(); //validamos el jugador si tiene monedas o no.
 
    }//GEN-LAST:event_btn_playersActionPerformed
    
    private void turnos() {
        jugador++;
        int aux=0;
        if(jugador==5){            
            jugador=1;   
        }
        int posicion=jugador-1;
        do{            
            if(monedas.get(posicion)<=0){
                jugador++;
                if (jugador==5) {
                   jugador=1;
                   posicion=-1;
                }
            }else{
                break; //Detener bucle
            }
            aux++;
            if(aux>4){
                break; //Detener bucle
            }
            posicion++;
        }while(posicion<monedas.size());
        ganador();
        
        btn_players.setText("Spin around -> Player "+Integer.toString(jugador)); 
        System.out.println("POSICION: "+Integer.toString(jugador-1));     
    }
    
    private void ganador(){
        int x=4;
        for (int i = 0; i < monedas.size(); i++) {
            if(monedas.get(i)<=0){
                x--;
            }
        }
        if(x==1){
            btn_players.setEnabled(false);
            btn_reiniciarJuego.setEnabled(false);
            btn_Play.setEnabled(true);
            cmb_Coins.setEnabled(true);
            txt_ganador.setText(Integer.toString(jugador));
            monedas.clear();         
            
        }
    }

    
    
    private void validarJugador(int modena,int jugadoractual) {
        System.out.println("MODENA: "+modena);
        System.out.println("JUGADOR: "+jugadoractual);
        switch(jugadoractual){
            case 0:
                if(modena>0){
                    txt_CoinsPlayer1.setText(Integer.toString(monedas.get(jugadoractual)));                        
                }else{
                    txt_CoinsPlayer1.setText("GAME OVER");  
                    txt_CoinsPlayer1.setBackground(Color.BLACK);
                }
                break;
           case 1:
                if(modena>0){
                    txt_CoinsPlayer2.setText(Integer.toString(monedas.get(jugadoractual)));                        
                }else{
                    txt_CoinsPlayer2.setText("GAME OVER");  
                    txt_CoinsPlayer2.setBackground(Color.BLACK);
                }
                break;
            case 2:      
                if(modena>0){
                    txt_CoinsPlayer3.setText(Integer.toString(monedas.get(jugadoractual)));                        
                }else{
                    txt_CoinsPlayer3.setText("GAME OVER");  
                    txt_CoinsPlayer3.setBackground(Color.BLACK);
                }
                break;
            case 3:
                if(modena>0){
                    txt_CoinsPlayer4.setText(Integer.toString(monedas.get(jugadoractual)));                        
                }else{
                    txt_CoinsPlayer4.setText("GAME OVER");  
                    txt_CoinsPlayer4.setBackground(Color.BLACK);
                }
                break;
        }
    }
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
            java.util.logging.Logger.getLogger(Spinning_top.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spinning_top.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spinning_top.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spinning_top.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Spinning_top().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Play;
    private javax.swing.JButton btn_players;
    private javax.swing.JButton btn_reiniciarJuego;
    private javax.swing.JComboBox<String> cmb_Coins;
    private javax.swing.JLabel img_Pirinola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txt_CoinsPlayer1;
    private javax.swing.JTextField txt_CoinsPlayer2;
    private javax.swing.JTextField txt_CoinsPlayer3;
    private javax.swing.JTextField txt_CoinsPlayer4;
    private javax.swing.JLabel txt_acumulador;
    private javax.swing.JLabel txt_ganador;
    // End of variables declaration//GEN-END:variables




}
