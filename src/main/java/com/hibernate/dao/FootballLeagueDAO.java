package com.hibernate.dao;

import com.hibernate.entity.FootballLeague;


import java.util.List;

public interface FootballLeagueDAO {

    public FootballLeague findById(int id);

    public void save(FootballLeague footballLeague);

    public void update(int id);

    public void delete(int id);

    public List<FootballLeague> findAll();
}
