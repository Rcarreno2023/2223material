import java.util.Scanner;

public class FunctionPractice{
    public static void main(String[] args) {

        addTwoNumber();







        
    }
    //@staticmethod
    //signature of the method
    //private => only this class can access
    //static => no need for an object of the class to be instantiated
    //void => means no return data
    private static void addTwoNumbers() {
        Scanner ui = new Scanner(System.in);
        System.out.println("Number1: ");
        double number1 = ui.nextDouble();
        System.out.println("Number2: ");
        double number2 = ui.nextDouble();

        System.out.printf("%2.2f%n",(number1+number2));

        ui.close();
    }

    //def addTwoNumbers():
    private static void addTwoNumbers(double a, double b){
        System.out.printf("%2.2f%n",(a+b));
    }

    private static void addTwoNumbers(int a, int b){
        System.out.printf("%2.2f%n",(a+b));
    }
}