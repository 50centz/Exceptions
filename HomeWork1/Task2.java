package HomeWorks.HomeWork1;

import java.util.InputMismatchException;
import java.util.Scanner;

// Простая задача 2: Обработка некорректного ввода
// Напишите программу, которая запрашивает у пользователя его возраст. 
// Если введенное значение не является числом, выбросите исключение NumberFormatException с сообщением "Некорректный ввод". Иначе выведите возраст на экран.

public class Task2 {
    public static void main(String[] args) {
        isNumber();
    }

    private static void isNumber(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        try {
            int age = in.nextInt();
            System.out.println(age);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input");
        }
    }
}

// С NumberFormatException у меня вываливалась ошибка если я вводил букву, поэтому я заменил на InputMismatchException
