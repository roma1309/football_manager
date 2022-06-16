package com.hibernate.services;

import com.hibernate.dao.FootballTeamDAOImpl;
import com.hibernate.entity.FootballTeam;

import java.util.List;

public class FootballTeamService {
    FootballTeamDAOImpl footballTeamDAO = new FootballTeamDAOImpl();

    public FootballTeamService() {
    }

    public FootballTeam findById(int id) {
        return footballTeamDAO.findById(id);
    }

    public void save(FootballTeam footballTeam) {
        footballTeamDAO.save(footballTeam);
    }

    public void update(int id) {
        footballTeamDAO.update(id);
    }

    public void delete(int id) {
        footballTeamDAO.delete(id);
    }

    public List<Object[]> findFullInfo() {
        return footballTeamDAO.findFullInfo();
    }

    public List<FootballTeam> findAll() {
        return footballTeamDAO.findAll();
    }

    public List<Object[]> showStanding(int id) {
        return footballTeamDAO.showStanding(id);
    }

    public List<FootballTeam> showTrophiesInDescendingOrder() {
        return footballTeamDAO.showTrophiesInDescendingOrder();
    }

    public List<FootballTeam> showCostInDescendingOrder() {
        return footballTeamDAO.showCostInDescendingOrder();
    }
}
