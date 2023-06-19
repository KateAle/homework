package ru.itmo.coursework03;

import java.io.*;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Message implements Serializable {
    private String text;
    private LocalDateTime sent;

    public Message(String text) {
        this.text = text;
    }

    public void setSent(LocalDateTime sent) {
        this.sent = sent;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getSent() {
        return sent;
    }

    public static String fileLoad(String path) {
        String doc = "Файл не загружен";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название документа");
        String name = scanner.nextLine();
        if (name.length() > 15 || name == null) {
            System.out.println("Название должно содержать 1-15 символов");
        } else {
            File file = new File(path + name + ".txt");
            System.out.println("Введите описание документа");
            String desc = scanner.nextLine();
            if (desc.length() > 30 || desc == null) {
                System.out.println("Описание должно содержать 1-30 символов");
            } else if (file.length() > 850) {
                System.out.println("Размер файла превышает 850 байт");
            } else {
                try (FileReader fr = new FileReader(file)) {
                    char[] chars = new char[(int) file.length()];
                    fr.read(chars);
                    String content = new String(chars);

                    StringBuffer sb = new StringBuffer();
                    sb.append(name)
                            .append("//")
                            .append(desc)
                            .append("//")
                            .append(content)
                            .append("//");

                    doc = sb.toString();
                } catch (IOException e) {
                    System.out.println("Не удалось прочитать файл");
                }
            }
        }return doc;
    }
}
