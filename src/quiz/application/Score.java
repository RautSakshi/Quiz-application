
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame  implements ActionListener{
    

    Score(String name,int score){
         setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=il.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,350);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing Simple Mind");
        heading .setBounds(45,30,700,30);
        heading .setFont(new Font("Tahoma", Font.PLAIN,26));
        add( heading );
        
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore .setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN,26));
        add( lblscore);
          
        JButton Submit=new JButton("Play Again");
        Submit.setBounds(380,270,120,30);
        Submit.setBackground( new Color(30,144,255));
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        add(Submit);
        setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
      setVisible(false);
     new Login();
    }
    public static void main(String[] args){
        new Score("user",0);
    }
}
