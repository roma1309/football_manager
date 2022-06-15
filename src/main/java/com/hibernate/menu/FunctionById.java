package com.hibernate.menu;

import com.hibernate.services.FootballLeagueService;
import com.hibernate.services.FootballTeamService;

import java.util.Scanner;

public class FunctionById {
    public static void byId() {
        FootballLeagueService footballLeagueService = new FootballLeagueService();
        FootballTeamService footballTeamService = new FootballTeamService();
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());
        switch (number) {
            case (1):
                System.out.println("Введите номер:");
                int id1 = scan.nextInt();
                System.out.println(footballLeagueService.findById(id1));
                break;
            case (2):
                System.out.println("Введите индекс:");
                int id2 = scan.nextInt();
                System.out.println(footballTeamService.findById(id2));
                break;
        }
    }
}
