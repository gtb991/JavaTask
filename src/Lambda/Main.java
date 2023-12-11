package Lambda;

public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = (x, y) -> x + y;
        int result = sumCalculator.sum(9,8);
        System.out.println("Sum 9,8: " +result);
        result = sumCalculator.sum(99, -66);
        System.out.println("Sum 99. -66: "+result);
    }
}
