import java.sql.*;
public class GetConnection2 {
    public static Connection getConnect() {
        Connection con = null;
        try{
            Class.forName(GetDetails.DRIVER);
            con =  DriverManager.getConnection(GetDetails.URL,GetDetails.USER,GetDetails.PASS);
            if(con!=null)
                    System.out.println("Connection established successfully");
            else
                    System.out.println("Error occured while establishing connection");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Exception : "+e);
        }
        return con;
    }
}
