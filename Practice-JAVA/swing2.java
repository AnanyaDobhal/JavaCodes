import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class swing2 extends JFrame implements ActionListener {
    JTextField tf1,tf2,tf3;
    public swing2(){
        JLabel j1 = new JLabel("Name1: ");
        setLayout(new FlowLayout(FlowLayout.CENTER,30,10));
        add(j1);

        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);
        add(tf1);

        JLabel j2 = new JLabel("Name2: ");
        add(j2);

        add(tf2);

        JButton b1 = new JButton("Concate");

        JLabel j3 = new JLabel("result: ");
        add(j3);

        add(tf3);
        add(b1);

        b1.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){
        tf3.setText(String.valueOf(Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText())));
    }
    public static void main(String args[])
    {
        swing2 obj = new swing2();
        obj.setSize(200,300);

        obj.setVisible(true);
    }
    
}
