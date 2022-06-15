package com.hibernate.menu;

import com.hibernate.services.FootballLeagueService;
import com.hibernate.services.FootballTeamService;

import java.util.Scanner;

public class FunctionUpdate {

    public static void update() {
        Scanner scan = new Scanner(System.in);
        FootballLeagueService footballLeagueService = new FootballLeagueService();
        FootballTeamService footballTeamService = new FootballTeamService();
        int number = scan.nextInt();
        switch (number) {
            case (1):
                System.out.println("Введиде индекс: ");
                int id1 = scan.nextInt();
                footballLeagueService.update(id1);
                break;
            case (2):
                System.out.println("Введиде индекс: ");
                int id2 = scan.nextInt();
                footballTeamService.update(id2);
        }
    }
}