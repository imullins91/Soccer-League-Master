package com.patmullins.soccerleague.domain;

public class Team {

        private String teamName;
        private String competitionLevel;
        private String teamCity;

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public String getTeamCity() {
            return teamCity;
        }

        public void setTeamCountry(String teamCity) {
            this.teamCity = teamCity;
        }

        public String getCompetitionLevel() {
            return competitionLevel;
        }

        public void setCompetitionLevel(String competitionLevel) {
            this.competitionLevel = competitionLevel;
        }

}
