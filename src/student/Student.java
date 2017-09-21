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
        JFrame frame = new JFrame("Add Student");
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        JPanel panel = new JPanel(null);
        panel.setBounds(100, 50, 900, 700);

        panel.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panel.setBackground(Color.GRAY);

        JLabel lblId = new JLabel("ID: ");
        lblId.setBounds(50, 100, 50, 50);
        
        JTextField txtId = new JTextField();
        txtId.setBounds(105, 100, 100, 50);
        
        JLabel lblName = new JLabel("Name: ");
        lblName.setBounds(50, 160, 50, 50);
        
        JTextField txtName = new JTextField();
        txtName.setBounds(105, 160, 100, 50);
        
        JLabel lblEmail = new JLabel("Emai: ");
        lblEmail.setBounds(50, 220, 50, 50);
        
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(105, 220, 100, 50);
        
        JLabel lblPhone = new JLabel("Phone: ");
        lblPhone.setBounds(50, 280, 50, 50);
        
        JTextField txtPhone = new JTextField();
        txtPhone.setBounds(105, 280, 100, 50);
        
        JLabel lblRollNum = new JLabel("Roll Number: ");
        lblRollNum.setBounds(50, 340, 50, 50);
        
        JTextField txtRoll = new JTextField();
        txtRoll.setBounds(105, 340, 100, 50);
        
        JLabel lblClass = new JLabel("Class Name: ");
        lblClass.setBounds(50, 400, 50, 50);
        
        JTextField txtClass = new JTextField();
        txtClass.setBounds(105, 400, 100, 50);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(205, 420, 100, 40);
        

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
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}