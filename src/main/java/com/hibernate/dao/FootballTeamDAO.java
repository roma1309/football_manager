package com.hibernate.dao;

import com.hibernate.entity.FootballTeam;

import java.util.List;

public interface FootballTeamDAO {

    public FootballTeam findById(int id);

    public void save(FootballTeam footballTeam);

    public void update(int id);

    public void delete(int id);

    public List<Object[]> findFullInfo();

    public List<Object[]> showStanding(int id);

    public List<FootballTeam> findAll();
}
