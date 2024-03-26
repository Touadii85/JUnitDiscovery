public class Calculator {


    public int add(int a, int b){
        return a + b;
    }

    public int soustract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divided(int a, int b) throws Exception{
        if (b == 0) {
            throw new Exception("Division by zero is not allowed.");
        }
        return a / b;
    }
}
