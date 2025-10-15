import java.sql.*;
public class JdbcExample13 {
    public static void main(String[] args) {
        try{
            Connection con = GetConnection2.getConnect();
//            String query = "select orders.order_id,customers.cust_name from orders join customers on orders.cust_id = customers.cust_id";

//String query = "select o.order_id,c.cust_name from orders  o join customers c on o.cust_id = c.cust_id";

//String query = "select orders.order_id,customers.cust_name from orders inner join customers on orders.cust_id = customers.cust_id";
   
//String query = "select orders.order_id,customers.cust_name from orders left outer join customers on orders.cust_id = customers.cust_id";

String query = "select orders.order_id,customers.cust_name from orders right join customers on orders.cust_id = customers.cust_id";

PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
        }catch(SQLException e){
            System.out.println("Exception : "+e);
        }
    }
}

