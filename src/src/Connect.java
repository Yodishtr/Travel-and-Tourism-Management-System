import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Class for connecting to the database.
 */

public class Connect{

    private static Connection conn;
    private static final String url = "jdbc:postgresql://localhost:5432/travel";
    private static final String user = "yodishtrvythilingum";
    private static final String password = "";
    Statement s;
    public Connect(){
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to psql database!");

            s = conn.createStatement();



        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
