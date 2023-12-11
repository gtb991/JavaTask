package Polymorphism;

public class Car extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Car increase speed by 30 units");
    }
}
