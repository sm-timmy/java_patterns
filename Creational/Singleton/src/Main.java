import model.Database;
import model.PostgresDatabase;
import model.UserRepository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        Database pgDb = new PostgresDatabase("jdbc:postgresql://localhost:5432/", "postgres", "postgres");
        ResultSet users = pgDb.executeQuery("select * from users");
        Database.printResult(users);

        UserRepository.getUsers();
    }
}