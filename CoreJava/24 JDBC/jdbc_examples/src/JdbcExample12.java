import java.sql.*;
public class JdbcExample12 {
    public static void main(String[] args) {
        try{
            Connection con = GetConnection2.getConnect();
            String query = "select * from student";
            PreparedStatement ps = con.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery();
//            rs.absolute(2);
//rs.first();
//rs.beforeFirst();
//rs.last();
rs.afterLast();
            while(rs.previous()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDouble(5));
            }
        }catch(SQLException e){
            System.out.println("Exception : "+e);
        }
    }
}

