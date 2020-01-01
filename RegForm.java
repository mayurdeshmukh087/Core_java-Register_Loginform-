import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.*;
public class RegForm {

    JFrame f=new JFrame("REG");

    RegForm(){


   /* Container c=f.getContentPane();
    c.setBackground(Color.red); */

 ButtonGroup bg=new ButtonGroup();
     JLabel h1;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t5;
    JRadioButton ch1,ch2;
    JComboBox cb;
    JButton b1;
String Age[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
           h1=new JLabel("REGISTRATION");   
           l1 =new JLabel("FIRST NAME");
           l2=new JLabel("LAST NAME");
           l3=new JLabel("GENDER");
           l4=new JLabel("AGE");
          l5=new JLabel("MOBILE_NO");
           b1=new JButton("SAVE");
           t1=new JTextField();
           t2=new JTextField();
          t5=new JTextField();
           ch1=new JRadioButton("MALE");
           ch2=new JRadioButton("FEMALE");
          
           cb=new JComboBox(Age);
           
       h1.setBounds(200,40,500,50);
       l1.setBounds(50,100,70,40);
       l2.setBounds(50,150,100,40);
       l3.setBounds(50,210,70,30);
       l4.setBounds(50,265,70,30);
       l5.setBounds(50,300,80,30);
       t1.setBounds(200,100,200,40);
       t2.setBounds(200,150,200,40);
       t5.setBounds(200,300,200,40);
       ch1.setBounds(200,215,100,20);
       ch2.setBounds(300,215,100,20);
       cb.setBounds(200,270,90,20);
        b1.setBounds(160,360,200,40);
       bg.add(ch1); bg.add(ch2);    
f.add(h1);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(l5);
    f.add(t1);
    f.add(t2);
    f.add(t5);
    f.add(ch1);
    f.add(ch2);
    f.add(cb);
    f.add(b1);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
}
public static void main(String args[]){
new  RegForm();
}
}
