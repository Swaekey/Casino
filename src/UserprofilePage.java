/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serena
 */
public class UserprofilePage extends javax.swing.JFrame {

    /**
     * Creates new form UserprofilePage
     */
    public UserprofilePage() {
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

        jPanelHeader = new javax.swing.JPanel();
        jButtonUserProfile = new javax.swing.JButton();
        jButtonLeaderboard = new javax.swing.JButton();
        jButtonGameplay = new javax.swing.JButton();
        jPanelBackground = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelUsername = new javax.swing.JPanel();
        jLabelUsername = new javax.swing.JLabel();
        jPanelScore = new javax.swing.JPanel();
        jLabelScore = new javax.swing.JLabel();
        jPanelGamesPlayed = new javax.swing.JPanel();
        jLabelGamesPlayed = new javax.swing.JLabel();
        jPanelPlayerSince = new javax.swing.JPanel();
        jLabelPlayerSince = new javax.swing.JLabel();
        jButtonUpdateProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(452, 550));
        setResizable(false);

        jPanelHeader.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jButtonGameplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/card game Logo.jpg"))); // NOI18N
        jButtonGameplay.setMaximumSize(new java.awt.Dimension(100, 94));
        jButtonGameplay.setMinimumSize(new java.awt.Dimension(100, 94));
        jButtonGameplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGameplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButtonLeaderboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButtonGameplay, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButtonUserProfile)
                .addGap(42, 42, 42))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGameplay, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButtonLeaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButtonUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBackground.setBackground(new java.awt.Color(0, 102, 51));
        jPanelBackground.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBackground.setPreferredSize(new java.awt.Dimension(432, 451));

        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setLabelFor(jPanelBackground);
        jLabelTitle.setText("User Profile");

        jLabelUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsername.setLabelFor(jPanelUsername);
        jLabelUsername.setText("@username");

        javax.swing.GroupLayout jPanelUsernameLayout = new javax.swing.GroupLayout(jPanelUsername);
        jPanelUsername.setLayout(jPanelUsernameLayout);
        jPanelUsernameLayout.setHorizontalGroup(
            jPanelUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsernameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelUsernameLayout.setVerticalGroup(
            jPanelUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsernameLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabelUsername)
                .addContainerGap())
        );

        jLabelScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScore.setLabelFor(jPanelScore);
        jLabelScore.setText("@score");

        javax.swing.GroupLayout jPanelScoreLayout = new javax.swing.GroupLayout(jPanelScore);
        jPanelScore.setLayout(jPanelScoreLayout);
        jPanelScoreLayout.setHorizontalGroup(
            jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelScoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelScore, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelScoreLayout.setVerticalGroup(
            jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScoreLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelScore)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabelGamesPlayed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGamesPlayed.setLabelFor(jPanelGamesPlayed);
        jLabelGamesPlayed.setText("@gamesplayed");

        javax.swing.GroupLayout jPanelGamesPlayedLayout = new javax.swing.GroupLayout(jPanelGamesPlayed);
        jPanelGamesPlayed.setLayout(jPanelGamesPlayedLayout);
        jPanelGamesPlayedLayout.setHorizontalGroup(
            jPanelGamesPlayedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGamesPlayedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGamesPlayed, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelGamesPlayedLayout.setVerticalGroup(
            jPanelGamesPlayedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGamesPlayedLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabelGamesPlayed)
                .addContainerGap())
        );

        jLabelPlayerSince.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayerSince.setLabelFor(jLabelPlayerSince);
        jLabelPlayerSince.setText("@playersince");

        javax.swing.GroupLayout jPanelPlayerSinceLayout = new javax.swing.GroupLayout(jPanelPlayerSince);
        jPanelPlayerSince.setLayout(jPanelPlayerSinceLayout);
        jPanelPlayerSinceLayout.setHorizontalGroup(
            jPanelPlayerSinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlayerSinceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPlayerSince, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPlayerSinceLayout.setVerticalGroup(
            jPanelPlayerSinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlayerSinceLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabelPlayerSince)
                .addContainerGap())
        );

        jButtonUpdateProfile.setText("UpdateProfile");
        jButtonUpdateProfile.setToolTipText("");
        jButtonUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanelPlayerSince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelGamesPlayed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jPanelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130))
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jPanelScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170))))))
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jButtonUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGamesPlayed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelPlayerSince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGameplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGameplayActionPerformed
        // TODO add your handling code here:
        GameplayPage gameplayPage = new GameplayPage();
        gameplayPage.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonGameplayActionPerformed

    private void jButtonUserProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserProfileActionPerformed
        // TODO add your handling code here:
        UserprofilePage userprofilePage = new UserprofilePage();
        userprofilePage.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonUserProfileActionPerformed

    private void jButtonLeaderboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeaderboardActionPerformed
        // TODO add your handling code here:
//        LeaderboardPage leaderboardPage = new LeaderboardPage();
//        leaderboardPage.setVisible(true);
//        this.setVisible(false);
//        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
//        this.dispose();
    }//GEN-LAST:event_jButtonLeaderboardActionPerformed

    private void jButtonUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateProfileActionPerformed
        // TODO add your handling code here:
        SignupPage signupPage = new SignupPage();
        signupPage.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonUpdateProfileActionPerformed

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
            java.util.logging.Logger.getLogger(UserprofilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserprofilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserprofilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserprofilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserprofilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGameplay;
    private javax.swing.JButton jButtonLeaderboard;
    private javax.swing.JButton jButtonUpdateProfile;
    private javax.swing.JButton jButtonUserProfile;
    private javax.swing.JLabel jLabelGamesPlayed;
    private javax.swing.JLabel jLabelPlayerSince;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelGamesPlayed;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelPlayerSince;
    private javax.swing.JPanel jPanelScore;
    private javax.swing.JPanel jPanelUsername;
    // End of variables declaration//GEN-END:variables
}