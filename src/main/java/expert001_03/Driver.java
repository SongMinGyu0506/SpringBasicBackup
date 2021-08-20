package expert001_03;

import expert001_01.KoreaTire;
import expert001_01.Tire;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car();
        car.setTire(new KoreaTire());

        System.out.println(car.getTireBrand());
    }
}
