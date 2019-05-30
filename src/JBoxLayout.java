import javax.swing.*;
import java.awt.*;

public class JBoxLayout {
    public JBoxLayout() {
        JFrame f=new JFrame();

        JButton b1=new JButton("NORTH");
        JButton b2=new JButton("SOUTH");
        JButton b3=new JButton("EAST");
        JButton b4=new JButton("WEST");
        JButton b5=new JButton("CENTER");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setSize(300,300);
        f.setVisible(true);
    }
}
