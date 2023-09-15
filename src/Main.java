import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double startValue;
        double valueTax;

        System.out.println("Enter the price of your purchase: ");
        startValue = scan.nextDouble();
        valueTax = startValue * 1.05;
        System.out.println("The price of your purchase, with a 5% sales tax, is: " + valueTax + "$");
    }
}