package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        System.out.println("Car initial speed: " +car.getSpeed());
        System.out.println("Moto initial speed: " +motorcycle.getSpeed());
        car.speedUp();
        motorcycle.speedUp();
        System.out.println("Car speed after increase: " +car.getSpeed());
        System.out.println("Moto speed after increase: "+motorcycle.getSpeed());

    }
}
