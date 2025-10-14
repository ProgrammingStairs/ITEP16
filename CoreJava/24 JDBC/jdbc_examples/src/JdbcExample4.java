import java.sql.*;
import java.util.Scanner;
public class JdbcExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter email: ");
        String email = sc.next();
        sc.nextLine();
        System.out.println("Enter address : ");
        String address = sc.nextLine();
        System.out.println("Enter percentage : ");
        double per = sc.nextDouble();
        
        try{
            Connection con = GetConnection1.getConnect();
            String query = "insert into student(name,email,address,per) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setDouble(4, per);
            int i = ps.executeUpdate();
            if(i>0)
                    System.out.println("Data inserted successfully");
            else
                    System.out.println("Data not inserted");
        }catch(SQLException e){
            System.out.println("Exception : "+e);
        }
    }
}

