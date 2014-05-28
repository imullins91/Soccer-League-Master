package com.patmullins.soccerleague;

public class Player {
    String name;
    String position;
    int jersey;

    public void setName (String value)
    {
        name = value;
    }

    public void setPosition (String value)
    {
        position = value;
    }

    public void setJersey (int value)
    {
        jersey = value;
    }

    public String getName() { return name;}
    public String getPosition() { return position;}
    public int getJersey() { return jersey;}
}

