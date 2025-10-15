import java.sql.*;
public class JdbcExample9 {
    public static void main(String[] args) {
        try{
            Connection con = GetConnection2.getConnect();
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("DatabaseProductName : "+dbmd.getDatabaseProductName());
         System.out.println("DatabaseProductVersion : "+dbmd.getDatabaseProductVersion());
            System.out.println("DriverName : "+dbmd.getDriverName());
            System.out.println("DriverVersion : "+dbmd.getDriverVersion());
            
            String query = "select * from student";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("\nColumnName : "+rsmd.getColumnName(2));
            System.out.println("ColumnTypeName : "+rsmd.getColumnTypeName(2));
            System.out.println("ColumnCount : "+rsmd.getColumnCount());
            
        }catch(SQLException e){
            System.out.println("Exception : "+e);
        }
    }
}

