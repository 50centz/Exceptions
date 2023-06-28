package HomeWorks.HomeWork2;

import java.util.Scanner;

// Задача3: - по желанию
// Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

// Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
// Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
// Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
// Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
// - необходимо создать 3 класса собвстенных исключений


public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        System.out.print("Enter the second number: ");
        int two = in.nextInt();
        System.out.print("Enter the third number: ");
        int three = in.nextInt();

        try {
            check(one, two, three);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            in.close();
        }
        
    }

    public static void check(int one, int two, int three) throws Exception{
        if(one > 100){
            throw new NumberOutOfRangeException("The first number is out of range");
        }
        else if(two < 0){
            throw new NumberOutOfRangeException("The second number is out of range");
        }else if(one + two < 10){
            throw new NumberSumException("The sum of the first and second numbers is too small");
        }else if(three == 0){
            throw new DivisionByZeroException("Division by zero is not allowed");
        }else{
            System.out.println("Verification passed successfully");
        }
    }
}


class NumberOutOfRangeException extends Exception{
    public NumberOutOfRangeException(String message){
        super(message);
    }
}

class NumberSumException extends Exception{
    public NumberSumException(String message){
        super(message);
    }
}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}
