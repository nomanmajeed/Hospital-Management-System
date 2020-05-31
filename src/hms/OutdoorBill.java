
package hms;

import javax.swing.JOptionPane;

/**
 *
 * @author NOMAN
 */
public class OutdoorBill extends javax.swing.JFrame {

    public OutdoorBill() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        outdoor = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        docfee = new javax.swing.JLabel();
        labfee = new javax.swing.JLabel();
        misc = new javax.swing.JLabel();
        idf = new javax.swing.JTextField();
        namef = new javax.swing.JTextField();
        agef = new javax.swing.JTextField();
        genderf = new javax.swing.JComboBox<>();
        docfeef = new javax.swing.JTextField();
        labfeef = new javax.swing.JTextField();
        miscf = new javax.swing.JTextField();
        viewbill = new javax.swing.JButton();
        back = new javax.swing.JButton();
        total = new javax.swing.JButton();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        outdoor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        outdoor.setForeground(new java.awt.Color(0, 102, 102));
        outdoor.setText("OUTDOOR PATIENT BILL");
        jPanel1.add(outdoor);
        outdoor.setBounds(230, 20, 230, 30);

        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(600, 370, 80, 23);

        id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        id.setText("Patient Id:");
        jPanel1.add(id);
        id.setBounds(50, 70, 60, 15);

        name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name.setText("Name:");
        jPanel1.add(name);
        name.setBounds(50, 94, 70, 20);

        age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        age.setText("Age:");
        jPanel1.add(age);
        age.setBounds(50, 120, 34, 30);

        gender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gender.setText("Gender:");
        jPanel1.add(gender);
        gender.setBounds(50, 160, 50, 15);

        docfee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        docfee.setText("Doctor Fee:");
        jPanel1.add(docfee);
        docfee.setBounds(50, 190, 70, 15);

        labfee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labfee.setText("Laboratory Fee:");
        jPanel1.add(labfee);
        labfee.setBounds(50, 220, 90, 14);

        misc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        misc.setText("Miscellanous:");
        jPanel1.add(misc);
        misc.setBounds(50, 250, 80, 15);
        jPanel1.add(idf);
        idf.setBounds(170, 70, 120, 30);
        jPanel1.add(namef);
        namef.setBounds(170, 100, 120, 30);
        jPanel1.add(agef);
        agef.setBounds(170, 130, 60, 30);

        genderf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(genderf);
        genderf.setBounds(170, 160, 60, 30);
        jPanel1.add(docfeef);
        docfeef.setBounds(170, 190, 120, 30);
        jPanel1.add(labfeef);
        labfeef.setBounds(170, 220, 120, 30);
        jPanel1.add(miscf);
        miscf.setBounds(170, 250, 120, 30);

        viewbill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewbill.setForeground(new java.awt.Color(0, 153, 51));
        viewbill.setText("View Bill");
        viewbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbillActionPerformed(evt);
            }
        });
        jPanel1.add(viewbill);
        viewbill.setBounds(490, 370, 100, 23);

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(0, 102, 102));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(390, 370, 90, 23);

        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(0, 102, 102));
        total.setText("Total");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel1.add(total);
        total.setBounds(30, 343, 80, 30);

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
        setVisible(false);
        new choice().setVisible(true);
    }//GEN-LAST:event_backActionPerformed
    public String outdoorbill(){
        
        String sidf=idf.getText();
        String snamef=namef.getText();
        String sagef=agef.getText();
        String sgenderf=genderf.getSelectedItem().toString();
        String sdocfeef=docfeef.getText();
        String slabfeef=labfeef.getText();
        String smiscf=miscf.getText();
        
        
        return ("Patient Id:  "+sidf+"\n\nPatient Name:  "+snamef+"\n\nPatient Age:  "+sagef+"\n\n"
                +"Gender:  "+sgenderf+"\n\nDoc Fee:  "+sdocfeef+"\n\nLaboratory Fee:  "+slabfeef+"\n\n"
                +"Miscellanous:  "+smiscf);
                
    }
    private void viewbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbillActionPerformed
        setVisible(false);
        new OutdoorBillView().setVisible(true);
        new OutdoorBillView(outdoorbill()).setVisible(true);
    }//GEN-LAST:event_viewbillActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        try{
            String sdocfeef=docfeef.getText();
            String slabfeef=labfeef.getText();
            String smiscf=miscf.getText();
            double doc=Double.parseDouble(sdocfeef);
            double lab=Double.parseDouble(slabfeef);
            double Misc=Double.parseDouble(smiscf);
            double totalS=doc+lab+Misc;
            if(sdocfeef.equals("")||slabfeef.equals("")||smiscf.equals("")){
                throw new Exception();
            }
            else{
                JOptionPane.showMessageDialog(null, "Your Total Bill is Rs. "+totalS, "Total Bill", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter Doctor, Laboratory,"
                    + " and Miscellanous Charges", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_totalActionPerformed

    
    public static void main(String args[]) {
        new OutdoorBill().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField agef;
    private javax.swing.JButton back;
    private javax.swing.JLabel docfee;
    private javax.swing.JTextField docfeef;
    private javax.swing.JButton exit;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> genderf;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labfee;
    private javax.swing.JTextField labfeef;
    private javax.swing.JLabel misc;
    private javax.swing.JTextField miscf;
    private javax.swing.JLabel name;
    private javax.swing.JTextField namef;
    private javax.swing.JLabel outdoor;
    private javax.swing.JButton total;
    private javax.swing.JButton viewbill;
    // End of variables declaration//GEN-END:variables
}
