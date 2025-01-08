import java.util.Scanner;

public class Temperature_converter {

    public int celsius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius");
        int c = sc.nextInt();
        return c;
    }

    public double Fahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Celsius  to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("Please enter the option to be converted ");
            int option = sc.nextInt();

            switch (option) {
                case 1:

                    System.out.println("Please enter the Temp in Celsius : ");
                    int c = sc.nextInt();
                    double f = (c * 9.0 / 5) + 32;
                    System.out.println("The temperature in Fahrenheit is " + f);
                    break;

                case 2:
                    System.out.println("Please enter the Temp in Celsius : ");
                    int c1 = sc.nextInt();
                    double k = c1 + 273.15;
                    System.out.println("The temperature in Kelvin is " + k);
                    break;

                case 3:
                    System.out.println("Please enter the Temp in Fahrenheit : ");
                    double f1 = sc.nextDouble();
                    double c2 = (f1 - 32) * 5 / 9;
                    System.out.println("The temperature in Celsius is " + c2);
                    break;

                case 4:
                    System.out.println("Please enter the Temp in Fahrenheit : ");
                    double f2 = sc.nextDouble();
                    double k1 = (f2 - 32) * 5 / 9 + 273;
                    System.out.println("The temperature in Kelvin is " + k1);
                    break;

                case 5:
                    System.out.println("Please enter the Temp in Kelvin : ");
                    double k2 = sc.nextDouble();
                    double c3 = (k2 - 273.15) * 5 / 9;
                    System.out.println("The temperature in Celsius is " + c3);
                    break;

                case 6:
                    System.out.println("Please enter the Temp in Kelvin : ");
                    double k3 = sc.nextDouble();
                    double f3 = (k3 - 273.15) * 9 / 5 + 32;
                    System.out.println("The temperature in Fahrenheit is " + f3);
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }
}
