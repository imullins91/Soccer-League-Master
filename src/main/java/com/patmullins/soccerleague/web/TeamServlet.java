
package com.patmullins.soccerleague.web;

import com.patmullins.soccerleague.domain.Team;
import com.patmullins.soccerleague.repository.TeamRepository;
import com.patmullins.soccerleague.repository.TeamRepositoryImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class TeamServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        TeamRepository repository = new TeamRepositoryImpl();

        Team teamEntry = new Team();
        teamEntry.setTeamName(request.getParameter("teamName"));
        teamEntry.setCompetitionLevel(request.getParameter("competitionLevel"));
        teamEntry.setTeamCountry(request.getParameter("teamCity"));

        request.setAttribute("teamEntry", teamEntry);

        repository.save(teamEntry);

        RequestDispatcher view = getServletContext().getRequestDispatcher("/teamIndex.jsp");
        view.forward(request, response);

    }


}
