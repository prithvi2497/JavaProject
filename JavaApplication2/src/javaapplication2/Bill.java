import java.awt.BorderLayout;
import javax.swing.Box;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFrame;


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.io.*;
import java.awt.*;
import java.awt.print.Printable;
import java.awt.event.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.*;
import java.util.Date;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Bill extends JFrame implements ActionListener
{
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/EMP";
HashMap params = new HashMap();
   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;

JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
JTextField t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,
        t39,t40,t41,t42,t43,t44,t45,t46,t47,t48,t49,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60,t61,t62,t63,t64,t65,t66,t67,
        t68,t69,t70,t71,t72,t73,t74,t75,t76,t77,t78,t79,t80,t81,t82,t83,t84,t85,t86,t87,t88,t89,
        t90,t91,t92,t93,t94,t95,t96,t97,t98,t99,t100,t101,t102,t103,t104,t105,t106,t107,t108,t109
        ,t110,t111,t112,t113,t114,t115,t116,t117,t118,t119,t120,t121,t122,t123,t124,t125,t126,t127,t128,t129,t130,t131,t132,
        t133,t134,t135,t136;
JTextField t1,t2;
//final String a;
//final String b;
JComboBox j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15,j16;
    String i1;
  Statement st3;
    ResultSet rs3;  
JFrame frame1;
DefaultTableModel tableModel;
public void Bill()
{
    ImageIcon img5=new ImageIcon("C:\\Users\\Prithvi Raj\\Documents\\NetBeansProjects\\JavaApplication2\\dist\\javadoc\\resources\\imgs2.jpg");
JLabel bg2=new JLabel(img5);
add(bg2);
setSize(1366,800);
setTitle("BILL");
setResizable(true);
setVisible(true);
setLayout(null);




l3=new JLabel("Ledger no.:");
l3.setBounds(100,20,100,25);
t4=new JTextField();
t4.setBounds(200,20,100,25);

b7=new JButton("Search");
b7.setBounds(300,20,100,25);
b7.addActionListener(this);
b3=new JButton("Add Member");
b3.setBounds(500,20,150,25);
b3.addActionListener(this);

l4=new JLabel("Retailer's Name:");
l4.setBounds(100,50,100,25);
t1=new JTextField();
t1.setBounds(200,50,440,25);

l1=new JLabel("Retailer's GSTIN No.:");
l1.setBounds(100,80,150,25);
t2=new JTextField();
t2.setBounds(230,80,300,25);
l6=new JLabel("CGST");
l6.setBounds(830,90,150,25);
l7=new JLabel("SGST");
l7.setBounds(990,90,150,25);

l8=new JLabel("Item name");
l8.setBounds(200,110,250,25);
l2=new JLabel("HSN Code");
l2.setBounds(370,110,90,25);
l9=new JLabel("Rate");
l9.setBounds(485,110,100,25);
l10=new JLabel("Quantity");
l10.setBounds(590,110,100,25);
b11=new JButton("Price");
b11.setBounds(680,110,100,25);
b11.addActionListener(this);
l5=new JLabel("%");
l5.setBounds(810,110,50,25);
b2=new JButton("Amount");
b2.setBounds(840,110,100,25);
b2.addActionListener(this);
l11=new JLabel("%");
l11.setBounds(970,110,50,25);
b4=new JButton("Amount");
b4.setBounds(1000,110,100,25);
b4.addActionListener(this);
b8=new JButton("Add New Item"
        + "/"
        + "Update Item");
b8.setBounds(1120,110,200,50);
b8.addActionListener(this);


j1=new JComboBox();
j1.setBounds(100,140,250,25);
t27=new JTextField();
t27.setBounds(360,140,90,25);
t27.setText("0");
t3=new JTextField();
t3.setBounds(460,140,100,25);
t3.setText("0.0");
t7=new JTextField();
t7.setBounds(570,140,100,25);
t7.setText("0");
t11=new JTextField();
t11.setBounds(680,140,100,25);
t11.setText("0");
t66=new JTextField();
t66.setBounds(790,140,50,25);
t66.setText("0.0");
t67=new JTextField();
t67.setBounds(840,140,100,25);
t67.setText("0.0");
t68=new JTextField();
t68.setBounds(950,140,50,25);
t68.setText("0.0");
t69=new JTextField();
t69.setBounds(1000,140,100,25);
t69.setText("0.0");

j2=new JComboBox();
j2.setBounds(100,170,250,25);
t31=new JTextField();
t31.setBounds(360,170,90,25);
t31.setText("0");
t15=new JTextField();
t15.setBounds(460,170,100,25);
t15.setText("0.0");
t19=new JTextField();
t19.setBounds(570,170,100,25);
t19.setText("0");
t23=new JTextField();
t23.setBounds(680,170,100,25);
t23.setText("0");
t70=new JTextField();
t70.setBounds(790,170,50,25);
t70.setText("0.0");
t71=new JTextField();
t71.setBounds(840,170,100,25);
t71.setText("0.0");
t72=new JTextField();
t72.setBounds(950,170,50,25);
t72.setText("0.0");
t73=new JTextField();
t73.setBounds(1000,170,100,25);
t73.setText("0.0");

j3=new JComboBox();
j3.setBounds(100,200,250,25);
t35=new JTextField();
t35.setBounds(360,200,90,25);
t35.setText("0");
t8=new JTextField();
t8.setBounds(460,200,100,25);
t8.setText("0.0");
t9=new JTextField();
t9.setBounds(570,200,100,25);
t9.setText("0");
t10=new JTextField();
t10.setBounds(680,200,100,25);
t10.setText("0");
t74=new JTextField();
t74.setBounds(790,200,50,25);
t74.setText("0.0");
t75=new JTextField();
t75.setBounds(840,200,100,25);
t75.setText("0.0");
t76=new JTextField();
t76.setBounds(950,200,50,25);
t76.setText("0.0");
t77=new JTextField();
t77.setBounds(1000,200,100,25);
t77.setText("0.0");

j4=new JComboBox();
j4.setBounds(100,230,250,25);
t39=new JTextField();
t39.setBounds(360,230,90,25);
t39.setText("0");
t12=new JTextField();
t12.setBounds(460,230,100,25);
t12.setText("0.0");
t13=new JTextField();
t13.setBounds(570,230,100,25);
t13.setText("0");
t14=new JTextField();
t14.setBounds(680,230,100,25);
t14.setText("0");
t78=new JTextField();
t78.setBounds(790,230,50,25);
t78.setText("0.0");
t79=new JTextField();
t79.setBounds(840,230,100,25);
t79.setText("0.0");
t80=new JTextField();
t80.setBounds(950,230,50,25);
t80.setText("0.0");
t81=new JTextField();
t81.setBounds(1000,230,100,25);
t81.setText("0.0");


j5=new JComboBox();
j5.setBounds(100,260,250,25);
t43=new JTextField();
t43.setBounds(360,260,90,25);
t43.setText("0");
t16=new JTextField();
t16.setBounds(460,260,100,25);
t16.setText("0.0");
t17=new JTextField();
t17.setBounds(570,260,100,25);
t17.setText("0");
t18=new JTextField();
t18.setBounds(680,260,100,25);
t18.setText("0");
t82=new JTextField();
t82.setBounds(790,260,50,25);
t82.setText("0.0");
t83=new JTextField();
t83.setBounds(840,260,100,25);
t83.setText("0.0");
t84=new JTextField();
t84.setBounds(950,260,50,25);
t84.setText("0.0");
t85=new JTextField();
t85.setBounds(1000,260,100,25);
t85.setText("0.0");


j6=new JComboBox();
j6.setBounds(100,290,250,25);
t47=new JTextField();
t47.setBounds(360,290,90,25);
t47.setText("0");
t20=new JTextField();
t20.setBounds(460,290,100,25);
t20.setText("0.0");
t21=new JTextField();
t21.setBounds(570,290,100,25);
t21.setText("0");
t22=new JTextField();
t22.setBounds(680,290,100,25);
t22.setText("0");
t86=new JTextField();
t86.setBounds(790,290,50,25);
t86.setText("0.0");
t87=new JTextField();
t87.setBounds(840,290,100,25);
t87.setText("0.0");
t88=new JTextField();
t88.setBounds(950,290,50,25);
t88.setText("0.0");
t89=new JTextField();
t89.setBounds(1000,290,100,25);
t89.setText("0.0");


j7=new JComboBox();
j7.setBounds(100,320,250,25);
t51=new JTextField();
t51.setBounds(360,320,90,25);
t51.setText("0");
t24=new JTextField();
t24.setBounds(460,320,100,25);
t24.setText("0.0");
t25=new JTextField();
t25.setBounds(570,320,100,25);
t25.setText("0");
t26=new JTextField();
t26.setBounds(680,320,100,25);
t26.setText("0");
t90=new JTextField();
t90.setBounds(790,320,50,25);
t90.setText("0.0");
t91=new JTextField();
t91.setBounds(840,320,100,25);
t91.setText("0.0");
t92=new JTextField();
t92.setBounds(950,320,50,25);
t92.setText("0.0");
t93=new JTextField();
t93.setBounds(1000,320,100,25);
t93.setText("0.0");


j8=new JComboBox();
j8.setBounds(100,350,250,25);
t55=new JTextField();
t55.setBounds(360,350,90,25);
t55.setText("0");
t28=new JTextField();
t28.setBounds(460,350,100,25);
t28.setText("0.0");
t29=new JTextField();
t29.setBounds(570,350,100,25);
t29.setText("0");
t30=new JTextField();
t30.setBounds(680,350,100,25);
t30.setText("0");
t94=new JTextField();
t94.setBounds(790,350,50,25);
t94.setText("0.0");
t95=new JTextField();
t95.setBounds(840,350,100,25);
t95.setText("0.0");
t96=new JTextField();
t96.setBounds(950,350,50,25);
t96.setText("0.0");
t97=new JTextField();
t97.setBounds(1000,350,100,25);
t97.setText("0.0");


j9=new JComboBox();
j9.setBounds(100,380,250,25);
t59=new JTextField();
t59.setBounds(360,380,90,25);
t59.setText("0");
t32=new JTextField();
t32.setBounds(460,380,100,25);
t32.setText("0.0");
t33=new JTextField();
t33.setBounds(570,380,100,25);
t33.setText("0");
t34=new JTextField();
t34.setBounds(680,380,100,25);
t34.setText("0");
t98=new JTextField();
t98.setBounds(790,380,50,25);
t98.setText("0.0");
t99=new JTextField();
t99.setBounds(840,380,100,25);
t99.setText("0.0");
t100=new JTextField();
t100.setBounds(950,380,50,25);
t100.setText("0.0");
t101=new JTextField();
t101.setBounds(1000,380,100,25);
t101.setText("0.0");


j10=new JComboBox();
j10.setBounds(100,410,250,25);
t60=new JTextField();
t60.setBounds(360,410,90,25);
t60.setText("0");
t36=new JTextField();
t36.setBounds(460,410,100,25);
t36.setText("0.0");
t37=new JTextField();
t37.setBounds(570,410,100,25);
t37.setText("0");
t38=new JTextField();
t38.setBounds(680,410,100,25);
t38.setText("0");
t102=new JTextField();
t102.setBounds(790,410,50,25);
t102.setText("0.0");
t103=new JTextField();
t103.setBounds(840,410,100,25);
t103.setText("0.0");
t104=new JTextField();
t104.setBounds(950,410,50,25);
t104.setText("0.0");
t105=new JTextField();
t105.setBounds(1000,410,100,25);
t105.setText("0.0");


j11=new JComboBox();
j11.setBounds(100,440,250,25);
t61=new JTextField();
t61.setBounds(360,440,90,25);
t61.setText("0");
t40=new JTextField();
t40.setBounds(460,440,100,25);
t40.setText("0.0");
t41=new JTextField();
t41.setBounds(570,440,100,25);
t41.setText("0");
t42=new JTextField();
t42.setBounds(680,440,100,25);
t42.setText("0");
t106=new JTextField();
t106.setBounds(790,440,50,25);
t106.setText("0.0");
t107=new JTextField();
t107.setBounds(840,440,100,25);
t107.setText("0.0");
t108=new JTextField();
t108.setBounds(950,440,50,25);
t108.setText("0.0");
t109=new JTextField();
t109.setBounds(1000,440,100,25);
t109.setText("0.0");


j12=new JComboBox();
j12.setBounds(100,470,250,25);
t62=new JTextField();
t62.setBounds(360,470,90,25);
t62.setText("0");
t44=new JTextField();
t44.setBounds(460,470,100,25);
t44.setText("0.0");
t45=new JTextField();
t45.setBounds(570,470,100,25);
t45.setText("0");
t46=new JTextField();
t46.setBounds(680,470,100,25);
t46.setText("0");
t110=new JTextField();
t110.setBounds(790,470,50,25);
t110.setText("0.0");
t111=new JTextField();
t111.setBounds(840,470,100,25);
t111.setText("0.0");
t112=new JTextField();
t112.setBounds(950,470,50,25);
t112.setText("0.0");
t113=new JTextField();
t113.setBounds(1000,470,100,25);
t113.setText("0.0");


j13=new JComboBox();
j13.setBounds(100,500,250,25);
t63=new JTextField();
t63.setBounds(360,500,90,25);
t63.setText("0");
t48=new JTextField();
t48.setBounds(460,500,100,25);
t48.setText("0.0");
t49=new JTextField();
t49.setBounds(570,500,100,25);
t49.setText("0");
t50=new JTextField();
t50.setBounds(680,500,100,25);
t50.setText("0");
t114=new JTextField();
t114.setBounds(790,500,50,25);
t114.setText("0.0");
t115=new JTextField();
t115.setBounds(840,500,100,25);
t115.setText("0.0");
t116=new JTextField();
t116.setBounds(950,500,50,25);
t116.setText("0.0");
t117=new JTextField();
t117.setBounds(1000,500,100,25);
t117.setText("0.0");


j14=new JComboBox();
j14.setBounds(100,530,250,25);
t64=new JTextField();
t64.setBounds(360,530,90,25);
t64.setText("0");
t52=new JTextField();
t52.setBounds(460,530,100,25);
t52.setText("0.0");
t53=new JTextField();
t53.setBounds(570,530,100,25);
t53.setText("0");
t54=new JTextField();
t54.setBounds(680,530,100,25);
t54.setText("0");
t118=new JTextField();
t118.setBounds(790,530,50,25);
t118.setText("0.0");
t119=new JTextField();
t119.setBounds(840,530,100,25);
t119.setText("0.0");
t120=new JTextField();
t120.setBounds(950,530,50,25);
t120.setText("0.0");
t121=new JTextField();
t121.setBounds(1000,530,100,25);
t121.setText("0.0");


j15=new JComboBox();
j15.setBounds(100,560,250,25);
t65=new JTextField();
t65.setBounds(360,560,90,25);
t65.setText("0");
t56=new JTextField();
t56.setBounds(460,560,100,25);
t56.setText("0.0");
t57=new JTextField();
t57.setBounds(570,560,100,25);
t57.setText("0");
t58=new JTextField();
t58.setBounds(680,560,100,25);
t58.setText("0");
t122=new JTextField();
t122.setBounds(790,560,50,25);
t122.setText("0.0");
t123=new JTextField();
t123.setBounds(840,560,100,25);
t123.setText("0.0");
t124=new JTextField();
t124.setBounds(950,560,50,25);
t124.setText("0.0");
t125=new JTextField();
t125.setBounds(1000,560,100,25);
t125.setText("0.0");




b13=new JButton("Total:");
b13.setBounds(570,600,100,25);
b13.addActionListener(this);
t6=new JTextField();
t6.setText("0.0");
t6.setBounds(680,600,100,25);
t5=new JTextField();
t5.setText("0.0");
t5.setBounds(840,600,100,25);
t126=new JTextField();
t126.setText("0.0");
t126.setBounds(1000,600,100,25);

b5=new JButton("AMOUNT:");
b5.setBounds(570,640,100,25);
b5.addActionListener(this);
t127=new JTextField();
t127.setText("0.0");
t127.setBounds(680,640,100,25);

b6=new JButton("Print Bill");
b6.setBounds(300,670,150,25);
b6.addActionListener(this);

b1=new JButton("exit");
b1.setBounds(300,710,100,25);
b9=new JButton("back to main");
b9.setBounds(50,710,150,25);
b10=new JButton("move to Ledger Account");
b10.setBounds(450,710,200,25);

bg2.add(l1);bg2.add(l2);bg2.add(l3);bg2.add(l4);bg2.add(l5);
bg2.add(l6);bg2.add(l7);bg2.add(l8);bg2.add(l9);bg2.add(l10);bg2.add(l11);

bg2.add(t1);bg2.add(t2);bg2.add(t4);bg2.add(t5);bg2.add(t6);
bg2.add(t3);bg2.add(t7);bg2.add(t11);bg2.add(t15);bg2.add(t19);bg2.add(t23);
bg2.add(t27);bg2.add(t31);bg2.add(t35);bg2.add(t39);bg2.add(t43);bg2.add(t47);
bg2.add(t51);bg2.add(t55);bg2.add(t59);bg2.add(t60);bg2.add(t61);bg2.add(t62);
bg2.add(t63);bg2.add(t64);bg2.add(t65);bg2.add(t66);bg2.add(t67);bg2.add(t68);
bg2.add(t69);bg2.add(t70);bg2.add(t71);bg2.add(t72);bg2.add(t73);bg2.add(t74);
bg2.add(t75);bg2.add(t76);bg2.add(t77);bg2.add(t78);bg2.add(t79);bg2.add(t80);
bg2.add(t81);bg2.add(t82);bg2.add(t83);bg2.add(t84);bg2.add(t85);bg2.add(t86);
bg2.add(t87);bg2.add(t88);bg2.add(t89);bg2.add(t90);bg2.add(t91);bg2.add(t92);
bg2.add(t93);bg2.add(t94);bg2.add(t95);bg2.add(t96);bg2.add(t97);bg2.add(t98);
bg2.add(t99);bg2.add(t100);bg2.add(t101);bg2.add(t102);bg2.add(t103);bg2.add(t104);
bg2.add(t105);bg2.add(t106);bg2.add(t107);bg2.add(t108);bg2.add(t109);bg2.add(t110);
bg2.add(t111);bg2.add(t112);bg2.add(t113);bg2.add(t114);bg2.add(t115);bg2.add(t116);
bg2.add(t117);bg2.add(t118);bg2.add(t119);bg2.add(t120);bg2.add(t121);bg2.add(t122);
bg2.add(t123);bg2.add(t124);bg2.add(t125);bg2.add(t126);bg2.add(t127);

bg2.add(t8);bg2.add(t9);bg2.add(t10);
bg2.add(t12);bg2.add(t13);bg2.add(t14);
bg2.add(t16);bg2.add(t17);bg2.add(t18);
bg2.add(t20);bg2.add(t21);bg2.add(t22);
bg2.add(t24);bg2.add(t25);bg2.add(t26);
bg2.add(t28);bg2.add(t29);bg2.add(t30);
bg2.add(t32);bg2.add(t33);bg2.add(t34);
bg2.add(t36);bg2.add(t37);bg2.add(t38);
bg2.add(t40);bg2.add(t41);bg2.add(t42);
bg2.add(t44);bg2.add(t45);bg2.add(t46);
bg2.add(t48);bg2.add(t49);bg2.add(t50);
bg2.add(t52);bg2.add(t53);bg2.add(t54);
bg2.add(t56);bg2.add(t57);bg2.add(t58);

bg2.add(b1);bg2.add(b2);bg2.add(b3);bg2.add(b4);bg2.add(b5);bg2.add(b6);
bg2.add(b7);bg2.add(b8);bg2.add(b9);bg2.add(b10);bg2.add(b11);bg2.add(b13);

bg2.add(j1);bg2.add(j2);bg2.add(j3);bg2.add(j4);bg2.add(j5);bg2.add(j6);
bg2.add(j7);bg2.add(j8);bg2.add(j9);bg2.add(j10);bg2.add(j11);bg2.add(j12);bg2.add(j13);bg2.add(j14);bg2.add(j15);


combo();


b1.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);



this.setVisible(true);

}





void combo(){
    
    try{
      String s[]= new String[255];
      String t[]=new String[255];
      String u[]=new String[255];
      String v[]=new String[255];
      String w[]=new String[255];
      
      
      s[0]="SELECT";
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");

      Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
              
       Statement st=con.createStatement();       
       ResultSet rs3= st.executeQuery("SELECT * FROM mahawali.items;");

               int i=1;
        while (rs3.next()) {
                s[i]=rs3.getString("name");
                t[i]=rs3.getString("hsn");
                u[i]=rs3.getString("rate");
                v[i]=rs3.getString("cgst");
                w[i]=rs3.getString("sgst");
                i++;
                }
         for(int j=0;j<i;j++){
            j1.addItem(s[j]); 
            j2.addItem(s[j]);  
            j3.addItem(s[j]); 
            j4.addItem(s[j]); 
            j5.addItem(s[j]); 
            j6.addItem(s[j]); 
            j7.addItem(s[j]); 
            j8.addItem(s[j]); 
            j9.addItem(s[j]); 
            j10.addItem(s[j]); 
            j11.addItem(s[j]); 
            j12.addItem(s[j]); 
            j13.addItem(s[j]); 
            j14.addItem(s[j]);
            j15.addItem(s[j]);
         }
        
j1.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t27.setText(t[j1.getSelectedIndex()]);
        t3.setText(u[j1.getSelectedIndex()]);
        t66.setText(v[j1.getSelectedIndex()]);
        t68.setText(w[j1.getSelectedIndex()]);
    }
});
j2.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t31.setText(t[j2.getSelectedIndex()]);
        t15.setText(u[j2.getSelectedIndex()]);
        t70.setText(v[j2.getSelectedIndex()]);
        t72.setText(w[j2.getSelectedIndex()]);
    }
});         

j3.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t35.setText(t[j3.getSelectedIndex()]);
        t8.setText(u[j3.getSelectedIndex()]);
        t74.setText(v[j3.getSelectedIndex()]);
        t76.setText(w[j3.getSelectedIndex()]);
    }
});         

j4.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t39.setText(t[j4.getSelectedIndex()]);
        t12.setText(u[j4.getSelectedIndex()]);
        t78.setText(v[j4.getSelectedIndex()]);
        t80.setText(w[j4.getSelectedIndex()]);
    }
});         

j5.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t43.setText(t[j5.getSelectedIndex()]);
        t16.setText(u[j5.getSelectedIndex()]);
        t82.setText(v[j5.getSelectedIndex()]);
        t84.setText(w[j5.getSelectedIndex()]);
    }
});         

j6.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t47.setText(t[j6.getSelectedIndex()]);
        t20.setText(u[j6.getSelectedIndex()]);
        t86.setText(v[j6.getSelectedIndex()]);
        t88.setText(w[j6.getSelectedIndex()]);
    }
});         

j7.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t51.setText(t[j7.getSelectedIndex()]);
        t24.setText(u[j7.getSelectedIndex()]);
        t90.setText(v[j7.getSelectedIndex()]);
        t92.setText(w[j7.getSelectedIndex()]);
    }
});         

j8.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t55.setText(t[j8.getSelectedIndex()]);
        t28.setText(u[j8.getSelectedIndex()]);
        t94.setText(v[j8.getSelectedIndex()]);
        t96.setText(w[j8.getSelectedIndex()]);
    }
});         

j9.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t59.setText(t[j9.getSelectedIndex()]);
        t32.setText(u[j9.getSelectedIndex()]);
        t98.setText(v[j9.getSelectedIndex()]);
        t100.setText(w[j9.getSelectedIndex()]);
    }
});         

j10.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t63.setText(t[j10.getSelectedIndex()]);
        t36.setText(u[j10.getSelectedIndex()]);
        t102.setText(v[j10.getSelectedIndex()]);
        t104.setText(w[j10.getSelectedIndex()]);
    }
});         
j11.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t67.setText(t[j11.getSelectedIndex()]);
        t40.setText(u[j11.getSelectedIndex()]);
        t106.setText(v[j11.getSelectedIndex()]);
        t108.setText(w[j11.getSelectedIndex()]);
    }
});         

j12.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t71.setText(t[j12.getSelectedIndex()]);
        t44.setText(u[j12.getSelectedIndex()]);
        t110.setText(v[j12.getSelectedIndex()]);
        t112.setText(w[j12.getSelectedIndex()]);
    }
});         

j13.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t75.setText(t[j13.getSelectedIndex()]);
        t48.setText(u[j13.getSelectedIndex()]);
        t114.setText(v[j13.getSelectedIndex()]);
        t116.setText(w[j13.getSelectedIndex()]);
    }
});         

j14.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t79.setText(t[j14.getSelectedIndex()]);
        t52.setText(u[j14.getSelectedIndex()]);
        t118.setText(v[j14.getSelectedIndex()]);
        t120.setText(w[j14.getSelectedIndex()]);
    }
});      

j15.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t83.setText(t[j15.getSelectedIndex()]);
        t56.setText(u[j15.getSelectedIndex()]);
        t122.setText(v[j15.getSelectedIndex()]);
        t124.setText(w[j15.getSelectedIndex()]);
    }
});      

    
    }
    catch(Exception o1){
        
    }
    
    
    
}


private void TableModelData() {
    //params.put("cd", t5.getText());
    //params.put("total", t6.getText());
    
        int c1=0;
        String c2="0";
        if(!(c2.equals(String.valueOf(j1.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j2.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j3.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j4.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j5.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j6.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j7.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j8.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j9.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j10.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j11.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j12.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j13.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j14.getSelectedIndex()))))   
            c1++;
        if(!(c2.equals(String.valueOf(j15.getSelectedIndex()))))   
            c1++;
        

              
    
    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17;
        s1 = String.valueOf(j1.getSelectedItem());
        s2 = String.valueOf(j2.getSelectedItem());
        s3 = String.valueOf(j3.getSelectedItem());
        s4 = String.valueOf(j4.getSelectedItem());
        s5 = String.valueOf(j5.getSelectedItem());
        s6 = String.valueOf(j6.getSelectedItem());
        s7 = String.valueOf(j7.getSelectedItem());
        s8 = String.valueOf(j8.getSelectedItem());
        s9 = String.valueOf(j9.getSelectedItem());
        s10 = String.valueOf(j10.getSelectedItem());
        s11 = String.valueOf(j11.getSelectedItem());
        s12 = String.valueOf(j12.getSelectedItem());
        s13 = String.valueOf(j13.getSelectedItem());
        s14 = String.valueOf(j14.getSelectedItem());
        s15 = String.valueOf(j15.getSelectedItem());
        String[] columnNames = {"Particulars","HSN Code","Quantity", "Rate", "Taxable Value","%","Amount","%","Amount","M/s.","GSTIN No.","Total","Total","Total","Amount"};
        
        String [][]data=new String[c1][15];
        c1--;
        if(c1>=0){
             data[0][0]=s1;
            data[0][1]=t27.getText();
            data[0][2]=t3.getText();
            data[0][3]=t7.getText();
            data[0][4]=t11.getText();
            data[0][5]=t66.getText();
            data[0][6]=t67.getText();
            data[0][7]=t68.getText();
            data[0][8]=t69.getText();
            data[0][9]=t1.getText();
            data[0][10]=t2.getText();
            data[0][11]=t6.getText();
            data[0][12]=t5.getText();
            data[0][13]=t126.getText();
            data[0][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
             data[1][0]=s2;
            data[1][1]=t31.getText();
            data[1][2]=t15.getText();
            data[1][3]=t19.getText();
            data[1][4]=t23.getText();
            data[1][5]=t70.getText();
            data[1][6]=t71.getText();
            data[1][7]=t72.getText();
            data[1][8]=t73.getText();
            data[1][11]=t6.getText();
            data[1][12]=t5.getText();
            data[1][13]=t126.getText();
            data[1][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[2][0]=s3;
            data[2][1]=t35.getText();
            data[2][2]=t8.getText();
            data[2][3]=t9.getText();
            data[2][4]=t10.getText();
            data[2][5]=t74.getText();
            data[2][6]=t75.getText();
            data[2][7]=t76.getText();
            data[2][8]=t77.getText();
            data[2][11]=t6.getText();
            data[2][12]=t5.getText();
            data[2][13]=t126.getText();
            data[2][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[3][0]=s4;
            data[3][1]=t39.getText();
            data[3][2]=t12.getText();
            data[3][3]=t13.getText();
            data[3][4]=t14.getText();
            data[3][5]=t78.getText();
            data[3][6]=t79.getText();
            data[3][7]=t80.getText();
            data[3][8]=t81.getText();
            data[3][11]=t6.getText();
            data[3][12]=t5.getText();
            data[3][13]=t126.getText();
            data[3][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[4][0]=s5;
            data[4][1]=t43.getText();
            data[4][2]=t16.getText();
            data[4][3]=t17.getText();
            data[4][4]=t18.getText();
            data[4][5]=t82.getText();
            data[4][6]=t83.getText();
            data[4][7]=t84.getText();
            data[4][8]=t85.getText();
            data[4][11]=t6.getText();
            data[4][12]=t5.getText();
            data[4][13]=t126.getText();
            data[4][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[5][0]=s6;
            data[5][1]=t47.getText();
            data[5][2]=t20.getText();
            data[5][3]=t21.getText();
            data[5][4]=t22.getText();
            data[5][5]=t86.getText();
            data[5][6]=t87.getText();
            data[5][7]=t88.getText();
            data[5][8]=t89.getText();
            data[5][11]=t6.getText();
            data[5][12]=t5.getText();
            data[5][13]=t126.getText();
            data[5][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[6][0]=s7;
            data[6][1]=t51.getText();
            data[6][2]=t24.getText();
            data[6][3]=t25.getText();
            data[6][4]=t26.getText();
            data[6][5]=t90.getText();
            data[6][6]=t91.getText();
            data[6][7]=t92.getText();
            data[6][8]=t93.getText();
            data[6][11]=t6.getText();
            data[6][12]=t5.getText();
            data[6][13]=t126.getText();
            data[6][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[7][0]=s8;
            data[7][1]=t55.getText();
            data[7][2]=t28.getText();
            data[7][3]=t29.getText();
            data[7][4]=t30.getText();
            data[7][5]=t94.getText();
            data[7][6]=t95.getText();
            data[7][7]=t96.getText();
            data[7][8]=t97.getText();
            data[7][11]=t6.getText();
            data[7][12]=t5.getText();
            data[7][13]=t126.getText();
            data[7][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[8][0]=s9;
            data[8][1]=t59.getText();
            data[8][2]=t32.getText();
            data[8][3]=t33.getText();
            data[8][4]=t34.getText();
            data[8][5]=t98.getText();
            data[8][6]=t99.getText();
            data[8][7]=t100.getText();
            data[8][8]=t101.getText();
            data[8][11]=t6.getText();
            data[8][12]=t5.getText();
            data[8][13]=t126.getText();
            data[8][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[9][0]=s10;
            data[9][1]=t60.getText();
            data[9][2]=t36.getText();
            data[9][3]=t37.getText();
            data[9][4]=t38.getText();
            data[9][5]=t102.getText();
            data[9][6]=t103.getText();
            data[9][7]=t104.getText();
            data[9][8]=t105.getText();
            data[9][11]=t6.getText();
            data[9][12]=t5.getText();
            data[9][13]=t126.getText();
            data[9][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[10][0]=s11;
            data[10][1]=t61.getText();
            data[10][2]=t40.getText();
            data[10][3]=t41.getText();
            data[10][4]=t42.getText();
            data[10][5]=t106.getText();
            data[10][6]=t107.getText();
            data[10][7]=t108.getText();
            data[10][8]=t109.getText();
            data[10][11]=t6.getText();
            data[10][12]=t5.getText();
            data[10][13]=t126.getText();
            data[10][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[11][0]=s12;
            data[11][1]=t62.getText();
            data[11][2]=t44.getText();
            data[11][3]=t45.getText();
            data[11][4]=t46.getText();
            data[11][5]=t110.getText();
            data[11][6]=t111.getText();
            data[11][7]=t112.getText();
            data[11][8]=t113.getText();
            data[11][11]=t6.getText();
            data[11][12]=t5.getText();
            data[11][13]=t126.getText();
            data[11][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[12][0]=s13;
            data[12][1]=t63.getText();
            data[12][2]=t48.getText();
            data[12][3]=t49.getText();
            data[12][4]=t50.getText();
            data[12][5]=t114.getText();
            data[12][6]=t115.getText();
            data[12][7]=t116.getText();
            data[12][8]=t117.getText();
            data[12][11]=t6.getText();
            data[12][12]=t5.getText();
            data[12][13]=t126.getText();
            data[12][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[13][0]=s14;
            data[13][1]=t64.getText();
            data[13][2]=t52.getText();
            data[13][3]=t53.getText();
            data[13][4]=t54.getText();
            data[13][5]=t118.getText();
            data[13][6]=t119.getText();
            data[13][7]=t120.getText();
            data[13][8]=t121.getText();
            data[13][11]=t6.getText();
            data[13][12]=t5.getText();
            data[13][13]=t126.getText();
            data[13][14]=t127.getText();
            c1--;
            }
        if(c1>=0){
            data[14][0]=s15;
            data[14][1]=t65.getText();
            data[14][2]=t56.getText();
            data[14][3]=t57.getText();
            data[14][4]=t58.getText();
            data[14][5]=t122.getText();
            data[14][6]=t123.getText();
            data[14][7]=t124.getText();
            data[14][8]=t125.getText();
            data[14][11]=t6.getText();
            data[14][12]=t5.getText();
            data[14][13]=t126.getText();
            data[14][14]=t127.getText();
            c1--;
            }
        

      
  
        
        tableModel = new DefaultTableModel(data, columnNames);
    }

void combo1(){
    
    try{
      String s[]= new String[255];
      String t[]=new String[255];
      String u[]=new String[255];
      String v[]=new String[255];
      String w[]=new String[255];
      
      
      s[0]="SELECT";
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");

      Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
              
       Statement st=con.createStatement();       
       ResultSet rs3= st.executeQuery("SELECT * FROM mahawali.items;");

               int i=1;
        while (rs3.next()) {
                s[i]=rs3.getString("name");
                t[i]=rs3.getString("hsn");
                u[i]=rs3.getString("rate");
                v[i]=rs3.getString("cgst");
                w[i]=rs3.getString("sgst");
                i++;
                }
         for(int j=0;j<i;j++){
            j16.addItem(s[j]);
         }
        

j16.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        t33.setText(t[j16.getSelectedIndex()]);
        t34.setText(u[j16.getSelectedIndex()]);
        t35.setText(v[j16.getSelectedIndex()]);
        t36.setText(w[j16.getSelectedIndex()]);
    }
});     
    }
    catch(Exception o1){
        
    }
    
    
    
}

void showFrame(){
    Connection con = null;
   Statement stmt = null;
frame1 = new JFrame("Retailer Ledger Details");
frame1.setLayout(new BorderLayout()); 
ImageIcon img5=new ImageIcon("C:\\Users\\Prithvi Raj\\Documents\\NetBeansProjects\\JavaApplication2\\dist\\javadoc\\resources\\imgs1.jpg");
JLabel bg2=new JLabel(img5);
b12=new JButton("Add New Item");
b12.setBounds(10, 100, 200, 25);
b12.addActionListener(this);
l12=new JLabel("Item name");
l12.setBounds(10,130,250,25);
l13=new JLabel("HSN Code");
l13.setBounds(280,130,90,25);
l14=new JLabel("Rate");
l14.setBounds(370,130,100,25);
l15=new JLabel("CGST %");
l15.setBounds(460,130,150,25);
l16=new JLabel("SGST %");
l16.setBounds(570,130,150,25);
t128=new JTextField();
t128.setBounds(10,160,250,25);
t129=new JTextField();
t129.setBounds(280,160,70,25);
t130=new JTextField();
t130.setBounds(370,160,70,25);
t131=new JTextField();
t131.setBounds(460,160,70,25);
t132=new JTextField();
t132.setBounds(570,160,70,25);

b15=new JButton("Update Item");
b15.setBounds(10, 400, 200, 25);
b15.addActionListener(this);
j16=new JComboBox();
j16.setBounds(10,430,250,25);
t33=new JTextField();
t33.setBounds(280,430,70,25);
t33.setText("0");
t34=new JTextField();
t34.setBounds(370,430,70,25);
t34.setText("0.0");
t35=new JTextField();
t35.setBounds(460,430,70,25);
t35.setText("0.0");
t36=new JTextField();
t36.setBounds(570,430,70,25);
t36.setText("0.0");

combo1();
bg2.add(b12);bg2.add(l12);bg2.add(l13);bg2.add(l14);bg2.add(l15);bg2.add(l16);bg2.add(t128);bg2.add(t129);bg2.add(t130);bg2.add(t131);bg2.add(t132);
bg2.add(b15);bg2.add(j16);bg2.add(t33);bg2.add(t34);bg2.add(t35);bg2.add(t36);
frame1.add(bg2);
frame1.setVisible(true);
frame1.setSize(700,800);
}




    @Override
    public void actionPerformed(ActionEvent ae)
{
Connection con = null;
   Statement stmt = null;
if(ae.getSource()==b1)
{
System.exit(0);
}

if(ae.getSource()==b12)
{
 try{
    Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to database...");
      con = DriverManager.getConnection(DB_URL,USER,PASS);

      String str = t128.getText();
        String str1 = t129.getText();
        String str2 = t130.getText();
        String str3 = t131.getText();
        String str4 = t132.getText();
       
         PreparedStatement st1=con.prepareStatement("INSERT INTO `mahawali`.`items`\n" +
"(`name`,\n" +
"`hsn`,\n" +
"`rate`,\n" +
"`cgst`,\n" +
"`sgst`)\n" +
"VALUES\n" +
"(?,\n" +
"?,\n" +
"?,\n" +
"?,\n" +
"?);");
            st1.setString(1,str);
            st1.setString(2,str1);
            st1.setString(3,str2);
            st1.setString(4,str3);
            st1.setString(5,str4);
     
             st1.executeUpdate();
             JOptionPane.showMessageDialog(null, "Item Added To List");
             
             
            //Create Exception Handler
        } catch (Exception ex1) {
 
            System.out.println(ex1);
        }
}

if(ae.getSource()==b15)
{
 try{
    Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to database...");
      con = DriverManager.getConnection(DB_URL,USER,PASS);

      String str = String.valueOf(j16.getSelectedItem());
        String str1 = t33.getText();
        String str2 = t34.getText();
        String str3 = t35.getText();
        String str4 = t36.getText();
       
         PreparedStatement st1=con.prepareStatement("UPDATE `mahawali`.`items`\n" +
"SET\n" +
"`hsn` = ?,\n" +
"`rate` = ?,\n" +
"`cgst` = ?,\n" +
"`sgst` = ?" +
"WHERE `name` = ?;");
            st1.setString(1,str1);
            st1.setString(2,str2);
            st1.setString(3,str3);
            st1.setString(4,str4);
            st1.setString(5,str);
            
             st1.executeUpdate();
             JOptionPane.showMessageDialog(null, "Item Updated");
             
             
            //Create Exception Handler
        } catch (Exception ex1) {
 
            System.out.println(ex1);
        }
}

if(ae.getSource()==b8)
{
showFrame();
}

if(ae.getSource()==b2)
{
    DecimalFormat numberFormat = new DecimalFormat("#.00");
double fn = Double.parseDouble(t11.getText());
double sn = Double.parseDouble(t66.getText());
t67.setText(String.valueOf(numberFormat.format(fn*(sn/100))));

double fn1 = Double.parseDouble(t23.getText());
double sn1 = Double.parseDouble(t70.getText());
t71.setText(String.valueOf(numberFormat.format(fn1*(sn1/100))));

double fn2 = Double.parseDouble(t10.getText());
double sn2 = Double.parseDouble(t74.getText());
t75.setText(String.valueOf(numberFormat.format(fn2*(sn2/100))));

double fn3 = Double.parseDouble(t14.getText());
double sn3= Double.parseDouble(t78.getText());
t79.setText(String.valueOf(numberFormat.format(fn3*(sn3/100))));

double fn4 = Double.parseDouble(t18.getText());
double sn4 = Double.parseDouble(t82.getText());
t83.setText(String.valueOf(numberFormat.format(fn4*(sn4/100))));

double fn5 = Double.parseDouble(t22.getText());
double sn5= Double.parseDouble(t86.getText());
t87.setText(String.valueOf(numberFormat.format(fn5*(sn5/100))));

double fn6 = Double.parseDouble(t26.getText());
double sn6 = Double.parseDouble(t90.getText());
t91.setText(String.valueOf(numberFormat.format(fn6*(sn6/100))));

double fn7 = Double.parseDouble(t30.getText());
double sn7 = Double.parseDouble(t94.getText());
t95.setText(String.valueOf(numberFormat.format(fn7*(sn7/100))));

double fn8 = Double.parseDouble(t34.getText());
double sn8 = Double.parseDouble(t98.getText());
t99.setText(String.valueOf(numberFormat.format(fn8*(sn8/100))));

double fn9 = Double.parseDouble(t38.getText());
double sn9 = Double.parseDouble(t102.getText());
t103.setText(String.valueOf(numberFormat.format(fn9*(sn9/100))));

double fn10 = Double.parseDouble(t42.getText());
double sn10 = Double.parseDouble(t106.getText());
t107.setText(String.valueOf(numberFormat.format(fn10*(sn10/100))));

double fn11 = Double.parseDouble(t46.getText());
double sn11 = Double.parseDouble(t110.getText());
t111.setText(String.valueOf(numberFormat.format(fn11*(sn11/100))));

double fn12 = Double.parseDouble(t50.getText());
double sn12 = Double.parseDouble(t114.getText());
t115.setText(String.valueOf(numberFormat.format(fn12*(sn12/100))));

double fn13 = Double.parseDouble(t54.getText());
double sn13 = Double.parseDouble(t118.getText());
t119.setText(String.valueOf(numberFormat.format(fn13*(sn13/100))));

double fn14 = Double.parseDouble(t58.getText());
double sn14 = Double.parseDouble(t122.getText());
t123.setText(String.valueOf(numberFormat.format(fn14*(sn14/100))));
}


if(ae.getSource()==b4)
{
    DecimalFormat numberFormat = new DecimalFormat("#.00");
double fn = Double.parseDouble(t11.getText());
double sn = Double.parseDouble(t68.getText());
t69.setText(String.valueOf(numberFormat.format(fn*(sn/100))));

double fn1 = Double.parseDouble(t23.getText());
double sn1 = Double.parseDouble(t72.getText());
t73.setText(String.valueOf(numberFormat.format(fn1*(sn1/100))));

double fn2 = Double.parseDouble(t10.getText());
double sn2 = Double.parseDouble(t76.getText());
t77.setText(String.valueOf(numberFormat.format(fn2*(sn2/100))));

double fn3 = Double.parseDouble(t14.getText());
double sn3= Double.parseDouble(t80.getText());
t81.setText(String.valueOf(numberFormat.format(fn3*(sn3/100))));

double fn4 = Double.parseDouble(t18.getText());
double sn4 = Double.parseDouble(t84.getText());
t85.setText(String.valueOf(numberFormat.format(fn4*(sn4/100))));

double fn5 = Double.parseDouble(t22.getText());
double sn5= Double.parseDouble(t88.getText());
t89.setText(String.valueOf(numberFormat.format(fn5*(sn5/100))));

double fn6 = Double.parseDouble(t26.getText());
double sn6 = Double.parseDouble(t92.getText());
t93.setText(String.valueOf(numberFormat.format(fn6*(sn6/100))));

double fn7 = Double.parseDouble(t30.getText());
double sn7 = Double.parseDouble(t96.getText());
t97.setText(String.valueOf(numberFormat.format(fn7*(sn7/100))));

double fn8 = Double.parseDouble(t34.getText());
double sn8 = Double.parseDouble(t100.getText());
t101.setText(String.valueOf(numberFormat.format(fn8*(sn8/100))));

double fn9 = Double.parseDouble(t38.getText());
double sn9 = Double.parseDouble(t104.getText());
t105.setText(String.valueOf(numberFormat.format(fn9*(sn9/100))));

double fn10 = Double.parseDouble(t42.getText());
double sn10 = Double.parseDouble(t108.getText());
t109.setText(String.valueOf(numberFormat.format(fn10*(sn10/100))));

double fn11 = Double.parseDouble(t46.getText());
double sn11 = Double.parseDouble(t112.getText());
t113.setText(String.valueOf(numberFormat.format(fn11*(sn11/100))));

double fn12 = Double.parseDouble(t50.getText());
double sn12 = Double.parseDouble(t116.getText());
t117.setText(String.valueOf(numberFormat.format(fn12*(sn12/100))));

double fn13 = Double.parseDouble(t54.getText());
double sn13 = Double.parseDouble(t120.getText());
t119.setText(String.valueOf(numberFormat.format(fn13*(sn13/100))));

double fn14 = Double.parseDouble(t58.getText());
double sn14 = Double.parseDouble(t124.getText());
t125.setText(String.valueOf(numberFormat.format(fn14*(sn14/100))));
}


if(ae.getSource()==b6)
{
   JasperPrint jasperPrint = null;
        TableModelData();
        
        try {
            JasperCompileManager.compileReportToFile("C:\\Users\\Prithvi Raj\\Documents\\NetBeansProjects\\JavaApplication2\\src\\javaapplication2\\I1.jrxml");
            jasperPrint = JasperFillManager.fillReport("C:\\Users\\Prithvi Raj\\Documents\\NetBeansProjects\\JavaApplication2\\src\\javaapplication2\\I1.jasper", new HashMap(),new JRTableModelDataSource(tableModel));
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            jasperViewer.setVisible(true);
            
        } catch (JRException ex) {
        }
}

if(ae.getSource()==b9)
{
Bill bill=new Bill();
bill.setVisible(false);
dispose();
Login login = new Login();
}

if(ae.getSource()==b5)
{
    DecimalFormat numberFormat = new DecimalFormat("#.00");
double s1 = Double.parseDouble(t6.getText());
double s2 = Double.parseDouble(t5.getText());
double s3 = Double.parseDouble(t126.getText());
double t = s1+s2+s3;
t127.setText(String.valueOf(numberFormat.format(t)));
}

if(ae.getSource()==b13)
{
    DecimalFormat numberFormat = new DecimalFormat("#.00");
double n1 = Double.parseDouble(t10.getText());
double n2 = Double.parseDouble(t14.getText());
double n3 = Double.parseDouble(t18.getText());
double n4 = Double.parseDouble(t22.getText());
double n5 = Double.parseDouble(t26.getText());
double n6 = Double.parseDouble(t30.getText());
double n7 = Double.parseDouble(t34.getText());
double n8 = Double.parseDouble(t38.getText());
double n9 = Double.parseDouble(t42.getText());
double n10 = Double.parseDouble(t46.getText());
double n11 = Double.parseDouble(t50.getText());
double n12 = Double.parseDouble(t54.getText());
double n13 = Double.parseDouble(t58.getText());
double n14 = Double.parseDouble(t11.getText());
double n15 = Double.parseDouble(t23.getText());
double m = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11+n12+n13+n14+n15;
t6.setText(String.valueOf(numberFormat.format(m)));

double o1 = Double.parseDouble(t67.getText());
double o2 = Double.parseDouble(t71.getText());
double o3 = Double.parseDouble(t75.getText());
double o4 = Double.parseDouble(t79.getText());
double o5 = Double.parseDouble(t83.getText());
double o6 = Double.parseDouble(t87.getText());
double o7 = Double.parseDouble(t91.getText());
double o8 = Double.parseDouble(t95.getText());
double o9 = Double.parseDouble(t99.getText());
double o10 = Double.parseDouble(t103.getText());
double o11 = Double.parseDouble(t107.getText());
double o12 = Double.parseDouble(t111.getText());
double o13 = Double.parseDouble(t115.getText());
double o14 = Double.parseDouble(t119.getText());
double o15 = Double.parseDouble(t123.getText());
double p = o1+o2+o3+o4+o5+o6+o7+o8+o9+o10+o11+o12+o13+o14+o15;
t5.setText(String.valueOf(numberFormat.format(p)));

double q1 = Double.parseDouble(t69.getText());
double q2 = Double.parseDouble(t73.getText());
double q3 = Double.parseDouble(t77.getText());
double q4 = Double.parseDouble(t81.getText());
double q5 = Double.parseDouble(t85.getText());
double q6 = Double.parseDouble(t89.getText());
double q7 = Double.parseDouble(t93.getText());
double q8 = Double.parseDouble(t97.getText());
double q9 = Double.parseDouble(t101.getText());
double q10 = Double.parseDouble(t105.getText());
double q11 = Double.parseDouble(t109.getText());
double q12 = Double.parseDouble(t113.getText());
double q13 = Double.parseDouble(t117.getText());
double q14 = Double.parseDouble(t121.getText());
double q15 = Double.parseDouble(t125.getText());
double r = q1+q2+q3+q4+q5+q6+q7+q8+q9+q10+q11+q12+q13+q14+q15;
t126.setText(String.valueOf(numberFormat.format(r)));
}


if(ae.getSource()==b11)
{
 DecimalFormat numberFormat = new DecimalFormat("#.00");

double fn = Double.parseDouble(t8.getText());
double sn = Double.parseDouble(t9.getText());
t10.setText(String.valueOf(numberFormat.format(fn*sn)));

double fn1 = Double.parseDouble(t12.getText());
double sn1 = Double.parseDouble(t13.getText());
t14.setText(String.valueOf(numberFormat.format(fn1*sn1)));

double fn2 = Double.parseDouble(t16.getText());
double sn2 = Double.parseDouble(t17.getText());
t18.setText(String.valueOf(numberFormat.format(fn2*sn2)));

double fn3 = Double.parseDouble(t20.getText());
double sn3= Double.parseDouble(t21.getText());
t22.setText(String.valueOf(numberFormat.format(fn3*sn3)));

double fn4 = Double.parseDouble(t24.getText());
double sn4 = Double.parseDouble(t25.getText());
t26.setText(String.valueOf(numberFormat.format(fn4*sn4)));

double fn5 = Double.parseDouble(t28.getText());
double sn5= Double.parseDouble(t29.getText());
t30.setText(String.valueOf(numberFormat.format(fn5*sn5)));

double fn6 = Double.parseDouble(t32.getText());
double sn6 = Double.parseDouble(t33.getText());
t34.setText(String.valueOf(numberFormat.format(fn6*sn6)));

double fn7 = Double.parseDouble(t36.getText());
double sn7 = Double.parseDouble(t37.getText());
t38.setText(String.valueOf(numberFormat.format(fn7*sn7)));

double fn8 = Double.parseDouble(t40.getText());
double sn8 = Double.parseDouble(t41.getText());
t42.setText(String.valueOf(numberFormat.format(fn8*sn8)));

double fn9 = Double.parseDouble(t44.getText());
double sn9 = Double.parseDouble(t45.getText());
t46.setText(String.valueOf(numberFormat.format(fn9*sn9)));

double fn10 = Double.parseDouble(t48.getText());
double sn10 = Double.parseDouble(t49.getText());
t50.setText(String.valueOf(numberFormat.format(fn10*sn10)));

double fn11 = Double.parseDouble(t52.getText());
double sn11 = Double.parseDouble(t53.getText());
t54.setText(String.valueOf(numberFormat.format(fn11*sn11)));

double fn12 = Double.parseDouble(t56.getText());
double sn12 = Double.parseDouble(t57.getText());
t58.setText(String.valueOf(numberFormat.format(fn12*sn12)));

double fn13 = Double.parseDouble(t3.getText());
double sn13 = Double.parseDouble(t7.getText());
t11.setText(String.valueOf(numberFormat.format(fn13*sn13)));

double fn14 = Double.parseDouble(t15.getText());
double sn14 = Double.parseDouble(t19.getText());
t23.setText(String.valueOf(numberFormat.format(fn14*sn14)));
}


if(ae.getSource()==b10)
{
Bill bill=new Bill();
bill.setVisible(false);
dispose();
Ledger m3=new Ledger();
m3.Ledger();
m3.setVisible(true);
}



if(ae.getSource()==b7)
{
try{
    Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to database...");
      con = DriverManager.getConnection(DB_URL,USER,PASS);

      String str = t4.getText();
       
       PreparedStatement st=con.prepareStatement("SELECT `retailer_name`, `gstin` FROM `mahawali`.`retailer` WHERE `ledger_no` = ?");
            st.setString(1,str);
         
         
         
         
            ResultSet rs = st.executeQuery();
            
             if (rs.next()) {
                String s = rs.getString(1);
                String r=rs.getString(2);
                t1.setText(s);
                t2.setText(r);
                
             } else {
                JOptionPane.showMessageDialog(null, "Name not Found");
            }
             
             
            //Create Exception Handler
        } catch (Exception ex) {
 
            System.out.println(ex);
        }
}
if(ae.getSource()==b3)
{
        try{
    Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to database...");
      con = DriverManager.getConnection(DB_URL,USER,PASS);

      String str = t4.getText();
        String str1 = t1.getText();
       
         PreparedStatement st1=con.prepareStatement("INSERT INTO `bill`.`retailer list` (`ledger no`,`retailer name`) VALUES(?,?)");
            st1.setString(1,str);
            st1.setString(2,str1);
         
         
         
            
    
             st1.executeUpdate();
             JOptionPane.showMessageDialog(null, "Member Added To List");
             
             
            //Create Exception Handler
        } catch (Exception ex1) {
 
            System.out.println(ex1);
        }
      }
   }
 
    

}
    
  
    
    
   

    

