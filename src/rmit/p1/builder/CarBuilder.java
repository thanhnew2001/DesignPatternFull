package rmit.p1.builder;

/**
 * Created by CoT on 10/17/17.
 */
public class CarBuilder {

    private Car car = new Car();

    public CarBuilder paint(String color){
        this.car.setColor(color);
        return this;
    }

    public Car build(){
        return car;
    }
}
