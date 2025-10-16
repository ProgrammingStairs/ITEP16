
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class SwingDemo4 extends JFrame implements ActionListener{
    JLabel lb1,lb2,lb3,lb4,lb5;
    JTextField txt1;
    JComboBox combo;
    JButton btn1;
    
    public SwingDemo4() {
        setTitle("My Second Frame");
        setLayout(null);
        setSize(600,600);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font font = new Font("Candara", Font.BOLD, 28);
        
        lb1 = new JLabel("First Example On Swing");
        lb1.setBounds(60, 50, 300, 40);
        lb1.setFont(font);
        add(lb1);

        lb2 = new JLabel("Enter Name");
        lb2.setBounds(60, 130, 200, 40);
        lb2.setFont(font);
        add(lb2);

        txt1 = new JTextField();
        txt1.setBounds(240, 130, 250, 40);
        txt1.setFont(font);
        add(txt1);

        lb3 = new JLabel("Select Subject");
        lb3.setBounds(60, 210, 200, 40);
        lb3.setFont(font);
        add(lb3);
        
        String subjects[] = {"C Programming","C++ Programming","C# Programming"};
        combo = new JComboBox(subjects);
        combo.setBounds(240, 210, 250, 40);
        combo.setFont(font);
        add(combo);

        btn1 = new JButton("Submit");
        btn1.setBounds(60, 290, 430, 40);
        btn1.setFont(font);
        add(btn1);

        lb4 = new JLabel();
        lb4.setBounds(60, 370, 500, 40);
        lb4.setFont(font);
        add(lb4);

        lb5 = new JLabel();
        lb5.setBounds(60, 450, 500, 40);
        lb5.setFont(font);
        add(lb5);

        btn1.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
            lb4.setText("Welcome "+txt1.getText());
            lb5.setText("Subject : "+combo.getSelectedItem());
        }
    }
    public static void main(String[] args) {
        new SwingDemo4();
    }
}
