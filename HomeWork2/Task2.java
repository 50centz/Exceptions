package HomeWorks.HomeWork2;

import java.util.Scanner;

// Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". 
// В противном случае, программа должна выводить результат деления.



public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner in = new Scanner(System.in);
        double first = in.nextDouble();
        System.out.print("Enter the second number: ");
        double second = in.nextDouble();

        try {
            divide(first, second);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }finally{
            in.close();
        }
        
    }

    public static void divide(double one, double two) throws DivisionByZeroException{
        if(two == 0){
            throw new DivisionByZeroException("Division by zero is not allowed");
        }else{
            System.out.printf("Result: %.2f", one / two);
        }
    }
}




class DivisionByZeroException extends Exception{

    public DivisionByZeroException(String message){
        super(message);
    }
}



