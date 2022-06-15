package com.hibernate.menu;

import com.hibernate.entity.FootballLeague;
import com.hibernate.entity.FootballTeam;
import com.hibernate.services.FootballLeagueService;
import com.hibernate.services.FootballTeamService;

import java.util.Scanner;

public class FunctionAdd {

    public static void add() {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());
        FootballLeagueService footballLeagueService = new FootballLeagueService();
        FootballTeamService footballTeamService = new FootballTeamService();

        switch (number) {
            case 1:
                System.out.print("Введите страну: ");
                String country = String.valueOf(scan.nextLine());
                System.out.println("Введите название лиги: ");
                String nameLeague = scan.nextLine();
                FootballLeague footballLeague = new FootballLeague(country, nameLeague);
                footballLeagueService.save(footballLeague);
                break;
            case 2:
                System.out.println("Введите название команды");
                String nameTeam = String.valueOf(scan.nextLine());
                System.out.println("Введите количество очков");
                int glasses = scan.nextInt();
                System.out.println("Введите стоимость клуба");
                double cost = scan.nextDouble();
                System.out.println("Введите количество трофеев");
                int numberTrophies = scan.nextInt();
                FootballTeam footballTeam = new FootballTeam(nameTeam, glasses, cost, numberTrophies);
                footballTeamService.save(footballTeam);
                break;
        }
    }
}
