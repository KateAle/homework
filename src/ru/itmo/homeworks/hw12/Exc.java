package ru.itmo.homeworks.hw12;

//если status FILE_NOT_FOUND, выбрасывает FileNotFoundException
//если status ACCESS_DENIED, выбрасывает AccessDeniedException
//если status JAR_ERROR, выбрасывает JarException.
//При вызове метода throwException обработать исключения следующим образом:
//
//FileNotFoundException - выводить в консоль стек трейс,
//AccessDeniedException* - выводить в консоль сообщение исключения (метод getMessage())
// и выбрасывать исключение времени выполнения,
//JarException - выводить в консоль стек трейс.
//enum с необходимыми константами нужно создать.

import java.io.*;
import java.util.jar.*;
import java.nio.file.*;
public class Exc extends Exception {

 public static void throwException (Status status) throws JarException, FileNotFoundException,
            AccessDeniedException {

    /*    try { if (status == Status.FILE_NOT_FOUND) {
            throw new FileNotFoundException();
        }else if (status == Status.ACCESS_DENIED) {throw new AccessDeniedException();
        } else if (status == Status.JAR_ERROR) {
            throw new JarException();
        }
        } catch (JarException | FileNotFoundException exception) {
            System.out.println("Обработка JarException | FileNotFoundException exception " + exception.getMessage());
        } catch (AccessDeniedException exception) {
            System.out.println("Обработка AccessDeniedException " + exception.getMessage());
        }*/


    }
}
