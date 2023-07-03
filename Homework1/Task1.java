package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
//    Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление.
//    Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением
//    "Деление на ноль недопустимо". Иначе выведите результат деления на экран.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введите делимое (целое число): ");
            int a = in.nextInt();
            System.out.print("Введите делитель (целое число): ");
            int b = in.nextInt();
            int k = a/b;
            System.out.println(k);
        } catch (InputMismatchException ex1) {
            System.out.println("Некорректный ввод. Введите, пожалуйста, целое число.");
        } catch (ArithmeticException ex2) {
            System.out.println("Некорректный ввод. Деление на ноль недопустимо.");
        }
        in.close();
    }



}
