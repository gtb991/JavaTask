package Polymorphism;

public class Motorcycle extends Vehicle {

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Moto increase speed by 10 units");
    }
}
