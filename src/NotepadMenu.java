import javax.swing.*;
import java.awt.event.*;

public class NotepadMenu {
    NotepadMenu(){
        JFrame f = new JFrame("javascript.js");
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        JMenuItem cut = new JMenuItem("cut");
        JMenuItem copy = new JMenuItem("copy");
        JMenuItem paste = new JMenuItem("paste");
        JMenuItem selectAll = new JMenuItem("selectAll");

        JTextArea ta = new JTextArea("Javascript is love");
        ta.setBounds(5,5,360,320);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        cut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                ta.cut();
            }
        });

        copy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                ta.copy();
            }
        });

        paste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                ta.paste();
            }
        });

        selectAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                ta.selectAll();
            }
        });

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        f.add(mb);
        f.add(ta);

        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
}
