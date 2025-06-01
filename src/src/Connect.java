/**
 * Class for connecting to the database.
 */

public class Connect {

    public Connect(){
        try{
            Class.forName("com.postgresql.jdbc.Driver");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
