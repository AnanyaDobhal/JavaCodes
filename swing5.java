import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class swing5 extends JFrame implements ActionListener{
    JTextField tf1,tf2;
    JTextArea ta;
    JRadioButton r1,r2;
    public swing5(){
        setLayout(new FlowLayout(FlowLayout.CENTER,30,40));
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        JLabel l1 = new JLabel("Name: ");
        JLabel l2 = new JLabel("Age: ");
        JLabel l3 = new JLabel("Cattegory: ");
        JLabel l4 = new JLabel("Message");
        r1 = new JRadioButton("male",true);
        r2 = new JRadioButton("female");
        ButtonGroup bg = new ButtonGroup();
        JButton b1 = new JButton("Vote");
        ta = new JTextArea(30,40);
        bg.add(r1);
        bg.add(r2);

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(r1);
        add(r2);
        add(b1);
        add(l4);
        add(ta);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String gender = (r1.isSelected())?"male":"female";
        String a = tf2.getText();
        int age = Integer.parseInt(a);
        if(age < 18 && gender.equals("male")){
            ta.setText("Sorry! mr." + tf1.getText() + " cannot vote");
        }
        else if(age < 18 && gender.equals("female")){
            ta.setText("Sorry! mrs." + tf1.getText() + " cannot vote");
        }
        else{
            ta.setText("You can vote!!!!!");
        }

    }
       public static void main(String args[])
    {
        swing5 obj = new swing5();
        obj.setSize(200,300);
        obj.setVisible(true);
    }  
}
