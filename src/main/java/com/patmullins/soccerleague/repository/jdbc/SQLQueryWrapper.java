package com.patmullins.soccerleague.repository.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface SQLQueryWrapper {

    public void interpretResults(ResultSet resultSet) throws SQLException;

}
