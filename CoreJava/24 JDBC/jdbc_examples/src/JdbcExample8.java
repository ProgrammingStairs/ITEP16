import java.sql.*;
public class JdbcExample8 {
    public static void main(String[] args) {
        try{
            Connection con = GetConnection2.getConnect();
            String query = "delete from student where rno=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 100);
            int i = ps.executeUpdate();
            if(i>0)
                    System.out.println("Data deleted successfully");
            else
                   System.out.println("Data not deleted");    
        }catch(SQLException e){
            System.out.println("Exception : "+e);
        }
    }
}

