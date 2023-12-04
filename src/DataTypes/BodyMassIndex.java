package DataTypes;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Your weight in Kg? ");
        double weight = input.nextDouble();

        System.out.println("Your height in cm? ");
        double height = input.nextDouble();

        double BMI = weight * 0.45359237 /(height * 0.0254 * height * 0.0254);

        System.out.println("Your BMI is "+BMI+"\n");

    }
}
