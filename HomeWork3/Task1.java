package HomeWorks.HomeWork3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Задача1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа и выполняет операцию возведения первого числа в степень второго числа. 
 * Если введены некорректные числа или происходит деление на ноль, необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
   Важно! С использованием принципа одного уровня абстракции!
** В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(), выполняющий операцию возведения числа в степень. 
   Если введено некорректное основание (ноль) и отрицательная степень, выбрасывается исключение InvalidInputException.
 */



public class Task1 {
    public static void main(String[] args) {
        int digit = getDigit("Enter a number: ");
        int degree = getDegree("Enter the degree: ");
        System.out.println("Result = " + calculatePower(digit, degree));
    }

    public static int calculatePower(int one, int two){
        
        return (int)Math.pow(one, two);
    }

    public static int getDigit(String message) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Error: Not a number is entered. Repeat the input.");
                scanner.next();
            } 
        }
    }

    public static int getDegree(String message){
        Scanner scanner = new Scanner(System.in);

        while(true){
            try {
                System.out.print(message);
                int degree = scanner.nextInt();
                if (degree < 1){
                    throw new InvalidInputException("");
                }
                return degree;
            } catch (InputMismatchException exception) {
                System.out.println("Error: Not a number is entered. Repeat the input.");
                scanner.next();
            }catch(InvalidInputException exception){
                System.out.println("The degree must not be zero or negative. Repeat the input.");
            }  
        }
    }
}

class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super(message);
    }
}
