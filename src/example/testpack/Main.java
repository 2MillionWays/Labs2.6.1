package example.testpack;


import com.brainacad.carpack.Car;
import example.applepack.Apple;

public class Main {
    public static void main(String[] args) {

        Apple appleOne = new Apple();
        Car carOne = new Car();

        appleOne.setWeight(0.3);
        carOne.setWeight(1200.0);

        System.out.println(appleOne.getWeight());
        System.out.println(carOne.getWeight());
    }

}
