package HomeWorks.HomeWork3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Задача2. По желанию
   Вы разрабатываете систему банковских транзакций. 
   Необходимо написать программу, которая позволяет пользователям осуществлять переводы средств со своего банковского счета на другие счета. 
   Однако, в системе существуют некоторые ограничения и возможные ошибки, которые нужно обрабатывать.

   Требования:

   При переводе средств, сумма должна быть положительной и не превышать доступный баланс на счете.
   Если сумма перевода отрицательная или равна нулю, выбрасывается исключение InvalidAmountException с сообщением "Некорректная сумма перевода".
   Если на балансе недостаточно средств для перевода, выбрасывается исключение InsufficientFundsException с сообщением "Недостаточно средств на счете".
   При успешном переводе, сумма должна списываться с текущего счета и зачисляться на целевой счет.
 */
public class Task2 {
    public static void main(String[] args) {
        double balance = 100;
        double sum = getSum("Enter the transfer amount: ");
        transaction(balance, sum);
    }

    public static void transaction(double balance, double sum){
        try {
            if (sum > balance){
                throw new InsufficientFundsException("null");
            }else{
                balance -= sum;
                System.out.println("The transaction was completed successfully, your balance: " + balance); 
            }
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient funds in the account.");
        }
    }

    public static double getSum(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.printf(message);
                double sum = scanner.nextDouble();
                if (sum < 1){
                    throw new InvalidAmountException("");
                }
                return sum;
            } catch (InputMismatchException exception) {
                System.out.println("Error: Not a number is entered. Repeat the input.");
                scanner.next(); // Очистка буфера сканера
            } catch (InvalidAmountException exception){
                System.out.println("Incorrect transfer amount. Repeat the input.");
            }
        }
    }
}

class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
