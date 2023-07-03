package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
//    Напишите программу, которая запрашивает у пользователя его возраст.
//    Если введенное значение не является числом, выбросите исключение
//    NumberFormatException с сообщением "Некорректный ввод".
//    Иначе выведите возраст на экран.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введите возраст: ");
           String age = in.nextLine();

            System.out.println(Integer.parseInt(age));
        } catch (NumberFormatException ex1) {
            System.out.println("Некорректный ввод");
        }
        in.close();
    }
}
