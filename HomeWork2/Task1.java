package HomeWorks.HomeWork2;

import java.util.Scanner;

/**
 * Task1
 */



// Задача 1:
// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
// В противном случае, программа должна выводить сообщение "Число корректно".


public class Task1 {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        try {
            positiveNumber(number);
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }finally{
            in.close();
        }
    }

    public static void positiveNumber(int number) throws InvalidNumberException{
        if(number < 1){
            throw new InvalidNumberException("Invalid number");
        }else{
            System.out.println("The number is correct");
        }
    }
}


/**
 * InnerTask1
 */
class InvalidNumberException extends Exception {

    public InvalidNumberException(String message) {
        super(message);
    }
}