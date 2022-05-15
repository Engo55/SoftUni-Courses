package advanced.DefiningClasses.Lab.Constructors;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> carsCollection = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            Car car;

            if (carData.length == 1) {
                car = new Car(carData[0]);
            } else {
                car = new Car(carData[0], carData[1], Integer.parseInt(carData[2]));
            }

            carsCollection.add(car);
        }

        carsCollection.forEach(car -> System.out.println(car.carInfo()));
    }
}



















