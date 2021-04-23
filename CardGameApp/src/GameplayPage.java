package views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serena
 */
public class GameplayPage extends javax.swing.JFrame {

    /**
     * Creates new form GameplayPage
     */
    public GameplayPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jButtonUserProfile = new javax.swing.JButton();
        jButtonLeaderboard = new javax.swing.JButton();
        jPanelBackground = new javax.swing.JPanel();
        jButtonDeck1 = new javax.swing.JButton();
        jButtonDeck2 = new javax.swing.JButton();
        jLabelPlayer2Card = new javax.swing.JLabel();
        jLabelPlayer1Card = new javax.swing.JLabel();
        javax.swing.JLabel jLabelPlayer2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelPlayer3 = new javax.swing.JLabel();
        jButtonForfiet = new javax.swing.JButton();
        jLabelP1CardCount = new javax.swing.JLabel();
        jLabelP2CardCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(452, 550));

        jPanelHeader.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/card game Logo.jpg"))); // NOI18N
        jLabelLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonUserProfile.setText("UserProfile");
        jButtonUserProfile.setToolTipText("");
        jButtonUserProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserProfileActionPerformed(evt);
            }
        });

        jButtonLeaderboard.setText("High\nScores");
        jButtonLeaderboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeaderboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButtonLeaderboard)
                .addGap(45, 45, 45)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButtonUserProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLogo))
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLeaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelBackground.setBackground(new java.awt.Color(0, 102, 51));
        jPanelBackground.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBackground.setPreferredSize(new java.awt.Dimension(432, 451));

        jButtonDeck1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/card back.png"))); // NOI18N
        jButtonDeck1.setToolTipText("");

        jButtonDeck2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/card back.png"))); // NOI18N
        jButtonDeck2.setToolTipText("");

        jLabelPlayer2Card.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlayer2Card.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayer2Card.setText("P2's card");
        jLabelPlayer2Card.setToolTipText("");
        jLabelPlayer2Card.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelPlayer2Card.setPreferredSize(new java.awt.Dimension(149, 171));

        jLabelPlayer1Card.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPlayer1Card.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlayer1Card.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayer1Card.setText("P1's card");
        jLabelPlayer1Card.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelPlayer1Card.setPreferredSize(new java.awt.Dimension(149, 171));

        jLabelPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayer2.setText("Player2");

        jLabelPlayer3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlayer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayer3.setText("Player1");

        jButtonForfiet.setText("Forfiet");
        jButtonForfiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForfietActionPerformed(evt);
            }
        });

        jLabelP1CardCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabelP1CardCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP1CardCount.setLabelFor(jButtonDeck1);
        jLabelP1CardCount.setText("##");

        jLabelP2CardCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabelP2CardCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP2CardCount.setLabelFor(jButtonDeck2);
        jLabelP2CardCount.setText("##");

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabelPlayer1Card, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabelPlayer2Card, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jButtonDeck1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(jButtonForfiet, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButtonDeck2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabelPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabelP1CardCount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelP2CardCount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayer2)
                    .addComponent(jLabelPlayer3))
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPlayer1Card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPlayer2Card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDeck2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDeck1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonForfiet, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelP1CardCount)
                    .addComponent(jLabelP2CardCount))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLeaderboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeaderboardActionPerformed
        // TODO add your handling code here:
        LeaderboardPage leaderboardPage = new LeaderboardPage();
        leaderboardPage.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonLeaderboardActionPerformed

    private void jButtonUserProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserProfileActionPerformed
        // TODO add your handling code here:
        UserprofilePage userprofilePage = new UserprofilePage();
        userprofilePage.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonUserProfileActionPerformed

    private void jButtonForfietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForfietActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jButtonForfietActionPerformed

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
            java.util.logging.Logger.getLogger(GameplayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameplayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameplayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameplayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameplayPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeck1;
    private javax.swing.JButton jButtonDeck2;
    private javax.swing.JButton jButtonForfiet;
    private javax.swing.JButton jButtonLeaderboard;
    private javax.swing.JButton jButtonUserProfile;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelP1CardCount;
    private javax.swing.JLabel jLabelP2CardCount;
    private javax.swing.JLabel jLabelPlayer1Card;
    private javax.swing.JLabel jLabelPlayer2Card;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelHeader;
    // End of variables declaration//GEN-END:variables
}
