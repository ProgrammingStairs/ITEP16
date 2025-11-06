
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JLabel lb1,lb2,lb3;
    JTextField txt1;
    JPasswordField txt2;
    JButton btn1;
    
    public Login() {
        setTitle("My Second Frame");
        setLayout(null);
        setSize(600,600);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font font = new Font("Candara", Font.BOLD, 28);
        
        lb1 = new JLabel("Swing | Login");
        lb1.setBounds(60, 50, 300, 40);
        lb1.setFont(font);
        add(lb1);

        lb2 = new JLabel("Enter Email");
        lb2.setBounds(60, 130, 200, 40);
        lb2.setFont(font);
        add(lb2);

        txt1 = new JTextField();
        txt1.setBounds(260, 130, 250, 40);
        txt1.setFont(font);
        add(txt1);

        lb3 = new JLabel("Enter Password");
        lb3.setBounds(60, 210, 200, 40);
        lb3.setFont(font);
        add(lb3);
        
        txt2 = new JPasswordField();
        txt2.setBounds(260, 210, 250, 40);
        txt2.setFont(font);
        add(txt2);

        btn1 = new JButton("Login");
        btn1.setBounds(60, 290, 430, 40);
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
                String email = txt1.getText();
                char ch[] = txt2.getPassword();
                String password = new String(ch);
                String query = "select * from user where email = ? and password = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, email);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    dispose();
                    JOptionPane.showMessageDialog(new Login(), "Login Successfull");
                    new Profile();
                }else{
                    dispose();
                    JOptionPane.showMessageDialog(new Login(), "Login Unsuccessfull");
                }
            }catch(Exception ex){
                System.out.println("Exception  : "+ex);
            }

        }
    }
}
