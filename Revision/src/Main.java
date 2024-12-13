import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Prius", 100, 0);
        myCar.updateMiles(100);
        System.out.println(myCar.getMiles());

    }
}
