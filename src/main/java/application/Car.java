package application;

import java.util.Comparator;
import java.util.stream.Stream;

public class Car {
    private String name;
    private int price;

    // геттеры
    public String getName() { return name; }
    public int getPrice() { return price; }




    public static Car getMostExpensiveCar(Stream<Car> stream) {
        return stream
                .max(Comparator.comparingInt(Car::getPrice))
                .orElse(null); // вернет null, если поток пуст
    }

    public static Car getMoreExpensiveCar(Stream<Car> stream, Car car) {
        return stream
                .filter(c -> c.getPrice() > car.getPrice())
                .max(Comparator.comparingInt(Car::getPrice))
                .orElse(null);
    }

    public static Car getCheapestCar(Stream<Car> stream) {
        return stream
                .min(Comparator.comparingInt(Car::getPrice))
                .orElse(null);
    }

    public static Car getCheaperCar(Stream<Car> stream, Car car) {
        return stream
                .filter(c -> c.getPrice() < car.getPrice())
                .min(Comparator.comparingInt(Car::getPrice))
                .orElse(null);
    }





}