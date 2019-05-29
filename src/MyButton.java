
import javax.swing.*;

public class MyButton extends JFrame {
    MyButton(){
        setSize(600,900);

        JButton b = new JButton("add text");
        b.setBounds(130,100,100, 40);

        add(b);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyButton();
    }
}  