package HomeWorks.HomeWork1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// По желанию*
// Сложная задача: Чтение файла и подсчет суммы чисел
// Напишите программу, которая считывает содержимое текстового файла, в котором каждая строка содержит одно число. 
// Программа должна подсчитать сумму всех чисел в файле. Если встретится строка, которая не может быть преобразована в число, 
// выбросите исключение NumberFormatException с сообщением "Некорректное значение числа в файле".

public class Task3 {
     public static void main(String[] args) {
          reader();
     }

     private static void reader() {
          int sum = 0;
          try {
               File file = new File("C://Users//admin//Desktop//Test.txt/");
               FileReader fl = new FileReader(file);
               BufferedReader reader = new BufferedReader(fl);
               // String line = reader.readLine();
               String line;
               while ((line = reader.readLine()) != null) {
                    int number = Integer.parseInt(line);
                    sum += number;
               }
               reader.close();
               System.out.printf("Sum of all numbers: %d", sum);
          } catch (FileNotFoundException exception) {
               System.out.println("File not found");
          } catch (NumberFormatException exception) {
               System.out.println("Invalid number value in the file");
          } catch(Exception exception){
               System.out.println(exception);
          }
     }
}
