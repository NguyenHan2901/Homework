/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN-PC
 */
public class Student {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        JPanel panel = new JPanel(null);
        panel.setBounds(100, 30, 700, 500);

        panel.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panel.setBackground(Color.GRAY);

        JLabel lblId = new JLabel("ID ");
        lblId.setBounds(300, 100, 100, 40);
        
        JTextField txtId = new JTextField();
        txtId.setBounds(400, 100, 205, 40);
        
        JLabel lblName = new JLabel("Name ");
        lblName.setBounds(300, 160, 100, 40);
        
        JTextField txtName = new JTextField();
        txtName.setBounds(400, 160, 205, 40);
        
        JLabel lblEmail = new JLabel("Emai ");
        lblEmail.setBounds(300, 220, 100, 40);
        
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(400, 220, 205, 40);
        
        JLabel lblPhone = new JLabel("Phone ");
        lblPhone.setBounds(300, 280, 100, 40);
        
        JTextField txtPhone = new JTextField();
        txtPhone.setBounds(400, 280, 205, 40);
        
        JLabel lblRollNum = new JLabel("Roll Number ");
        lblRollNum.setBounds(300, 340, 100, 40);
        
        JTextField txtRoll = new JTextField();
        txtRoll.setBounds(400, 340, 205, 40);
        
        JLabel lblClass = new JLabel("Class Name ");
        lblClass.setBounds(300, 400, 100, 40);
        
        JTextField txtClass = new JTextField();
        txtClass.setBounds(400, 400, 205, 40);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(400, 450, 100, 40);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(505, 450, 100, 40);
        

        panel.add(lblId);
        panel.add(txtId);
        
        panel.add(lblName);
        panel.add(txtName);
        
        panel.add(lblEmail);
        panel.add(txtEmail);
        
        panel.add(lblPhone);
        panel.add(txtPhone);

        panel.add(lblRollNum);
        panel.add(txtRoll);
        
        panel.add(lblClass);
        panel.add(txtClass);
        panel.add(btnLogin);
        panel.add(btnCancel);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

}