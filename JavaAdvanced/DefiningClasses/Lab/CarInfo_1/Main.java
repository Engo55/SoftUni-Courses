package advanced.DefiningClasses.Lab.CarInfo_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> carsCollection = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            String brand = carData[0];
            String model = carData[1];
            int horsePower = Integer.parseInt(carData[2]);

            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);
            carsCollection.add(car);
        }
        carsCollection.forEach(car -> System.out.println(car.carInfo()));
    }
}


















