import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static <calculator> void main(String[] args) {
            System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication  \n 4. Division ");
            System.out.print("Select the number relevant to the calculation:");
            Scanner inputScanner = new Scanner(System.in);
            Calculator calculator = new Calculator();
            try {
                int operation = inputScanner.nextInt();
                if (operation < 0 || operation > 4) {
                    throw new InvalidOperatorException();
                }
                OperatorFactory operatorFactory = new OperatorFactory();
                Operator operator = operatorFactory.getOperator(operation);
                calculator.setOperator(operator);
                System.out.println("Enter two decimals:");
                double num1 = inputScanner.nextDouble();
                double num2 = inputScanner.nextDouble();
                double output = calculator.calculate(num1, num2);
                System.out.println("Calculated value:"+output);
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid Number.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
}