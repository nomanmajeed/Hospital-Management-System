
package hms;

/**
 *
 * @author NOMAN
 */
public class IndoorBillView extends javax.swing.JFrame {

    public IndoorBillView() {
        initComponents();
    }
    public IndoorBillView(String data) {
        initComponents();
        bill.setText(data);
        bill.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        IndoorBillView = new javax.swing.JLabel();
        billstatement = new javax.swing.JLabel();
        billS = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        exit = new javax.swing.JButton();
        print = new javax.swing.JButton();
        backtomainmenu = new javax.swing.JButton();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        IndoorBillView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IndoorBillView.setForeground(new java.awt.Color(0, 102, 102));
        IndoorBillView.setText("Indoor Patient Bill View");
        jPanel2.add(IndoorBillView);
        IndoorBillView.setBounds(230, 20, 213, 22);

        billstatement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        billstatement.setText("Your Bill is as follows:");
        jPanel2.add(billstatement);
        billstatement.setBounds(50, 80, 160, 17);

        bill.setColumns(20);
        bill.setRows(5);
        billS.setViewportView(bill);

        jPanel2.add(billS);
        billS.setBounds(50, 100, 600, 240);

        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(580, 370, 80, 23);

        print.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        print.setForeground(new java.awt.Color(0, 153, 51));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel2.add(print);
        print.setBounds(473, 370, 100, 23);

        backtomainmenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backtomainmenu.setForeground(new java.awt.Color(0, 102, 102));
        backtomainmenu.setText("Back to Main Menu");
        backtomainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtomainmenuActionPerformed(evt);
            }
        });
        jPanel2.add(backtomainmenu);
        backtomainmenu.setBounds(40, 370, 160, 23);

        icon.setIcon(new javax.swing.ImageIcon("F:\\doc1.JPG")); // NOI18N
        jPanel2.add(icon);
        icon.setBounds(0, 0, 700, 420);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 700, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        setVisible(false);
        new choice().setVisible(true);
    }//GEN-LAST:event_printActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void backtomainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtomainmenuActionPerformed
        setVisible(false);
        new choice().setVisible(true);
    }//GEN-LAST:event_backtomainmenuActionPerformed

    public static void main(String args[]) {
        new IndoorBillView().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IndoorBillView;
    private javax.swing.JButton backtomainmenu;
    private javax.swing.JTextArea bill;
    private javax.swing.JScrollPane billS;
    private javax.swing.JLabel billstatement;
    private javax.swing.JButton exit;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
