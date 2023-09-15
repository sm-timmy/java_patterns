package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

abstract public class UserRepository {
    public static void getUsers() throws Exception {
        Database db = Database.getDatabase();
        var users = db.executeQuery("select * from users");
        Database.printResult(users);
    }
}
