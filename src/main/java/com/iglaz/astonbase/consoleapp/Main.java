package com.iglaz.astonbase.consoleapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Use Scanner for reading input from the user
    Scanner scanner = new Scanner(System.in);
    List<String> todoList = new ArrayList<>(List.of("Попить кофе", "Выучить Java"));

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        // Этот бесконечный цикл предназначен для того, чтобы приложение работало
        // пока пользователь не захочет выйти выбрав в меню команду номер 5
        while (true) {
            displayMenu();
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                handleMenuChoice(choice);
            }
        }
    }

    public void displayMenu() {
        System.out.println("Список доступных команд");
        System.out.println("1. Вывести спискок дел");
        System.out.println("2. Добавить дело");
        System.out.println("3. Заменить дело");
        System.out.println("4. Удалить дело");
        System.out.println("5. Выход");
        System.out.println("Введите число от 1 до 5 чтобы выбрать действие:");
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                list();
                break;
            case 2:
                add();
                break;
            case 3:
                // edit();
                break;
            case 4:
                // delete();
                break;
            case 5:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                // обработка остальных возмножных варантов ввода пользователя
        }
    }

    // реализация всех методов ToDoList
    private void list() {
        if (todoList.isEmpty()) {
            System.out.println("Пока в вашем списке нет задач");
        } else {
            todoList.forEach(System.out::println);
            separate();
        }
    }

    private void add() {
        System.out.println("Введите дело которое хотите добавить:");

        if (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            todoList.add(command);

            System.out.println("Дело " + command + " успешно добавлено");
            separate();
        }
    }

    private void edit() {

    }

    private void delete() {

    }

    private void separate() {
        System.out.println("============================== \n\n");
    }
}
