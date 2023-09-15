package model;

import java.sql.*;

public class PostgresDatabase extends Database {
    public PostgresDatabase(String connectionString, String login, String password) throws SQLException {
        this.connection = DriverManager.getConnection(connectionString, login, password);
        super.setDatabase(this);
    }
}
