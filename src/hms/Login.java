/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;
import javax.swing.*;
import java.awt.*;
import java.util.*;
/**
 *
 * @author NOMAN
 */
public class Login{
    public Login(){
        Hlogin();
    }
    public void Hlogin(){
        JFrame f=new JFrame("Login");
        f.setSize(750, 500);
        f.setLocation(250,100);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        
        JLabel icon=new JLabel();
        icon.setIcon(new ImageIcon("F:doc1.jpg"));
        icon.setSize(750, 500);
        icon.setLayout(new GridBagLayout());
        f.add(icon);
        
        GridBagConstraints c=new GridBagConstraints();
        c.insets=new Insets(10,10,10,10);
        c.fill=GridBagConstraints.BOTH;
        JLabel welcome=new JLabel("Welcome to Hospital Management System");
        welcome.setFont(new Font("Serif",Font.BOLD,14));
        //welcome.setLocation(0, 5);
        c.gridx=1;
        c.gridy=0;
        c.anchor=GridBagConstraints.NORTH;
        //icon.add(welcome);
        
        JLabel name=new JLabel("Name:");
        name.setForeground(Color.BLUE);
        //c.anchor=GridBagConstraints.EAST;
        c.gridx=0;
        c.gridy=3;
        icon.add(name,c);
        JLabel pass=new JLabel("Password:");
        pass.setForeground(Color.BLUE);
        c.gridx=0;
        c.gridy=4;
        icon.add(pass,c);
        JTextField fname=new JTextField(10);
        c.gridx=1;
        c.gridy=3;
        icon.add(fname,c);
        JPasswordField fpass=new JPasswordField(10);
        c.gridx=1;
        c.gridy=4;
        icon.add(fpass,c);
        JButton login=new JButton("Login");
        c.gridx=0;
        c.gridy=5;
        c.gridwidth=1;
        icon.add(login,c);
        JButton cancel=new JButton("Cancel");
        c.gridx=1;
        c.gridy=5;
        icon.add(cancel,c);
    }
    public static void main(String[] args) {
        Login l=new Login();
    }
}
