/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pamela
 */
public class BirthdayProgram extends javax.swing.JFrame {

    /**
     * Creates new form BirthdayProgram
     */
    public BirthdayProgram() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewPanel = new javax.swing.JPanel();
        EnterYourName = new javax.swing.JLabel();
        HappyBirthday = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        EnterBirthdayLabel = new javax.swing.JLabel();
        BirthdayTextfield = new javax.swing.JTextField();
        EnterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ViewPanel.setBackground(new java.awt.Color(0, 51, 102));

        EnterYourName.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        EnterYourName.setForeground(new java.awt.Color(255, 255, 255));
        EnterYourName.setText("Enter Your Name:");

        HappyBirthday.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        HappyBirthday.setForeground(new java.awt.Color(255, 255, 255));
        HappyBirthday.setText("Happy Birthday!");
        HappyBirthday.setAutoscrolls(true);

        EnterBirthdayLabel.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        EnterBirthdayLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnterBirthdayLabel.setText("Enter Your Birthday:");

        EnterButton.setText("Enter");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewPanelLayout = new javax.swing.GroupLayout(ViewPanel);
        ViewPanel.setLayout(ViewPanelLayout);
        ViewPanelLayout.setHorizontalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(HappyBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EnterBirthdayLabel)
                            .addComponent(EnterYourName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnterButton)
                            .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NameTextField)
                                .addComponent(BirthdayTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        ViewPanelLayout.setVerticalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(HappyBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterYourName)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EnterBirthdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BirthdayTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(EnterButton)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BirthdayProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BirthdayProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BirthdayProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BirthdayProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BirthdayProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BirthdayTextfield;
    private javax.swing.JLabel EnterBirthdayLabel;
    private javax.swing.JButton EnterButton;
    private javax.swing.JLabel EnterYourName;
    private javax.swing.JLabel HappyBirthday;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JPanel ViewPanel;
    // End of variables declaration//GEN-END:variables

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {
       String name; 
       name = nameInput.getText();
    outputLabel.setText(EnterYourName + "'s birthday is on" + EnterBirthdayLabel);
    }
}
