package ru.itmo.homeworks.hw12;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class Application {
    public static void main(String[] args) throws AccessDeniedException, JarException, FileNotFoundException {

        //Status status = Status.FILE_NOT_FOUND;
       //Status[] arr = Status.values();
       //Status status = arr[(int)(Math.random() *  3)];
        Status status = Status.FILE_NOT_FOUND;

       Exc.throwException(status);
    }
}
