package Games;


import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Family
 */
public class NumberRace extends javax.swing.JFrame {

    /**
     * Creates new form NumberRace
     */
    int counter = 0;
    
    public NumberRace() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icons/car.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblD2 = new javax.swing.JLabel();
        lblD1 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        lblCounter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number race");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Number race");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 80, 710, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car64px.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(280, -10, 160, 120);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dices"));
        jPanel2.setLayout(null);

        lblD2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblD2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/question.png"))); // NOI18N
        jPanel2.add(lblD2);
        lblD2.setBounds(30, 180, 150, 130);

        lblD1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/question.png"))); // NOI18N
        jPanel2.add(lblD1);
        lblD1.setBounds(30, 10, 150, 150);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 100, 210, 320);

        button1.setLabel("Play");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1);
        button1.setBounds(50, 430, 210, 40);

        button2.setLabel("Try again");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(50, 480, 210, 40);

        lblCounter.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        lblCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCounter.setText("0");
        jPanel1.add(lblCounter);
        lblCounter.setBounds(350, 100, 280, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        //Dices
        Random D = new Random();
        int d1 = 0, d2 = 0;
        
        d1 = (int)(D.nextDouble()* 6 + 1);
        d2 = (int)(D.nextDouble()* 6 + 1);
        
        counter = counter + (d1 + d2);
        lblCounter.setText(Integer.toString(counter));
        
        //lblD1.setText(Integer.toString(d1));
        //lblD2.setText(Integer.toString(d2));
        
        switch(d1){
            case 1:
                lblD1.setIcon(new ImageIcon(getClass().getResource("/images/1.png")));
                break;
            case 2:
                lblD1.setIcon(new ImageIcon(getClass().getResource("/images/2.png")));
                break;
            case 3:
                lblD1.setIcon(new ImageIcon(getClass().getResource("/images/3.png")));
                break;
            case 4:
                lblD1.setIcon(new ImageIcon(getClass().getResource("/images/4.png")));
                break;
            case 5:
                lblD1.setIcon(new ImageIcon(getClass().getResource("/images/5.png")));
                break;
            case 6:
                lblD1.setIcon(new ImageIcon(getClass().getResource("/images/6.png")));
                break;
            default:
                break;
        }
        
        switch(d2){
            case 1:
                lblD2.setIcon(new ImageIcon(getClass().getResource("/images/1.png")));
                break;
            case 2:
                lblD2.setIcon(new ImageIcon(getClass().getResource("/images/2.png")));
                break;
            case 3:
                lblD2.setIcon(new ImageIcon(getClass().getResource("/images/3.png")));
                break;
            case 4:
                lblD2.setIcon(new ImageIcon(getClass().getResource("/images/4.png")));
                break;
            case 5:
                lblD2.setIcon(new ImageIcon(getClass().getResource("/images/5.png")));
                break;
            case 6:
                lblD2.setIcon(new ImageIcon(getClass().getResource("/images/6.png")));
                break;
            default:
                break;
        }
        
        if(d1 == 1 && d2 == 1){
            JOptionPane.showMessageDialog(null, "::: YOU WIN :::");
        }  
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        //lblD1.setText("?");
        //lblD2.setText("?");
        lblD1.setIcon(new ImageIcon(getClass().getResource("/images/question.png")));
        lblD2.setIcon(new ImageIcon(getClass().getResource("/images/question.png")));
        
        lblCounter.setText("0");
    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberRace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberRace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblCounter;
    private javax.swing.JLabel lblD1;
    private javax.swing.JLabel lblD2;
    // End of variables declaration//GEN-END:variables
}
