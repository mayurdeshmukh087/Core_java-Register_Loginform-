import javax.swing.ImageIcon;
import javax.swing.*;
 import java.awt.*;
import java.awt.event.*;
public class LoginFrame extends JFrame implements ActionListener {
Container c;   
    /* JPanel jp=new JPanel(); */
     JLabel j1=new JLabel();
     JLabel userlabel=new JLabel("USERNAME");
    JLabel passlabel=new JLabel("PASSWORD");
    JLabel heading=new JLabel("LOGIN");
 /*   j1.setIcon(new ImageIcon("images (4).jpeg"));
    jp.add(j1); */

     JButton login_btn=new JButton("LOGIN");    
      JButton reg_btn=new JButton("REGISTER");

    JTextField user_tf=new JTextField();
     JPasswordField pass_tf=new JPasswordField();

            LoginFrame(){

c=this.getContentPane();
c.setLayout(null);
c.setBackground(Color.yellow);

heading.setBounds(300,50,200,100);
userlabel.setBounds(240,200,200,40);
passlabel.setBounds(240,250,200,40);
Font f0=new Font("Algerian",Font.BOLD,20);
Font f1=new Font("Algerian",Font.PLAIN,35);
heading.setFont(f1);
Font f =new Font("Arial",Font.BOLD,20);

userlabel.setFont(f);
passlabel.setFont(f);

user_tf.setBounds(390,200,200,40);
pass_tf.setBounds(390,250,200,40);

user_tf.setFont(f);
pass_tf.setFont(f);

login_btn.setBounds(250,300,100,40);
login_btn.setFont(f0);
login_btn.addActionListener(this);

reg_btn.setBounds(400,300,150,40);
reg_btn.setFont(f0);
reg_btn.addActionListener(this);

c.add(heading);
c.add(userlabel);
c.add(passlabel);
c.add(user_tf);
c.add(pass_tf);
c.add(login_btn);
c.add(reg_btn);
/*c.add(jp); */
c.setSize(800,800);
}

  public void actionPerformed(ActionEvent ev){

  if(ev.getSource()==reg_btn){
new M1();
}   
  if(ev.getSource()==login_btn){
  String username=user_tf.getText();
  String password=pass_tf.getText();

   if(username.equals("mayur") && password.equals("123") ){
   c.setBackground(Color.green);
    JOptionPane.showMessageDialog(null,"Login Successfully!!");
    user_tf.setText(null);
    pass_tf.setText(null);
    
}
else{
      c.setBackground(Color.red);
      
         JOptionPane.showMessageDialog(null,"Wrong username or Password!!!");
    user_tf.setText(null);
    pass_tf.setText(null);
} 
}
}}