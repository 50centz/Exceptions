package HomeWorks.HomeWork1;

import java.util.Scanner;

/**
 * Task1
 */


// Простая задача 1: Проверка деления на ноль
// Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление. 
// Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением "Деление на ноль недопустимо". Иначе выведите результат деления на экран.


public class Task1 {

    public static void main(String[] args) {
        System.out.println("Enter a first number");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        System.out.println("Enter a second number");
        int second = in.nextInt();
        in.close();
        divide(first, second);
        
    }


    private static void divide(int a, int b){
        try {
            int result = a / b;
            System.out.printf("%d / %d = %d" , a, b, result );
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero cannot be");
        }
    }
}