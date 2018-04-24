import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JTextField t1,t2;
JButton b1,b2,b3;
Login()
{


setTitle("LOGIN");
setVisible(true);
setLayout(new BorderLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ImageIcon img3=new ImageIcon("C:\\Users\\Prithvi Raj\\Documents\\NetBeansProjects\\JavaApplication2\\dist\\javadoc\\resources\\imgs.jpg");
JLabel bg=new JLabel(img3);
add(bg);

l1=new JLabel("Wholesale Distributor Billing System");
Font f1=new Font("Algerian",Font.BOLD,40);
l1.setBounds(30,100,2000,50);
l1.setForeground(Color.WHITE);
l1.setFont(f1);

ImageIcon img1=new ImageIcon("C:\\Users\\Prithvi Raj\\Documents\\NetBeansProjects\\JavaApplication2\\dist\\javadoc\\resources\\img2.png");
b1=new JButton();
b1.setIcon(img1);
b1.setBounds(200,200,200,220);

l2=new JLabel("BILL");
l2.setBounds(270,420,150,25);
Font f2=new Font("Algerian",Font.BOLD,20);
l2.setFont(f2);
l2.setForeground(Color.WHITE);

ImageIcon img2=new ImageIcon("C:\\Users\\Prithvi Raj\\Documents\\NetBeansProjects\\JavaApplication2\\dist\\javadoc\\resources\\img3.png");
b2=new JButton();
b2.setIcon(img2);
b2.setBounds(500,200,200,220);

l3=new JLabel("LEDGER");
l3.setBounds(550,420,200,25);
l3.setFont(f2);
l3.setForeground(Color.WHITE);

bg.add(l1);
bg.add(l2);
bg.add(l3);
bg.add(b1);
bg.add(b2);

b1.addActionListener(this);
b2.addActionListener(this);
pack();
}



public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
{
Login m1=new Login();
m1.setVisible(false);
dispose();
Bill m2=new Bill();
m2.Bill();
m2.setVisible(true);
}




if(ae.getSource()==b2)
{
Login m1=new Login();
m1.setVisible(false);
dispose();
Ledger m3=new Ledger();
m3.Ledger();
}




}



public static void main(String args[])
{
Login m1=new Login();
    Bill bill = new Bill();
}
}