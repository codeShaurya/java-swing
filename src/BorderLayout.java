import javax.swing.*;
import java.awt.BorderLayout.*;

public class BorderLayout {
    public BorderLayout() {
        JFrame f=new JFrame();

        JButton b1=new JButton("NORTH");
        JButton b2=new JButton("SOUTH");
        JButton b3=new JButton("EAST");
        JButton b4=new JButton("WEST");
        JButton b5=new JButton("CENTER");

        f.add(b1, java.awt.BorderLayout.NORTH);
        f.add(b2, java.awt.BorderLayout.SOUTH);
        f.add(b3, java.awt.BorderLayout.EAST);
        f.add(b4, java.awt.BorderLayout.WEST);
        f.add(b5, java.awt.BorderLayout.CENTER);

        f.setSize(300,300);
        f.setVisible(true);
    }
}
