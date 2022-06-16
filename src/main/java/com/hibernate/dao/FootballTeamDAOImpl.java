package com.hibernate.dao;

import com.hibernate.entity.FootballLeague;
import com.hibernate.entity.FootballTeam;
import com.hibernate.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FootballTeamDAOImpl implements FootballTeamDAO {

    @Override
    public FootballTeam findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(FootballTeam.class, id);
    }

    @Override
    public void save(FootballTeam footballTeam) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер лиги");
        int id = scanner.nextInt();
        FootballLeague footballLeague = session.get(FootballLeague.class, id);
        footballTeam.setFootballLeague(footballLeague);
        footballLeague.addTeam(footballTeam);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Scanner scanner = new Scanner(System.in);
        FootballTeam footballTeam = session.get(FootballTeam.class, id);
        System.out.println("Введите название команды");
        String nameTeam = scanner.next();
        System.out.println("Введите количество очков");
        int glasses = scanner.nextInt();
        System.out.println("Введите стоимость клуба");
        double cost = scanner.nextDouble();
        System.out.println("Введите количество трофеев");
        int numberTrophies = scanner.nextInt();
        footballTeam.setCost(cost);
        footballTeam.setGlasses(glasses);
        footballTeam.setNameTeam(nameTeam);
        footballTeam.setNumberOfTrophies(numberTrophies);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        FootballTeam footballTeam = session.get(FootballTeam.class, id);
        session.delete(footballTeam);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Object[]> findFullInfo() {
        String sql = "From FootballTeam as team " +
                "join team.footballLeague";
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(sql).list();
    }

    @Override
    public List<Object[]> showStanding(int id) {
        String sql = "From FootballTeam as team " +
                "join team.footballLeague with team.footballLeague.id=" + id +
                "ORDER BY team.glasses DESC";
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(sql).list();
    }

    @Override
    public List<FootballTeam> findAll() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From FootballTeam").list();
    }

    @Override
    public List<FootballTeam> showTrophiesInDescendingOrder() {
        String sql = "From FootballTeam as team " +
                "ORDER BY team.numberOfTrophies DESC";
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(sql).list();
    }

    @Override
    public List<FootballTeam> showCostInDescendingOrder() {
        String sql = "From FootballTeam as team " +
                "ORDER BY team.cost DESC";
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(sql).list();
    }
}
