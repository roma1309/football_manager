package com.hibernate.dao;

import com.hibernate.entity.FootballLeague;

import com.hibernate.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Scanner;

public class FootballLeagueDAOImpl implements FootballLeagueDAO {
    @Override
    public FootballLeague findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(FootballLeague.class, id);
    }

    @Override
    public void save(FootballLeague footballLeague) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(footballLeague);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Scanner scanner = new Scanner(System.in);
        FootballLeague footballLeague = session.get(FootballLeague.class, id);
        System.out.println("Введите страну");
        String country = scanner.nextLine();
        System.out.println("Введите название лиги");
        String nameLeague = scanner.nextLine();
        footballLeague.setCountry(country);
        footballLeague.setNameLeague(nameLeague);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        FootballLeague footballLeague = session.get(FootballLeague.class, id);
        session.delete(footballLeague);
        transaction.commit();
        session.close();
    }

    @Override
    public List<FootballLeague> findAll() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From FootballLeague").list();
    }
}
