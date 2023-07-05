package org.example.H_3;


import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            int a = in.nextInt();
            System.out.print("Введите степень числа: ");
            int b = in.nextInt();
            calculatePower(a,b);
        } catch (InvalidInputException e){
            System.out.println("Ошибка: "+ e.getMessage());
        }catch (InputMismatchException e1) {
            System.out.println("Ошибка: введите, пожалуйста, число.");
        }
    }


    public static void calculatePower(int a, int b) throws InvalidInputException {
        if(a == 0 || b<=0) {
            throw new InvalidInputException("Ошибка: некорректное значение");
        }
        System.out.println(Math.pow(a,b));
    }

}

class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super(message);
    }
}