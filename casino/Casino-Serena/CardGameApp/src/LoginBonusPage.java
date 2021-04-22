package views;


import views.LeaderboardPage;
import views.GameplayPage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serena
 */
public class LoginBonusPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginBonusPage
     */
    public LoginBonusPage() {
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
        jPanelBonusPoints = new javax.swing.JPanel();
        jLabelBonusPoints = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGap(76, 76, 76)
                .addComponent(jButtonGameplay, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
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
        jLabelTitle.setText("Login Bonus");

        jLabelBonusPoints.setLabelFor(jPanelBonusPoints);
        jLabelBonusPoints.setText("##coins");

        javax.swing.GroupLayout jPanelBonusPointsLayout = new javax.swing.GroupLayout(jPanelBonusPoints);
        jPanelBonusPoints.setLayout(jPanelBonusPointsLayout);
        jPanelBonusPointsLayout.setHorizontalGroup(
            jPanelBonusPointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBonusPointsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelBonusPoints)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanelBonusPointsLayout.setVerticalGroup(
            jPanelBonusPointsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBonusPointsLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabelBonusPoints)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelBonusPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addGap(129, 129, 129)
                .addComponent(jPanelBonusPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                LeaderboardPage leaderboardPage = new LeaderboardPage();
                leaderboardPage.setVisible(true);
                this.setVisible(false);
                this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_jButtonLeaderboardActionPerformed

    private void jButtonGameplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGameplayActionPerformed
        // TODO add your handling code here:
        GameplayPage gameplayPage = new GameplayPage();
        gameplayPage.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonGameplayActionPerformed

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
            java.util.logging.Logger.getLogger(LoginBonusPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginBonusPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginBonusPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginBonusPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginBonusPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGameplay;
    private javax.swing.JButton jButtonLeaderboard;
    private javax.swing.JButton jButtonUserProfile;
    private javax.swing.JLabel jLabelBonusPoints;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelBonusPoints;
    private javax.swing.JPanel jPanelHeader;
    // End of variables declaration//GEN-END:variables
}
