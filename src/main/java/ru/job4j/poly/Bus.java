package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет.");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Кол-во пассажиров в автобусе - " + passengers);
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 50;
    }
}
