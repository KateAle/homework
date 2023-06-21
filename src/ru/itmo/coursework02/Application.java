package ru.itmo.coursework02;
import java.io.IOException;
import java.util.Scanner;

public class Application {


 public static void main(String[] args) throws IOException {
        Game g = new Game();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        User u = new User(new StartCommand(g),  new ContCommand(g), new LoadCommand(g), new SaveCommand(g), new ExitCommand(g), login, password, g);

            Scanner sc = new Scanner(System.in);
            System.out.println("\n--- МЕНЮ ---\n\n" +
                    "1. Новая игра\n" +
                    "2. Загрузить\n" +
                    "3. Выйти\n\n" +
                    "Введите 1..3 для выбора\n");

            String menu = sc.nextLine();

            if (menu.equals("1")) {
                u.startGame();
            } else if (menu.equals("2")) {
                u.loadGame();
            } else if (menu.equals("3")) {
                u.exitGame();
            }

      while (true){
            sc = new Scanner(System.in);

        System.out.println("\n--- МЕНЮ ---\n\n" +
                "1. Новая игра\n" +
                "2. Продолжить\n" +
                "3. Загрузить\n" +
                "4. Сохранить\n" +
                "5. Выйти\n\n" +
                "Введите 1..4 для выбора\n");

        menu = sc.nextLine();

        if (menu.equals("1")) {
            u.startGame();
        } else if (menu.equals("2")) {
            u.contGame();
        } else if (menu.equals("3")) {
            u.loadGame();
        } else if (menu.equals("4")) {
            u.saveGame();
        } else if (menu.equals("5")) {
            u.exitGame();
        }
        }
    }}



//u.addUser();
// users.forEach((key, value) -> System.out.println(key + " " + value));

