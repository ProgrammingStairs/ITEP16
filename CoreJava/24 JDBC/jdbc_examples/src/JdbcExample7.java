import java.sql.*;
public class JdbcExample7 {
    public static void main(String[] args) {
        try{
            Connection con = GetConnection2.getConnect();
            String query = "update student set rno=? where rno=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 100);
            ps.setInt(2, 1);
            int i = ps.executeUpdate();
            if(i>0)
                    System.out.println("Data updated successfully");
            else
                   System.out.println("Data not updated");    
        }catch(SQLException e){
            System.out.println("Exception : "+e);
        }
    }
}

