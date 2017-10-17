package rmit.p1;

import rmit.p1.builder.Car;
import rmit.p1.builder.CarBuilder;

public class Main {

    public static void main(String[] args) {

        CarBuilder carBuilder = new CarBuilder();
        Car car = carBuilder.paint("black").build();

        System.out.println(car.getColor());

    }
}
