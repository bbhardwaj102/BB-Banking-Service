package bb.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
    public static Connection Connection() throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:atmmanagementsys.sqlite");
            Connection conn = DriverManager.getConnection("jdbc:sqlite::resource:Resources/db/bb.sqlite");
            //jdbc:sqlite::resource:
            return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
