
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.* ;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Connect_to_DB {
    
    private static String servername = "localhost";
    private static String dbname = "ferbyuusubdmngr";
    private static String username = "root";
    private static Integer portnumber = 3306;
    private static String password = ""; // no password
    
    
    //function to get the connectoin
    public static Connection getTheConnection()
    {
        Connection connection = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        try {
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Connect_to_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
    
}



