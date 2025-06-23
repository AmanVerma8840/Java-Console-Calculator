import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("----- Multi-Input Console Calculator -----");

        while (keepRunning) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Exiting Calculator. Goodbye!");
                continue;
            }

            System.out.print("How many numbers do you want to use? ");
            int count = scanner.nextInt();

            if (count < 2) {
                System.out.println("Please enter at least two numbers.");
                continue;
            }

            double[] numbers = new double[count];
            for (int i = 0; i < count; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextDouble();
            }

            double result = 0;

            switch (choice) {
                case 1:
                    result = Calculator.add(numbers);
                    break;
                case 2:
                    result = Calculator.subtract(numbers);
                    break;
                case 3:
                    result = Calculator.multiply(numbers);
                    break;
                case 4:
                    result = Calculator.divide(numbers);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}