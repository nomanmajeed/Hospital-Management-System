
package hms;

import javax.swing.JOptionPane;


/**
 *
 * @author NOMAN
 */

public class choice extends javax.swing.JFrame {

    public choice() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registration = new javax.swing.JButton();
        Pinfo = new javax.swing.JButton();
        help = new javax.swing.JButton();
        hms = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        billing = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(700, 420));
        jPanel1.setLayout(null);

        registration.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registration.setForeground(new java.awt.Color(0, 153, 255));
        registration.setText("Registration");
        registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationActionPerformed(evt);
            }
        });
        jPanel1.add(registration);
        registration.setBounds(290, 130, 110, 50);

        Pinfo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pinfo.setForeground(new java.awt.Color(0, 153, 255));
        Pinfo.setText("Patient Information");
        Pinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinfoActionPerformed(evt);
            }
        });
        jPanel1.add(Pinfo);
        Pinfo.setBounds(260, 190, 160, 60);

        help.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        help.setForeground(new java.awt.Color(255, 0, 0));
        help.setText("Help ");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        jPanel1.add(help);
        help.setBounds(10, 20, 70, 30);

        hms.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        hms.setForeground(new java.awt.Color(0, 102, 102));
        hms.setText("H.M.S");
        jPanel1.add(hms);
        hms.setBounds(260, 10, 150, 100);

        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(580, 20, 100, 30);

        billing.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        billing.setForeground(new java.awt.Color(51, 153, 255));
        billing.setText("BILL");
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });
        jPanel1.add(billing);
        billing.setBounds(220, 260, 230, 50);

        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(550, 363, 110, 30);

        icon.setIcon(new javax.swing.ImageIcon("F:\\doc1.JPG")); // NOI18N
        jPanel1.add(icon);
        icon.setBounds(0, 0, 700, 420);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
        String s=JOptionPane.showInputDialog(null, "Press 1 for Outdoor Patient."
                + "\nPress 2 for Indoor Patient", "Patient Type", JOptionPane.INFORMATION_MESSAGE);
        try{
            
            int n=Integer.parseInt(s);
            if(n==1){
            setVisible(false);
            new OutdoorPatient().setVisible(true);
            }
            else if(n==2){
                setVisible(false);
                new IndoorPatient().setVisible(true);
            }
            else{
                throw new NumberFormatException();
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_registrationActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        JOptionPane.showMessageDialog(null, "*Press Registration Button to fill a new form for patient."
                + "\n\n*Press Patient Information Button to view existing Patient information."
                + "\n\n*Press BILL Button to view existing Patient bill."
                + "\n\n*Press Search Button to Search a Patient record"
                + "\n\n*Press Exit Button to exit the program.", "Help", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpActionPerformed

    private void PinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinfoActionPerformed
        try{
            String in=JOptionPane.showInputDialog(null, "For Outdoor Patient Enter 1.\nFor Indoor Patient Press 2", "Patient Type", JOptionPane.INFORMATION_MESSAGE);
            int n=Integer.parseInt(in);
            if(n==1){
                this.setVisible(false);
                new OutdoorPatient().searchFile();
            }
            else if(n==2){
                this.setVisible(false);
                new IndoorPatient().searchFile();
            }
            else{
                throw new NumberFormatException();
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
            new choice().setVisible(true);
        }
        
    }//GEN-LAST:event_PinfoActionPerformed

    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
        try{
            String in=JOptionPane.showInputDialog(null, "For Outdoor Patient Enter 1.\nFor Indoor Patient Press 2", "Bill Type", JOptionPane.INFORMATION_MESSAGE);
            int n=Integer.parseInt(in);
            if(n==1){
                this.setVisible(false);
                new OutdoorBill().setVisible(true);
            }
            else if(n==2){
                this.setVisible(false);
                new IndoorBill().setVisible(true);
            }
            else{
                throw new NumberFormatException();
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_billingActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try{
            String in=JOptionPane.showInputDialog(null, "For Outdoor Patient Enter 1.\nFor Indoor Patient Press 2", "Patient Type", JOptionPane.INFORMATION_MESSAGE);
            int n=Integer.parseInt(in);
            if(n==1){
                this.setVisible(false);
                new OutdoorPatient().searchFile();
            }
            else if(n==2){
                this.setVisible(false);
                new IndoorPatient().searchFile();
            }
            else{
                throw new NumberFormatException();
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
            new choice().setVisible(true);
        }
    }//GEN-LAST:event_searchActionPerformed

    public static void main(String args[]) {
        new choice().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pinfo;
    private javax.swing.JButton billing;
    private javax.swing.JButton exit;
    private javax.swing.JButton help;
    private javax.swing.JLabel hms;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registration;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
