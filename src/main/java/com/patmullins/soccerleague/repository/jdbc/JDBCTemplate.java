package com.patmullins.soccerleague.repository.jdbc;

import java.sql.*;

public class JDBCTemplate {

    public void execute(final SQLStatementWrapper wrapper) {
        talkToDatabase(new DoInTransaction() {
            public ResultSet execute(Statement statement) throws SQLException {
                wrapper.execute(statement);
                return null;
            }
        });
    }

    private Connection getDBConnection() {
        try {
            Class.forName("org.postgresql.Driver");
//            Driver for different machines
            return DriverManager.getConnection("jdbc:postgresql://localhost:8888/Players", "postgres", "arsenal");
//            return DriverManager.getConnection("jdbc:postgresql://localhost:3693/Players", "postgres", "arsenal");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void query(final String sql, final SQLQueryWrapper wrapper) {
        talkToDatabase(new DoInTransaction() {
            public ResultSet execute(Statement statement) throws SQLException {

                ResultSet resultSet = statement.executeQuery(sql);
                while(resultSet.next()){
                String firstName  = resultSet.getString("firstName");
                String lastName  = resultSet.getString("lastName");
                String position = resultSet.getString("playerPosition");
                String country = resultSet.getString("country");
                int jersey = resultSet.getInt("jersey");

                }

                wrapper.interpretResults(resultSet);
                return resultSet;
            }
        });
    }

    private void talkToDatabase(DoInTransaction inTransaction) {
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            resultSet = inTransaction.execute(statement);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null) {
                try { resultSet.close(); } catch (SQLException e) { }
            }
            if (statement != null) {
                try { statement.close(); } catch (SQLException e) { }
            }
            if (dbConnection != null) {
                try { dbConnection.close(); } catch (SQLException e) { }
            }
        }
    }

    interface DoInTransaction {
        ResultSet execute(Statement statement) throws SQLException;
    }
}
