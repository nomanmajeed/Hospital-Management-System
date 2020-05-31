
package hms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NOMAN
 */
public class OutdoorPatient extends javax.swing.JFrame {

    public OutdoorPatient() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        indoor = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        pname = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        pcnic = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        idf = new javax.swing.JTextField();
        pnamef = new javax.swing.JTextField();
        fnamef = new javax.swing.JTextField();
        pcincf = new javax.swing.JTextField();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JTextField();
        addressS = new javax.swing.JScrollPane();
        addressf = new javax.swing.JTextArea();
        contactf = new javax.swing.JTextField();
        docType = new javax.swing.JLabel();
        docTypef = new javax.swing.JComboBox<>();
        gendertype = new javax.swing.JComboBox<>();
        preview = new javax.swing.JButton();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        blood = new javax.swing.JLabel();
        bloodf = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 450));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        indoor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        indoor.setForeground(new java.awt.Color(0, 102, 102));
        indoor.setText("OUTDOOR PATIENT");
        jPanel1.add(indoor);
        indoor.setBounds(250, 20, 190, 22);

        id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        id.setText("Patient Id:");
        jPanel1.add(id);
        id.setBounds(50, 80, 60, 15);

        pname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pname.setText("Patient Name:");
        jPanel1.add(pname);
        pname.setBounds(50, 110, 90, 15);

        fname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fname.setText("Father Name:");
        jPanel1.add(fname);
        fname.setBounds(50, 140, 90, 15);

        pcnic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pcnic.setText("Patient CNIC#:");
        jPanel1.add(pcnic);
        pcnic.setBounds(50, 170, 90, 15);

        dob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dob.setText("D.O.B:");
        jPanel1.add(dob);
        dob.setBounds(50, 200, 70, 15);

        gender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gender.setText("Gender:");
        jPanel1.add(gender);
        gender.setBounds(50, 230, 60, 15);

        address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        address.setText("Address:");
        jPanel1.add(address);
        address.setBounds(50, 260, 60, 15);

        contact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contact.setText("Contact#:");
        jPanel1.add(contact);
        contact.setBounds(50, 330, 60, 15);

        idf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idfActionPerformed(evt);
            }
        });
        jPanel1.add(idf);
        idf.setBounds(150, 80, 80, 30);
        jPanel1.add(pnamef);
        pnamef.setBounds(150, 110, 160, 30);
        jPanel1.add(fnamef);
        fnamef.setBounds(150, 140, 160, 30);
        jPanel1.add(pcincf);
        pcincf.setBounds(150, 170, 160, 30);

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(day);
        day.setBounds(150, 200, 50, 30);

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Feburary", "March", "April", "May", "June ", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(month);
        month.setBounds(200, 200, 90, 30);
        jPanel1.add(year);
        year.setBounds(290, 200, 60, 30);

        addressf.setColumns(20);
        addressf.setRows(5);
        addressS.setViewportView(addressf);

        jPanel1.add(addressS);
        addressS.setBounds(150, 260, 300, 70);
        jPanel1.add(contactf);
        contactf.setBounds(150, 330, 170, 30);

        docType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        docType.setForeground(java.awt.Color.blue);
        docType.setText("Doctor Type:");
        jPanel1.add(docType);
        docType.setBounds(450, 80, 80, 15);

        docTypef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medical Specialist", "Surgical Specialist", "Child Specialist", "ENT Specialist", "Eye Specialist", "Dental" }));
        jPanel1.add(docTypef);
        docTypef.setBounds(540, 70, 140, 30);

        gendertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(gendertype);
        gendertype.setBounds(150, 230, 80, 30);

        preview.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        preview.setForeground(new java.awt.Color(0, 153, 51));
        preview.setText("Preview");
        preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewActionPerformed(evt);
            }
        });
        jPanel1.add(preview);
        preview.setBounds(500, 370, 100, 23);

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(0, 102, 102));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(40, 370, 80, 23);

        exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(610, 370, 80, 23);

        blood.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        blood.setForeground(java.awt.Color.blue);
        blood.setText("Blood Group:");
        jPanel1.add(blood);
        blood.setBounds(450, 110, 80, 15);

        bloodf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jPanel1.add(bloodf);
        bloodf.setBounds(540, 110, 60, 30);

        save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(411, 370, 80, 23);

        icon.setBackground(new java.awt.Color(0, 204, 0));
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
    public String displayoutdoor(){
        String sidf=idf.getText();
        String spnamef=pnamef.getText();
        String sfnamef=fnamef.getText();
        String spcnicf=pcincf.getText();
        String sday=day.getSelectedItem().toString();
        String smonth=month.getSelectedItem().toString();
        String syear=year.getText();
        String sdob=(sday+"-"+smonth+"-"+syear);
        String sgendertype=gendertype.getSelectedItem().toString();
        String saddressf=addressf.getText();
        String scontactf=contactf.getText();
        String sdocTypef=docTypef.getSelectedItem().toString();
        String sbloodf=bloodf.getSelectedItem().toString();
        
        return ("Patient Id:  "+sidf+"\n\nPatient Name:  "+spnamef+"\n\nFather Name:  "+sfnamef+"\n\n"
                +"Patient CINC:  "+spcnicf+"\n\nDate of Birth:  "+sdob+"\n\nGender:  "+sgendertype+"\n\n"
                +"Address:  "+saddressf+"\n\nContact#:  "+scontactf+"\n\nDoctor Type:  "+sdocTypef+"\n\n"
                +"Blood Group:  "+sbloodf);
       
   }
    public void savedata(){
         String filename = "C:\\Users\\NOMAN\\Desktop\\HMS\\Outdoor\\"+idf.getText()+".txt";
    
        String sidf=idf.getText();
        String spnamef=pnamef.getText();
        String sfnamef=fnamef.getText();
        String spcnicf=pcincf.getText();
        String sday=day.getSelectedItem().toString();
        String smonth=month.getSelectedItem().toString();
        String syear=year.getText();
        String sdob=(sday+"-"+smonth+"-"+syear);
        String sgendertype=gendertype.getSelectedItem().toString();
        String saddressf=addressf.getText();
        String scontactf=contactf.getText();
        String sdocTypef=docTypef.getSelectedItem().toString();
        String sbloodf=bloodf.getSelectedItem().toString();
     
        String display;
        try{
           if(sidf.equals("")||spnamef.equals("")||sfnamef.equals("")||spcnicf.equals("")||sdob.equals("")
              ||sgendertype.equals("")||saddressf.equals("")||scontactf.equals("")
              ||sdocTypef.equals("")||sbloodf.equals("")){
               throw new Exception();
           }
           else{
               JOptionPane.showMessageDialog(null,"Your Form is Saved", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
               this.setVisible(false);
               new choice().setVisible(true);
             
           }
            String[] linesToWrite = new String[] { "Patient Id:  "+sidf,"Patient Name:  "+spnamef,"Father Name:  "+sfnamef
                                                 ,"Patient CINC:  "+spcnicf,"Date of Birth:  "+sdob,"Gender:  "+sgendertype
                                                 ,"Address:  "+saddressf,"Contact#:  "+scontactf,"Doctor Type:  "+sdocTypef
                                                 ,"Blood Group:  "+sbloodf };
            PrintWriter pw = null;
            pw = new PrintWriter(new FileWriter(filename));
            pw = new PrintWriter(new FileWriter(filename));
            
            for (int i = 0; i < linesToWrite.length; i++) {
                pw.println(linesToWrite[i]);
            }
            pw.flush();
            pw.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter Data in all Fields", "Error", JOptionPane.ERROR_MESSAGE);
            new OutdoorPatient().setVisible(true);
        }
        
    }
    public void searchFile(){
        String idsearch=JOptionPane.showInputDialog(null, "Enter Patient Id:", "Patient Information", JOptionPane.INFORMATION_MESSAGE);
        
        FileInputStream fis = null;
        BufferedReader reader = null;
        
        String path="C:\\Users\\NOMAN\\Desktop\\HMS\\Outdoor\\"+idsearch+".txt";
        File f=new File(path);
        try {
            
            if(!(f.exists())){
                throw new FileNotFoundException();
            }
            else{
                fis = new FileInputStream("C:\\Users\\NOMAN\\Desktop\\HMS\\Outdoor\\"+idsearch+".txt");
                reader = new BufferedReader(new InputStreamReader(fis));
                System.out.println("Outdoor Patient Information is given below:");
                
                String str = null;
                String line = reader.readLine();
                while(line != null){
                    line = reader.readLine();
                    if(line != null)
                    {
                        str = str + " " + line + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, str, "Information", JOptionPane.INFORMATION_MESSAGE);
                new choice().setVisible(true);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Your Entered Id doesn't belong to any Patient.\nTry Again", "Error", JOptionPane.ERROR_MESSAGE);
            
        } catch (IOException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void previewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewActionPerformed
        
        JOptionPane.showMessageDialog(null,"You can Preview your Data.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        new OutdoorReview().setVisible(true);
        new OutdoorReview(displayoutdoor(),idf.getText()).setVisible(true);
        
        
    }//GEN-LAST:event_previewActionPerformed

    private void idfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idfActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        this.savedata();
        this.setVisible(false);
        JOptionPane.showMessageDialog(null,"Your Form is Saved", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        new choice().setVisible(true);
    }//GEN-LAST:event_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new OutdoorPatient().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JScrollPane addressS;
    private javax.swing.JTextArea addressf;
    private javax.swing.JButton back;
    private javax.swing.JLabel blood;
    private javax.swing.JComboBox<String> bloodf;
    private javax.swing.JLabel contact;
    private javax.swing.JTextField contactf;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel docType;
    private javax.swing.JComboBox<String> docTypef;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fname;
    private javax.swing.JTextField fnamef;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> gendertype;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idf;
    private javax.swing.JLabel indoor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField pcincf;
    private javax.swing.JLabel pcnic;
    private javax.swing.JLabel pname;
    private javax.swing.JTextField pnamef;
    private javax.swing.JButton preview;
    private javax.swing.JButton save;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
