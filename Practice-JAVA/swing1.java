import javax.swing.*;
import java.awt.*;
class swing1 extends JFrame{
    public swing1()
    {
        JLabel l1 = new JLabel("Enter your name:");
        setLayout(new GridLayout(3,4)); //if we remove this then last thing which is added that will be visible
        add(l1);

        JTextField tf1 = new JTextField(20);
        add(tf1);

        JTextArea ta = new JTextArea(30,30);
        add(ta);

        JTextArea ta1 = new JTextArea(30,30);
        JScrollPane jp1 = new JScrollPane(ta1);
        add(jp1);

        String s[] = {"China" ,"India","USA","UK"};
        JComboBox cb = new JComboBox(s);
        add(cb);

        JCheckBox cb1 = new JCheckBox();
        JCheckBox cb2 = new JCheckBox("SCE");
        JCheckBox cb3 = new JCheckBox("ECE",true);
        add(cb1);
        add(cb2);
        add(cb3);

        JButton b1 = new JButton("Submit");
        add(b1);

        JRadioButton r1 = new JRadioButton();
        JRadioButton r2 = new JRadioButton("CSE");
        JRadioButton r3 = new JRadioButton("ECE",true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        add(r1);
        add(r2);
        add(r3);

        DefaultListModel<String>d1 = new DefaultListModel<>();
        d1.addElement("Item1");
        d1.addElement("Item2");
        d1.addElement("Item3");
        d1.addElement("Item4");
        JList<String> list = new JList<>(d1);
        add(list);
    }
    public static void main(String[] args) {
        swing1 frame = new swing1();
        frame.setSize(300,400);
        frame.setVisible(true);
    }
}
