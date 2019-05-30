import javax.swing.*;
import java.awt.event.*;

public class Label extends JFrame {
    Label(){
        JTextField tf = new JTextField();
        tf.setBounds(50,50, 150,20);
        add(tf);

        JLabel l = new JLabel();
        l.setBounds(50,100, 250,20);
        add(l);

        JButton b = new JButton("Find IP");
        b.setBounds(50,150,95,30);

        b.addActionListener(new ActionListener(){
           public  void  actionPerformed(ActionEvent e) {
                        String host = tf.getText();
                        String ip = "172.16.4.16";
                        l.setText("IP of "+host+" is: "+ip);
           }
        });
        add(b);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
}
