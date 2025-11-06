
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class Home extends JFrame implements ActionListener {

    JLabel lb1;
    JButton btn1, btn2, btn3;

    public Home() {
        setTitle("My Second Frame");
        setLayout(null);
        setSize(600, 600);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Candara", Font.BOLD, 28);

        lb1 = new JLabel("Swing | Home");
        lb1.setBounds(60, 50, 300, 40);
        lb1.setFont(font);
        add(lb1);

        btn1 = new JButton("Home");
        btn1.setBounds(60, 130, 120, 40);
        btn1.setFont(font);
        add(btn1);

        btn2 = new JButton("Login");
        btn2.setBounds(200, 130, 120, 40);
        btn2.setFont(font);
        add(btn2);

        btn3 = new JButton("Register");
        btn3.setBounds(340, 130, 180, 40);
        btn3.setFont(font);
        add(btn3);

//        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn2) {
            dispose();
            //    JOptionPane.showMessageDialog(new Home(), "Login Button clicked");
            Login login = new Login();
            login.setVisible(true);
        }
        if (e.getSource() == btn3) {
            dispose();
// JOptionPane.showMessageDialog(new Home(), "Register Button clicked");
            Register register = new Register();
            register.setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Home();
    }
}
