import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enter input
        Scanner scanner = new Scanner(System.in);
        // استدعاء عمليات خاص با class
        Calculator calculator = new Calculator();

        // for loop متكرره
            while (true) {
                // message
                System.out.println("Enter First Number (or 'exit' to quit, 'clear' to reset):");
                // message input
                String input = scanner.next();


                // شرط هنا لو خرج ينهي برنامج او يعل عملية clear
                // equalsIgnoreCase ده هدفه حتي لو دخلت اي حرف كابتل يقراها small
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting calculator.");
                    break; // Exit the loop
                } else if (input.equalsIgnoreCase("clear")) {
                    calculator.clear(); // Reset the calculator
                    System.out.println("Calculator cleared.");
                    continue; // Skip the rest of the loop and start again
                    // شرط دا هدفه لحل مشكله مدخلات غير منوافقه مع شرط اساسيه لمنع حدوث exception
                }
//                else if (!input.isEmpty()){
//                    System.out.println("Enter input Error ,Try Again");
//                    continue;
//                }

                double firstNumber = Double.parseDouble(input);

                System.out.println("Enter Operation (+, -, *, /):");
                char operation = scanner.next().charAt(0);

                System.out.println("Enter Second Number:");
                double secondNumber = scanner.nextDouble();
                // display result Operation
                calculator.startCalculator(firstNumber, operation, secondNumber);
                calculator.printResult();
                calculator.printOperations();

    }
}}