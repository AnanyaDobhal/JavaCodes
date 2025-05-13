import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class swing3 extends JFrame implements ActionListener {
    JTextField tf1, tf2;
    JButton b1, b2, b3;

    public swing3() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);
        JLabel l1 = new JLabel("String:");
        add(l1);
        add(tf1);

        JLabel l2 = new JLabel("Result:");
        add(l2);
        add(tf2);

        b1 = new JButton("CountVowel");
        b2 = new JButton("Reset");
        b3 = new JButton("Exit");
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if (s.equals("CountVowel")) {
            String input = tf1.getText();
            int count = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = Character.toLowerCase(input.charAt(i));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
        }
        else if(s.equals("Reset")){
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
        else if(s.equals("Exit")){
            System.exit(0);
        }
        
    }
public static void main(String args[])
    {
        swing3 obj = new swing3();
        obj.setSize(200,300);

        obj.setVisible(true);
    }
}
