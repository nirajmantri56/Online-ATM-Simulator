package bank.management.system;
import java.sql.*;

public class Connection3 {
    
//    Steps --> 
//    1.Register the Driver
//    2. Create Connection
//    3. Create Statement
//    4. Execute Query
//    5. Close Connection
    
    Connection c;
    Statement s;
    public Connection3() {
        // mysql is an external entity bcoz of which we use try catch to neglect the runtime error.
        try{
//            Class.forName(com.mysql.cj.jdbc.Driver); //Name of class --> Class. 
//          static method which is in class name 'Class' --> forName.
//          name of driver --> (com.mysql.cj.jdbc.Driver.
            
//          Creating connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "nirajmantrind");
            s = c.createStatement();
        } catch(Exception e){
            System.out.println(e);
        }
        
    }
}
