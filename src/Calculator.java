import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private Double result;
    private final List<String> operations;

    // constructor
    public Calculator() {
        this.result = 0.0;
        this.operations = new ArrayList<>();
    }
    // Getter for result
    public Double getResult() {
        return result;
    }

    // Setter for result
    public void setResult(Double result) {
        this.result = result;
    }



    // type default
     void startCalculator(double firstNumber, char operation, double secondNumber) {
        switch (operation) {
            case '+':
               add(firstNumber, secondNumber);
                break;
            case '/':
                if (secondNumber!=0){
                    divide(firstNumber, secondNumber);
                }else {
                    System.out.println("Cannot divide by zero");
                }

                break;
            case '-':
                subtract(firstNumber, secondNumber);
                break;
            case '*':
                multiply(firstNumber, secondNumber);
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

    private void add(double x, double y) {
        result = result+(x + y);
        operations.add("Added " + x + " and " + y + ": " + result);
    }

    private void subtract(double x, double y) {
        result =result+ (x - y);
        operations.add("Subtracted " + y + " from " + x + ": " + result);
    }

    private void multiply(double x, double y) {
        result =result+ (x * y);
        operations.add("Multiplied " + x + " by " + y + ": " + result);
    }

    private void divide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        result =result+( x / y);
        operations.add("Divided " + x + " by " + y + ": " + result);
    }

    public void printResult() {
        if (result != null) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("No operations performed yet.");
        }
    }

    public void printOperations() {
        if (!operations.isEmpty()) {
            System.out.println("Operations performed:");
            for (String op : operations) {
                System.out.println(op);
            }
        } else {
            System.out.println("No operations performed yet.");
        }
    }

    public void clear() {
        result = 0.0;
        operations.clear();
    }
}