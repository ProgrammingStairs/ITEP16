
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample3 {
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/ite16";
    public static final String USER =  "root";
    public static final String PASS = "root";
    
    public static void main(String[] args) {
        try{
            Class.forName(DRIVER);
            Connection con =  DriverManager.getConnection(URL,USER,PASS);
            if(con!=null)
                    System.out.println("Connection established successfully");
            else
                    System.out.println("Error occured while establishing connection");
           
            String query = "create table  if not exists student(rno int primary key auto_increment,name varchar(45) not null, email varchar(45) not null, address varchar(45) not null, per double default 0)";
            
            Statement st =  con.createStatement();
            st.execute(query);
            System.out.println("Table  created successfully");
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Exception : "+e);
        }
    }
}
