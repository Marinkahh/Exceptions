package org.example.H_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите делимое (целое число): ");
            int a = in.nextInt();
            System.out.print("Введите делитель (целое число): ");
            int b = in.nextInt();
            myInput(a,b);
        } catch (DivisionByZeroException e){
            System.out.println("Ошибка: "+ e.getMessage());
        }catch (InputMismatchException e1) {
            System.out.println("Ошибка: введите, пожалуйста, число.");
        }
    }

    public static void myInput(int a, int b) throws DivisionByZeroException{
        if(b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        System.out.println(a/b);
    }

}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}

