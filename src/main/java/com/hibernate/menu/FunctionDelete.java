package com.hibernate.menu;

import com.hibernate.services.FootballLeagueService;
import com.hibernate.services.FootballTeamService;


import java.util.Scanner;

public class FunctionDelete {
    public static void delete() {
        FootballLeagueService footballLeagueService = new FootballLeagueService();
        FootballTeamService footballTeamService = new FootballTeamService();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        switch (number) {
            case (1):
                System.out.println("Введите индекс ");
                int id1 = scan.nextInt();
                footballLeagueService.delete(id1);
                break;
            case (2):
                System.out.println("Введите индекс ");
                int id2 = scan.nextInt();
                footballTeamService.delete(id2);
                break;
        }
    }
}
