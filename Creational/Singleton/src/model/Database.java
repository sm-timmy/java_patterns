package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

abstract public class Database {
    private static Database database;
    protected Connection connection;
    public static Database getDatabase() throws Exception {
        if (database == null) {
            throw new Exception("Error! Not created db connection");
        }
        return database;
    }

    public ResultSet executeQuery(String query) throws Exception {
        return connection.createStatement().executeQuery(query);
    }

    void setDatabase(Database database) {
        Database.database = database;
    }

    public static void printResult(ResultSet resultSet) throws SQLException {
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int columnCount = resultSetMetaData.getColumnCount();
        while(resultSet.next()){
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(resultSet.getString(i)+" ");
            }
            System.out.println();
        }
    }
}
