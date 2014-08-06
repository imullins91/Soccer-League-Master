package com.patmullins.soccerleague.repository;

import com.patmullins.soccerleague.domain.Player;
import com.patmullins.soccerleague.repository.jdbc.JDBCTemplate;
import com.patmullins.soccerleague.repository.jdbc.SQLQueryWrapper;
import com.patmullins.soccerleague.repository.jdbc.SQLStatementWrapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayersRepositoryImpl implements PlayersRepository {

    JDBCTemplate jdbcTemplate;

    public PlayersRepositoryImpl() {
        jdbcTemplate = new JDBCTemplate();
    }

    public void save(Player player) {
        jdbcTemplate.execute(new SQLStatementWrapper() {
            public void execute(Statement statement) throws SQLException {
                statement.execute("insert into players (FirstName, LastName, Position, Country, Jersey) values ('foo')");
            }
        });
    }

    public List<Player> findAllPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from 'players'", new SQLQueryWrapper() {
            public void interpretResults(ResultSet resultSet) throws SQLException {
                Player player = new Player();

                players.add(player);
            }
        });

        return players;
    }
}
