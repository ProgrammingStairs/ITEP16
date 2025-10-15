import java.sql.*;
public class JdbcExample11 {
    public static void main(String[] args) {
        try{
            Connection con = GetConnection2.getConnect();
            String query = "select * from student";
            PreparedStatement ps = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(rs.getInt(1)==3){
                    rs.updateDouble(5, 55.55);
                    rs.updateString(2, "Andy");
                    rs.updateRow();
                }
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDouble(5));
            }
        }catch(SQLException e){
            System.out.println("Exception : "+e);
        }
    }
}

