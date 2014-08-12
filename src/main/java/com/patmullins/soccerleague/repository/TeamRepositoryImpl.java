package com.patmullins.soccerleague.repository;

import com.patmullins.soccerleague.domain.Player;
import com.patmullins.soccerleague.domain.Team;
import com.patmullins.soccerleague.repository.jdbc.JDBCTemplate;
import com.patmullins.soccerleague.repository.jdbc.SQLQueryWrapper;
import com.patmullins.soccerleague.repository.jdbc.SQLStatementWrapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeamRepositoryImpl implements TeamRepository {

    JDBCTemplate jdbcTemplate;

    public TeamRepositoryImpl() {
        jdbcTemplate = new JDBCTemplate();
    }

    public void save(final Team team) {
        jdbcTemplate.execute(new SQLStatementWrapper() {
            public void execute(Statement statement) throws SQLException {


                statement.execute("insert into Teams (teamName, competitionLevel, teamCity) values ('"+ team.getTeamName() + "', '"+ team.getCompetitionLevel() + "','"+ team.getTeamCity() + "')");
            }
        });
    }

    public List<Team> findAllTeams() {
        final ArrayList<Team> Teams = new ArrayList<Team>();
        jdbcTemplate.query("select * from 'Teams'", new SQLQueryWrapper() {
            public void interpretResults(ResultSet resultSet) throws SQLException {
                Team team = new Team();

                Teams.add(team);
            }
        });

        return Teams;
    }
}
