
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.*;

public class Register extends JFrame implements ActionListener{
    JLabel lb1,lb2,lb3,lb4,lb5;
    JTextField txt1,txt2,txt4;
    JPasswordField txt3;
    JButton btn1;
    
    public Register() {
        setTitle("My Second Frame");
        setLayout(null);
        setSize(600,600);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font font = new Font("Candara", Font.BOLD, 28);
        
        lb1 = new JLabel("Swing | Register");
        lb1.setBounds(60, 50, 300, 40);
        lb1.setFont(font);
        add(lb1);

        lb2 = new JLabel("Enter Username");
        lb2.setBounds(60, 130, 200, 40);
        lb2.setFont(font);
        add(lb2);

        txt1 = new JTextField();
        txt1.setBounds(260, 130, 250, 40);
        txt1.setFont(font);
        add(txt1);

        lb3 = new JLabel("Enter Email");
        lb3.setBounds(60, 180, 200, 40);
        lb3.setFont(font);
        add(lb3);

        txt2 = new JTextField();
        txt2.setBounds(260, 180, 250, 40);
        txt2.setFont(font);
        add(txt2);
        
        lb4 = new JLabel("Enter Password");
        lb4.setBounds(60, 230, 200, 40);
        lb4.setFont(font);
        add(lb4);
        
        txt3 = new JPasswordField();
        txt3.setBounds(260, 230, 250, 40);
        txt3.setFont(font);
        add(txt3);
        
        lb5 = new JLabel("Enter Address");
        lb5.setBounds(60, 280, 200, 40);
        lb5.setFont(font);
        add(lb5);
        
        txt4 = new JTextField();
        txt4.setBounds(260, 280, 250, 40);
        txt4.setFont(font);
        add(txt4);
        
        btn1 = new JButton("Register");
        btn1.setBounds(60, 340, 450, 40);
        btn1.setFont(font);
        add(btn1);

        btn1.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
            try{
                Connection con =  GetConnection2.getConnect();
                String username = txt1.getText();
                String email = txt2.getText();
                String password = txt3.getText();
                String address = txt4.getText();
                String query = "insert into user(username,email,password,address) values(?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, username);
                ps.setString(2, email);
                ps.setString(3, password);
                ps.setString(4, address);
                int i = ps.executeUpdate();
                if(i>0){
                    dispose();
                    JOptionPane.showMessageDialog(new Register(), "Registration Successfull");
                    new Login();
                }else{
                    dispose();
                    JOptionPane.showMessageDialog(new Register(), "Registration Unsuccessfull");
                }
            }catch(Exception ex){
                System.out.println("Exception  : "+ex);
            }
        }
    }
}
