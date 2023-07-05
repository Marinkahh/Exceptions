package org.example.H_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            int value = in.nextInt();
            myInput(value);
        } catch (InvalidNumberException e){
            System.out.println("Ошибка: "+ e.getMessage());
        }catch (InputMismatchException e1) {
            System.out.println("Ошибка: введите, пожалуйста, число.");
        }
    }
public static void myInput(int value) throws InvalidNumberException{
        if(value <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
    System.out.println("Число корректно");
}

}

class InvalidNumberException extends Exception{
    public InvalidNumberException(String message){
        super(message);
    }
}
