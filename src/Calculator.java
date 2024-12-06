import java.util.Scanner;

public class Calculator {
    private Operator operator;

    public Calculator(){
        this.operator = new Addition();
    }

    public double calculate(double num1, double num2){
        return this.operator.operate(num1, num2);

    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}

