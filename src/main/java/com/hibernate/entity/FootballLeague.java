package com.hibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "football_leagues")
public class FootballLeague {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String country;
    private String nameLeague;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "footballLeague", cascade = CascadeType.ALL)
    private Set<FootballTeam> footballTeams = new HashSet<>();

    public FootballLeague() {
    }

    public FootballLeague(String country, String nameLeague) {
        this.country = country;
        this.nameLeague = nameLeague;
    }

    public void addTeam(FootballTeam footballTeam) {
        footballTeams.add(footballTeam);
    }

    public void deleteTeam(FootballTeam footballTeam) {
        footballTeams.remove(footballTeam);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNameLeague() {
        return nameLeague;
    }

    public void setNameLeague(String nameLeague) {
        this.nameLeague = nameLeague;
    }

    public Set<FootballTeam> getFootballTeams() {
        return footballTeams;
    }

    public void setFootballTeams(Set<FootballTeam> footballTeams) {
        this.footballTeams = footballTeams;
    }

    @Override
    public String toString() {
        return "FootballLeague{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", nameLeague='" + nameLeague + '\'' +
                '}';
    }
}
