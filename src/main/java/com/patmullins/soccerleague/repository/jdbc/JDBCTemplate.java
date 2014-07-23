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

    public void query(final String sql, final SQLQueryWrapper wrapper) {
        talkToDatabase(new DoInTransaction() {
            public ResultSet execute(Statement statement) throws SQLException {
                ResultSet resultSet = statement.executeQuery(sql);
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

    private Connection getDBConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/soccerleaguedb", "player", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    interface DoInTransaction {
        ResultSet execute(Statement statement) throws SQLException;
    }
}
