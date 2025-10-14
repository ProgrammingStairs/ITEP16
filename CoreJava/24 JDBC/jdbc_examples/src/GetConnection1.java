import java.sql.*;
public class GetConnection1 {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/ite16";
    public static final String USER =  "root";
    public static final String PASS = "root";    
    public static Connection getConnect() {
        Connection con = null;
        try{
            Class.forName(DRIVER);
            con =  DriverManager.getConnection(URL,USER,PASS);
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
