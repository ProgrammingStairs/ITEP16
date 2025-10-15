import java.sql.*;
public class JdbcExample6 {
    public static void main(String[] args) {
        try{
            Connection con = GetConnection2.getConnect();
            String query = "update student set address=? , per=? where rno=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "Indore MP");
            ps.setDouble(2, 95.95);
            ps.setInt(3, 1);
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

