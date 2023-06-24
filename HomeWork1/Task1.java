package HomeWorks.HomeWork1;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        divide(10, 2);
        
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