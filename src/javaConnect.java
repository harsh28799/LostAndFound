
import java.sql.*;
import javax.swing.*;

public class javaConnect{
    
    static Connection conn;
    
    public static Connection connectDb(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LostAndFound","harsh");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;            
        }
    }
}