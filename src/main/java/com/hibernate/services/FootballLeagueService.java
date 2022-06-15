package com.hibernate.services;

import com.hibernate.dao.FootballLeagueDAOImpl;
import com.hibernate.entity.FootballLeague;

import java.util.List;

public class FootballLeagueService {
    private FootballLeagueDAOImpl footballLeagueDAO = new FootballLeagueDAOImpl();

    public FootballLeagueService() {
    }

    public FootballLeague findById(int id) {
        return footballLeagueDAO.findById(id);
    }

    public void save(FootballLeague footballLeague) {
        footballLeagueDAO.save(footballLeague);
    }

    public void update(int id) {
        footballLeagueDAO.update(id);
    }

    public void delete(int id) {
        footballLeagueDAO.delete(id);
    }

    public List<FootballLeague> findAll() {
        return footballLeagueDAO.findAll();
    }
}
