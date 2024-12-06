public class OperatorFactory {
    private int operation;
    public OperatorFactory(){
    }

    public Operator getOperator(int operation) throws InvalidOperatorException{
        if (operation == 1) {
            return new Addition();
        } else if (operation == 2) {
            return new Subtraction();
        } else if (operation == 3) {
            return new Multiplication();
        } else if(operation == 4){
            return new Division();
        }else{
            throw new InvalidOperatorException();
        }
    }
}
