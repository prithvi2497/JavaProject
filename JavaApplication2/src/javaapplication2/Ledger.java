
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
public class Ledger extends JFrame implements ActionListener
{
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/EMP";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
    static JTable table;
    String[] columnNames = {"Date", "Debit", "Credit", "Balance"};
JLabel l1,l2,l3,l7,l8;
JButton b1,b2,b3,b4,b5,b7,b8,b9;
JTextField t1,t2,t3,t4,t6,t5;
JFrame frame1;

public int month(String a)
{
    if(a.equalsIgnoreCase("Jan"))
        return 1;
    else if(a.equalsIgnoreCase("Feb"))
        return 2;
    else if(a.equalsIgnoreCase("Mar"))
        return 3;
    else if(a.equalsIgnoreCase("Apr"))
        return 4;
    else if(a.equalsIgnoreCase("May"))
        return 5;
    else if(a.equalsIgnoreCase("Jun"))
        return 6;
    else if(a.equalsIgnoreCase("Jul"))
        return 7;
    else if(a.equalsIgnoreCase("Aug"))
        return 8;
    else if(a.equalsIgnoreCase("Sep"))
        return 9;
    else if(a.equalsIgnoreCase("Oct"))
        return 10;
    else if(a.equalsIgnoreCase("Nov"))
        return 11;
    else if(a.equalsIgnoreCase("Dec"))
        return 12;
    
    return 0;
}
public void Ledger()
{
    ImageIcon img4=new ImageIcon("C:\\Users\\Prithvi Raj\\Documents\\NetBeansProjects\\JavaApplication2\\dist\\javadoc\\resources\\imgs1.jpg");
JLabel bg1=new JLabel(img4);
add(bg1);
setSize(700,400);
setTitle("Legder");
setVisible(true);
setLayout(null);

l1=new JLabel("Ledger no.:");
l1.setBounds(100,30,100,25);
t1=new JTextField();
t1.setBounds(200,30,100,25);

b4=new JButton("Search");
b4.setBounds(300,30,100,25);
b4.addActionListener(this);


l2=new JLabel("Retailers Name:");
l2.setBounds(100,60,100,25);
t5=new JTextField();
t5.setBounds(200,60,390,25);

b7=new JButton("Add Member");
b7.setBounds(450,30,150,25);
b7.addActionListener(this);

b8=new JButton("Show Ledger");
b8.setBounds(100,100,150,25);
b8.addActionListener(this);

l3=new JLabel("Date");
l3.setBounds(100,160,100,25);
l7=new JLabel("Debit");
l7.setBounds(220,160,100,25);
l8=new JLabel("Credit");
l8.setBounds(350,160,100,25);
b5=new JButton("Balance");
b5.setBounds(470,160,100,25);
b5.addActionListener(this);

b9=new JButton("Add Entry");
b9.setBounds(215,240,200,25);
b9.addActionListener(this);

Date date = new Date();
        String onlydate = date.toString();
        String[] DateParts = onlydate.split(" ");
        System.out.println(onlydate);
        int m=month(DateParts[1]);
        String D1 = DateParts[1];
     
        String D2 = DateParts[2];
        String D3 = DateParts[5];
t2=new JTextField(D3+"-"+m+"-"+D2);
t2.setBounds(100,200,100,25);
t3=new JTextField("0.0");
t3.setBounds(220,200,100,25);
t4=new JTextField("0.0");
t4.setBounds(350,200,100,25);
t6=new JTextField("0.0");
t6.setBounds(470,200,100,25);


b1=new JButton("exit");
b1.setBounds(300,300,100,25);
b2=new JButton("back to main");
b2.setBounds(50,300,150,25);
b3=new JButton("back to print bill");
b3.setBounds(450,300,200,25);


bg1.add(l1);bg1.add(l2);bg1.add(l3);
bg1.add(l7);bg1.add(l8);

bg1.add(b1);bg1.add(b2);bg1.add(b3);bg1.add(b4);
bg1.add(b7);bg1.add(b8);bg1.add(b5);bg1.add(b9);

bg1.add(t1);bg1.add(t5);bg1.add(t2);bg1.add(t3);bg1.add(t4);bg1.add(t6);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

}


public void showTableData()
{
Connection con = null;
   Statement stmt = null;
frame1 = new JFrame("Retailer Ledger Details");
frame1.setLayout(new BorderLayout()); 


//TableModel tm = new TableModel();
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columnNames);
//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames()); 
//table = new JTable(model);
table = new JTable();
table.setModel(model);
table.setBounds(100,160,500,300);
table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table.setFillsViewportHeight(true);
//table.setBackground(Color.white);
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(
JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
String textvalue = t5.getText();
String date= "";
String debit= "";
String credit = "";
String balance = "";
try
{ 
Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to database...");
      con = DriverManager.getConnection(DB_URL,USER,PASS);
String sql = "SELECT * FROM `ledger_account`.`["+textvalue+"]`";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int i =0;
while(rs.next())
{
date = rs.getString("date");
debit = rs.getString("debit");
credit = rs.getString("credit");
balance = rs.getString("balance"); 
model.addRow(new Object[]{date, debit, credit, balance});
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
if(i ==1)
{
System.out.println(i+" Record Found");
}
else
{
System.out.println(i+" Records Found");
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
frame1.add(scroll);
frame1.setVisible(true);
frame1.setSize(400,300);
}



public void actionPerformed(ActionEvent ae)
{
    Connection con = null;
   Statement stmt = null;
if(ae.getSource()==b1)
{
System.exit(0);
}

if(ae.getSource()==b9)
{
try{
    Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to database...");
      con = DriverManager.getConnection(DB_URL,USER,PASS);
      String str9= t5.getText();
      String str10 = t2.getText();
       String str11 = t3.getText();
       String str12 = t4.getText();
       String str13 = t6.getText();
       PreparedStatement st11=con.prepareStatement("INSERT INTO `ledger_account`.`["+str9+"]` (`date`,`debit`,`credit`,`balance`) VALUES (?,?,?,?)");
         st11.setString(1,str10);   
         st11.setString(2,str11);
         st11.setString(3,str12);
         st11.setString(4,str13);
         
         
         
            st11.executeUpdate();
           
               JOptionPane.showMessageDialog(null, "Entry Added To System");
           
             
             
            //Create Exception Handler
        } catch (Exception ex) {
 
            System.out.println(ex);
        }
}

if(ae.getSource()==b5)
{
try{
    Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to database...");
      con = DriverManager.getConnection(DB_URL,USER,PASS);

      String str5 = t5.getText();
       
       PreparedStatement st5=con.prepareStatement("SELECT `balance` FROM `ledger_account`.`["+str5+"]` ORDER BY `date` DESC");
            
         
         
         
         
            ResultSet rs5 = st5.executeQuery();
            
             if (rs5.next()) {
                String s5 = rs5.getString(1);
                String s3 = t3.getText();
                String s4 = t4.getText();
                double s6= Double.parseDouble(s5);
                double s7= Double.parseDouble(s3);
                double s8= Double.parseDouble(s4);
                double n = s6+s7-s8;
                String s9= String.valueOf(n);
                t6.setText(s9);
             } else {
                 String s3 = t3.getText();
                String s4 = t4.getText();
                //double s6= Double.parseDouble(s5);
                double s7= Double.parseDouble(s3);
                double s8= Double.parseDouble(s4);
                double n = 0+s7-s8;
                String s9= String.valueOf(n);
                t6.setText(s9);
                //JOptionPane.showMessageDialog(null, "Data Not Found");
            }
             
             
            //Create Exception Handler
        } catch (Exception ex) {
 
            System.out.println(ex);
        }
}

if(ae.getSource()==b8)
{
System.out.println("Showing Table Data.......");
showTableData();
}

if(ae.getSource()==b4)
{
try{
    Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to database...");
      con = DriverManager.getConnection(DB_URL,USER,PASS);

      String str = t1.getText();
       
       PreparedStatement st=con.prepareStatement("SELECT `retailer_name` FROM `mahawali`.`retailer` WHERE `ledger_no` = ?");
            st.setString(1,str);
         
         
         
         
            ResultSet rs = st.executeQuery();
            
             if (rs.next()) {
                String s = rs.getString(1);
                
                //Sets Records in TextFields.
                t5.setText(s);
                
             } else {
                JOptionPane.showMessageDialog(null, "Name not Found");
            }
             
             
            //Create Exception Handler
        } catch (Exception ex) {
 
            System.out.println(ex);
        }
}

if(ae.getSource()==b7)
{
try{
    Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to database...");
      con = DriverManager.getConnection(DB_URL,USER,PASS);

      String str = t5.getText();
     // String s1="`"+str+"`";
       
       PreparedStatement st1=con.prepareStatement("CREATE TABLE `ledger_account`.`["+str+"]` (`date` DATE NULL,`debit` DECIMAL(12,4) NULL,`credit` DECIMAL(12,4) NULL,`balance` DECIMAL(12,4) NULL)");
          //  st1.setString(1,str);
         
         
         
         
            st1.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Retailer's Ledger Added To System");
             
             
            //Create Exception Handler
        } catch (Exception ex) {
 
            System.out.println(ex);
        }
}

if(ae.getSource()==b2)
{
Ledger ledger=new Ledger();
ledger.setVisible(false);
dispose();
new Login();
}
if(ae.getSource()==b3)
{
Ledger ledger=new Ledger();
ledger.setVisible(false);
dispose();
Bill m2=new Bill();
m2.Bill();
m2.setVisible(true);
}
}
}
