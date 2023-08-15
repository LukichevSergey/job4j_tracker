package ru.job4j.cast;

public class AutoPark {
    public static void main(String[] args) {
        Vehicle air = new Airplane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();

        Vehicle[] array = {air, bus, train};

        for (Vehicle vehicle : array) {
            vehicle.move();
        }
    }
}
