public class Division implements Operator{
    public double operate(double num1, double num2){
        if(num2 == 0){
            throw new ArithmeticException("Error: Division by zero");
        }
        return num1 / num2;
    }
}
