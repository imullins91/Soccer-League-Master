package com.patmullins.soccerleague.repository.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public interface SQLStatementWrapper {

    public void execute(Statement statement) throws SQLException;

}
