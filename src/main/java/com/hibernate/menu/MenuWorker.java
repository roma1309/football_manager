package com.hibernate.menu;

public class MenuWorker {
    public static void showMenu() {

        System.out.println("Выбор действия:");
        System.out.println("1. Показать всех");
        System.out.println("2. Показать по ID");
        System.out.println("3. Добавить");
        System.out.println("4. Удалить");
        System.out.println("5. Обновить");
        System.out.println("6. Другое");
        System.out.println("0. Выход");
        System.out.println("-------------");
        System.out.println("-------------");
    }

    public static void menu1() {

        System.out.println("1. Вывести таблицу Football_League");
        System.out.println("2. Вывести таблицу Football_Teams");
        System.out.println("3. Вывести  таблицу Subjects");
        System.out.println("4. Вывести общую таблицу.");
        System.out.println("5. Просмотреть турнирную таблицу чемпионата");
    }

    public static void menu3() {
        System.out.println("1. Добавить элемент в таблицу Football_League");
        System.out.println("2. Добавить элемент в таблицу Football_Teams");
        System.out.println("3. Добавить элемент в таблицу Subjects");
    }

    public static void menu4() {
        System.out.println("1.  Удалить элемент в таблице Football_League");
        System.out.println("2.  Удалить элемент в таблице Football_Teams");
        System.out.println("3.  Удалить элемент в таблице Subjects");
    }

    public static void menu5() {
        System.out.println("1. Редактировать таблицу Football_League");
        System.out.println("2. Редактировать таблицу Football_Teams");
        System.out.println("3. Редактировать таблицу Subjects");
    }

    public static void menu2() {
        System.out.println("1. Выбрать элементы из таблицы Football_League по ID");
        System.out.println("2. Выбрать элементы из таблицы Football_Teams по ID");
        System.out.println("3. Выбрать элементы из таблицы Subjects по ID");
    }

    public static void menu6() {
        System.out.println("1. Посмотреть клубы отсортированные по количеству трефеев");
        System.out.println("2. Посмотреть клубы отсортированные по стоимости");
    }

    public static void menu0() {
        System.out.println("Спасибо за работу)))");
    }

}
