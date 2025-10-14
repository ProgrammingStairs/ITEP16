import java.sql.*;
public class JdbcExample5 {
    public static void main(String[] args) {
        try{
            Connection con = GetConnection2.getConnect();
            String query = "select * from student";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDouble(5));
            }
        }catch(SQLException e){
            System.out.println("Exception : "+e);
        }
    }
}

