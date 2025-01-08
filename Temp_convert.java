import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//with history record
public class Temp_convert {
    private Scanner sc = new Scanner(System.in);

    public double celsius() {

        System.out.println("Enter the temperature in Celsius");
        return sc.nextDouble();
    }

    public double Fahrenheit() {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        return sc.nextDouble();
    }

    public double Kelvin() {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Kelvin");
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        String res = "";
        Scanner sc = new Scanner(System.in);
        Temp_convert tc = new Temp_convert();

        while (true) {
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. History");
            System.out.println("8. Exit");

            int choice = -1;
            boolean validInput = false;

            ArrayList<String> ls = new ArrayList<>();

            while (true) {
                try {
                    System.out.println("Enter your choice: ");
                    choice = sc.nextInt();
                    if (choice < 1 || choice > 8) {
                        System.out.println("Invalid choice. Please choose between 1 and 7.");
                    } else {
                        validInput = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.nextLine();
                }

                if (choice == 8) {
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                }

                if (choice == 7) {
                    if (ls.isEmpty()) {
                        System.out.println("empty");
                    } else {
                        System.out.println("History:");

                        for (String his : ls) {
                            System.out.println(his);

                        }
                    }
                    continue;
                }

                // String res = "";
                switch (choice) {
                    case 1:
                        double c = tc.celsius();
                        double f = (c * 9 / 5) + 32;
                        res = (c + " Celsius is equal to " + f + " Fahrenheit");
                        System.out.println(res);
                        ls.add(res);
                        break;
                    case 2:
                        double f1 = tc.Fahrenheit();
                        double c1 = (f1 - 32) * 5 / 9;
                        res = (f1 + " Fahrenheit is equal to " + c1 + " Celsius");
                        System.out.println(res);
                        ls.add(res);
                        break;
                    case 3:
                        double c2 = tc.celsius();
                        double k = c2 + 273.15;
                        res = (c2 + " Celsius is equal to " + k + " Kelvin");
                        System.out.println(res);
                        ls.add(res);
                        break;
                    case 4:
                        double k1 = tc.Kelvin();
                        double c3 = k1 - 273.15;
                        res = (k1 + " Kelvin is equal to " + c3 + " Celsius");
                        System.out.println(res);
                        ls.add(res);
                        break;
                    case 5:
                        double f2 = tc.Fahrenheit();
                        double k2 = (f2 - 32) * 5 / 9 + 273.15;
                        res = (f2 + " Fahrenheit is equal to " + k2 + " Kelvin");
                        System.out.println(res);
                        ls.add(res);
                        break;
                    case 6:
                        double k3 = tc.Kelvin();
                        double f3 = (k3 - 273.15) * 9 / 5 + 32;
                        res = (k3 + " Kelvin is equal to " + f3 + " Fahrenheit");
                        ls.add(res);
                        break;

                }
            }
        }
    }
}
