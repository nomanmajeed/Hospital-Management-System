
package hms;

/**
 *
 * @author NOMAN
 */
public class OutdoorReview extends javax.swing.JFrame {

    public OutdoorReview() {
        initComponents();
    }
    public OutdoorReview(String data, String file){
        initComponents();
        reviewarea.setText(data);
        reviewarea.setEditable(false);
        info.setEditable(false);
        info1.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        review = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        reviewareaS = new javax.swing.JScrollPane();
        reviewarea = new javax.swing.JTextArea();
        backtomainmenu = new javax.swing.JButton();
        info = new javax.swing.JTextField();
        info1 = new javax.swing.JTextField();
        icon = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        review.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        review.setForeground(new java.awt.Color(0, 102, 102));
        review.setText("Outdoor Patient Data Review");
        jPanel1.add(review);
        review.setBounds(200, 20, 270, 40);

        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(600, 370, 70, 23);

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(0, 153, 51));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(501, 370, 90, 23);

        reviewarea.setColumns(20);
        reviewarea.setRows(5);
        reviewareaS.setViewportView(reviewarea);

        jPanel1.add(reviewareaS);
        reviewareaS.setBounds(50, 130, 590, 210);

        backtomainmenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backtomainmenu.setForeground(new java.awt.Color(0, 102, 102));
        backtomainmenu.setText("Back to Main Menu");
        backtomainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtomainmenuActionPerformed(evt);
            }
        });
        jPanel1.add(backtomainmenu);
        backtomainmenu.setBounds(20, 360, 160, 23);

        info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        info.setText("If you want to go to Main Menu, press \"Back to Main Menu\".");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel1.add(info);
        info.setBounds(50, 100, 590, 30);

        info1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        info1.setText("Preview your data below. If you have entered any wrong information press \"Back\" to re-enter data.");
        jPanel1.add(info1);
        info1.setBounds(50, 70, 590, 30);

        icon.setIcon(new javax.swing.ImageIcon("F:\\doc1.JPG")); // NOI18N
        jPanel1.add(icon);
        icon.setBounds(0, 0, 700, 420);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new OutdoorPatient().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoActionPerformed

    private void backtomainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtomainmenuActionPerformed
        setVisible(false);
        new choice().setVisible(true);
    }//GEN-LAST:event_backtomainmenuActionPerformed

    public static void main(String args[]) {
        new OutdoorReview().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton backtomainmenu;
    private javax.swing.JButton exit;
    private javax.swing.JLabel icon;
    private javax.swing.JTextField info;
    private javax.swing.JTextField info1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel review;
    public javax.swing.JTextArea reviewarea;
    public javax.swing.JScrollPane reviewareaS;
    // End of variables declaration//GEN-END:variables
}
