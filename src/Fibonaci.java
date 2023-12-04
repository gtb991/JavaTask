public class Fibonaci {

    public static void main(String[] args) {

        int a = 0, b = 1, c, d, count = 20;

        System.out.println(a + " " + b);

        for (d = 2; d < count; d++){
            c = a + b;
            System.out.println(" "+ c);
            a = b;
            b = c;
        }

    }
}
