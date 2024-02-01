package stringcalculator;

public class MainCalculator {
    public static void main(String[] args) {
        StringCalculatorProvider ccp = new StringCalculatorProvider();
        System.out.println("The addition is");
        System.out.println(ccp.add("1,2"));
    }
}
