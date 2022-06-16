package com.hibernate.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "football_teams")
public class FootballTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_team")
    private String nameTeam;
    private int glasses;
    private double cost;
    @Column(name = "number_of_trophies")
    private int numberOfTrophies;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "league_id")
    private FootballLeague footballLeague;

    public FootballTeam() {
    }

    public FootballTeam(String nameTeam, int glasses, double cost, int numberOfTrophies) {
        this.nameTeam = nameTeam;
        this.glasses = glasses;
        this.cost = cost;
        this.numberOfTrophies = numberOfTrophies;
    }

    public int getGlasses() {
        return glasses;
    }

    public void setGlasses(int glasses) {
        this.glasses = glasses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberOfTrophies() {
        return numberOfTrophies;
    }

    public void setNumberOfTrophies(int numberOfTrophies) {
        this.numberOfTrophies = numberOfTrophies;
    }

    public FootballLeague getFootballLeague() {
        return footballLeague;
    }

    public void setFootballLeague(FootballLeague footballLeague) {
        this.footballLeague = footballLeague;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FootballTeam)) return false;
        FootballTeam that = (FootballTeam) o;
        return Objects.equals(getNameTeam(), that.getNameTeam());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameTeam());
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "id=" + id +
                ", nameTeam='" + nameTeam + '\'' +
                ", glasses=" + glasses +
                ", cost=" + cost +
                ", numberOfTrophies=" + numberOfTrophies +
                '}';
    }
}
