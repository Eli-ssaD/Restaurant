
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static Connection conn;

    public DB(String connectionString) {
        try {
            DB.conn = DriverManager.getConnection(connectionString);
            Statement createTables = (Statement) DB.conn.createStatement();
            ((java.sql.Statement) createTables)
                    .execute("CREATE TABLE IF NOT EXISTS cafes(id INTEGER PRIMARY KEY, name TEXT);");

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }

  /*  public Connection getConn() {
        return DB.conn;
    }*/

    public static void close() {
        try {
            DB.conn.close();
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }
}
