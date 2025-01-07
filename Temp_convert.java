import java.util.InputMismatchException;
import java.util.Scanner;

public class Temp_convert {

    public double celsius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius");
        double c = sc.nextDouble();
        return c;

    }

    public double Fahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        double f = sc.nextDouble();
        return f;
    }

    public double Kelvin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Kelvin");
        double k = sc.nextDouble();
        return k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Temp_convert tc = new Temp_convert();

        while (true) {
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            try {
                System.out.println("Enter your choice: ");
                // int choice = sc.nextInt();
                if (choice < 1 || choice > 7) {
                    System.out.println("Invalid choice. Please choose between 1 and 7.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine(); // Clear the invalid input
            }

            switch (choice) {
                case 1:
                    double c = tc.celsius();
                    double f = (c * 9 / 5) + 32;
                    System.out.println(c + " Celsius is equal to " + f + " Fahrenheit");
                    break;
                case 2:
                    double f1 = tc.Fahrenheit();
                    double c1 = (f1 - 32) * 5 / 9;
                    System.out.println(f1 + " Fahrenheit is equal to " + c1 + " Celsius");
                    break;
                case 3:
                    double c2 = tc.celsius();
                    double k = c2 + 273.15;
                    System.out.println(c2 + " Celsius is equal to " + k + " Kelvin");
                    break;
                case 4:
                    double k1 = tc.Kelvin();
                    double c3 = k1 - 273.15;
                    System.out.println(k1 + " Kelvin is equal to " + c3 + " Celsius");
                    break;
                case 5:
                    double f2 = tc.Fahrenheit();
                    double k2 = (f2 - 32) * 5 / 9 + 273;
                    System.out.println(f2 + " Fahrenheit is equal to " + k2 + " Kelvin");
                    break;
                case 6:
                    double k3 = tc.Kelvin();
                    double f3 = (k3 - 273.15) * 9 / 5 +
                            32;
                    System.out.println(k3 + " Kelvin is equal to " + f3 + " Fahrenheit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
    }

}
