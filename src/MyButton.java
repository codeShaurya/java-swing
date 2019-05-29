import java.awt.event.*;
import javax.swing.*;

public class MyButton extends JFrame {
    public MyButton() {
        JFrame f = new JFrame("Swing Frame");

        final JTextField tf = new JTextField();
        tf.setBounds(50,50, 150,20);

        JButton b = new JButton("Click Here");
        b.setBounds(50,100,95,30);

        JTextArea area = new JTextArea("Input will appear here");
        area.setBounds(50,200, 300,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                        String s = tf.getText();
                        area.setText(s);
            }
        });

        f.add(b);
        f.add(tf);
        f.add(area);
        f.setSize(900,600);
        f.setLayout(null);
        f.setVisible(true);

    }
}  