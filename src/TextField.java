import javax.swing.*;

public class TextField extends JFrame {
    public TextField() {
        JFrame f = new JFrame("Text Frame");

        JTextField t = new JTextField("Welcome to Javatpoint.");
        t.setBounds(50,50, 150,20);

        f.add(t);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
