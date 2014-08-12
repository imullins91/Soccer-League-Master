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

    public void save(final Player player) {
        jdbcTemplate.execute(new SQLStatementWrapper() {
            public void execute(Statement statement) throws SQLException {


                statement.execute("insert into Players (firstName, lastName, playerPosition , country, jersey) values ('"+ player.getFirstName() + "', '"+ player.getLastName() + "','"+ player.getPosition() + "','"+ player.getCountry() + "', '"+ player.getJersey() + "')");
            }
        });
    }

    public List<Player> findAllPlayers() {
        final ArrayList<Player> Players = new ArrayList<Player>();
        jdbcTemplate.query("select * from 'Players'", new SQLQueryWrapper() {
            public void interpretResults(ResultSet resultSet) throws SQLException {
                Player player = new Player();

                Players.add(player);
            }
        });

        return Players;
    }
}
