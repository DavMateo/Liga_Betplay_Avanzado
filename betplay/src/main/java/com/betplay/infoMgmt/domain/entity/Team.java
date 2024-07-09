package com.betplay.infoMgmt.domain.entity;

public class Team {
    private Long id;
    private String name;
    private String city;
    private String stadium;
    private String coach;
    private String players;
    private String matches;
    public Team() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStadium() {
        return stadium;
    }
    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
    public String getCoach() {
        return coach;
    }
    public void setCoach(String coach) {
        this.coach = coach;
    }
    public String getPlayers() {
        return players;
    }
    public void setPlayers(String players) {
        this.players = players;
    }
    public String getMatches() {
        return matches;
    }
    public void setMatches(String matches) {
        this.matches = matches;
    }

    
}
