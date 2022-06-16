package com.hibernate;

import com.hibernate.menu.*;
import com.hibernate.utils.HibernateSessionFactoryUtil;

import java.util.Scanner;

public class HibernateExample {
    public static void main(String[] args) {

        int number = 0;
        boolean continueLoop = true;

        Scanner scan = new Scanner(System.in);

        while (continueLoop) {
            MenuWorker.showMenu();

            number = scan.nextInt();

            switch (number) {
                case (1):
                    MenuWorker.menu1();
                    FunctionOutput.output();
                    break;
                case (2):
                    MenuWorker.menu2();
                    FunctionById.byId();
                    break;
                case (3):
                    MenuWorker.menu3();
                    FunctionAdd.add();
                    break;
                case (4):
                    MenuWorker.menu4();
                    FunctionDelete.delete();
                    break;
                case (5):
                    MenuWorker.menu5();
                    FunctionUpdate.update();
                    break;
                case (0):
                    MenuWorker.menu0();
                    continueLoop = false;
                    HibernateSessionFactoryUtil.getSessionFactory().close();
                    break;
                case (6):
                    MenuWorker.menu6();
                    FunctionOutput.outputOther();
                    break;
                default:
                    System.out.println("Вы ввели неверную команду !");
                    break;
            }
        }
    }
}