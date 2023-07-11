
package quiz.application;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

 
public  class Login extends JFrame implements ActionListener{
    
    JButton rules,back;
    JTextField  tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(il);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading =new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 40));
        heading.setForeground(new Color(30,144,245));
        add(heading);
        
         JLabel name =new JLabel("Enter your name");
         name.setBounds(810,150,300,20);
         name.setFont(new Font("Mongolian Baiti",Font.BOLD, 18));
         name.setForeground(new Color(30,144,245));
         add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD, 20));
        add(tfname);
        
        rules= new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back= new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
   
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
            
        }else if (e.getSource() == back){
        setVisible(false);
    }
    }
    
    public static void main(String[]args){
        new Login();
    
}
}