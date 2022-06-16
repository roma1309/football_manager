package com.hibernate.menu;

import com.hibernate.entity.FootballLeague;
import com.hibernate.entity.FootballTeam;
import com.hibernate.services.FootballLeagueService;
import com.hibernate.services.FootballTeamService;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionOutput {
    public static void output() {

        FootballLeagueService footballLeagueService = new FootballLeagueService();
        FootballTeamService footballTeamService = new FootballTeamService();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number) {
            case (1):
                List<FootballLeague> result1 = footballLeagueService.findAll();
                for (FootballLeague league : result1) {
                    System.out.println(league);
                }
                break;
            case (2):
                List<FootballTeam> result2 = footballTeamService.findAll();
                for (FootballTeam footballTeam : result2) {
                    System.out.println(footballTeam);
                }
                break;
            case (4):
                List<Object[]> objects = footballTeamService.findFullInfo();
                for (Object[] objs : objects) {
                    for (Object obj : objs) {
                        System.out.print(obj + "\t");
                    }
                    System.out.println();
                }
                break;
            case (5):
                System.out.println("Введите номер турнира");
                int id = scan.nextInt();
                List<Object[]> list = footballTeamService.showStanding(id);
                List<FootballTeam> footballTeams = new ArrayList<>();
                FootballLeague footballLeague = new FootballLeague();
                for (Object[] objs : list) {
                    for (Object obj : objs) {
                        if (obj instanceof FootballTeam) {
                            footballTeams.add((FootballTeam) obj);
                        } else {
                            footballLeague = (FootballLeague) obj;
                        }
                    }
                }
                System.out.println("Страна - " + footballLeague.getCountry() + " Название лиги - " + footballLeague.getNameLeague());
                int i = 0;
                for (FootballTeam team : footballTeams) {
                    i++;
                    System.out.println(i + ". " + team.getNameTeam() + " - " + team.getGlasses());
                }
                break;
        }
    }

    public static void outputOther() {
        FootballTeamService footballTeamService = new FootballTeamService();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number) {
            case (1):
                List<FootballTeam> result1 = footballTeamService.showTrophiesInDescendingOrder();
                for (FootballTeam footballTeam : result1) {
                    System.out.println(footballTeam);
                }
                break;
            case (2):
                List<FootballTeam> result2 = footballTeamService.showCostInDescendingOrder();
                for (FootballTeam footballTeam : result2) {
                    System.out.println(footballTeam);
                }
                break;
        }
    }
}