package advanced.SetsAndMapsAdvanced.Exercise;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Integer> userWithTime = new TreeMap<>();
        TreeMap<String, TreeSet<String >> addresses = new TreeMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String ip = tokens[0];
            String name = tokens[1];
            int time = Integer.parseInt(tokens[2]);

            if (!userWithTime.containsKey(name)) {
                userWithTime.put(name, time);
                addresses.put(name, new TreeSet<>(){{add(ip);}});
            } else {
                userWithTime.put(name, userWithTime.get(name) + time);
                addresses.get(name).add(ip);
            }
        }

        userWithTime.forEach((key, value) ->{

            System.out.println(String.format("%s: %d %s", key, value, addresses.get(key).toString()));

        });
    }
}