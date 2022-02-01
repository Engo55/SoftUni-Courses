package advanced.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputRobots = scanner.nextLine();
        String[] robotsData = inputRobots.split(";");
        LinkedHashMap<String, Integer> robots = getRobotsMap(robotsData);// name -> amount of time needed to finish product
        LinkedHashMap<String, Integer> robotsWorkingTime = getRobotsWorkingTimeMap(robotsData);// name -> amount of time works on product


        String startTime = scanner.nextLine();
        int startTimeInSeconds = getStartTimeInSeconds(startTime);

        ArrayDeque<String> products = new ArrayDeque<>();
        String product = scanner.nextLine(); // End or Product
        while (!product.equals("End")) {
            products.offer(product);
            product = scanner.nextLine();
        }

        while (!products.isEmpty()) {
            String currentProduct = products.poll();
            startTimeInSeconds++;
            // decrease the time for work of all robots which have product
            decreaseWorkingTime(robotsWorkingTime);
            boolean isTaken = false;
            // check which robot is free -> working time = 0
            for (Map.Entry<String, Integer> robot : robotsWorkingTime.entrySet()) { // name -> time for work
                if (robot.getValue() == 0) { // robot is free -> robot starts to work on product
                    System.out.println(robot.getKey() + " - " + currentProduct + " [" + getStartTime(startTimeInSeconds) + "]");
                    robotsWorkingTime.put(robot.getKey(), robots.get(robot.getKey()));
                    isTaken = true;
                    break;
                }
            }

            if (!isTaken) {
                products.offer(currentProduct);
            }
        }
    }

    private static void decreaseWorkingTime(LinkedHashMap<String, Integer> robotsWorkingTime) {
        for (Map.Entry<String, Integer> robot : robotsWorkingTime.entrySet()) {
            if (robot.getValue() > 0) { // is not free
                // worked 1 second on the product -> time for work on product - 1
                robotsWorkingTime.put(robot.getKey(), robot.getValue() - 1);
            }
        }
    }

    private static LinkedHashMap<String, Integer> getRobotsWorkingTimeMap(String[] robotsData) {
        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (String robotData : robotsData) {
            // robotData = "ROB-15" -> split("-") -> ["ROB", "15"]
            String robotName = robotData.split("-")[0];
            robots.put(robotName, 0);
        }
        return robots;
    }

    private static int getStartTimeInSeconds(String startTime) {
        int hours = Integer.parseInt(startTime.split(":")[0]);
        int minutes = Integer.parseInt(startTime.split(":")[1]);
        int seconds = Integer.parseInt(startTime.split(":")[2]);
        return hours * 3600 + minutes * 60 +seconds;
    }

    private static String getStartTime(int startTimeInSeconds) {
        // seconds -> "h:mm:s" -> hours + ":" + minutes + ":" + seconds
        int hours = (startTimeInSeconds / 3600) % 24;
        int minutes = startTimeInSeconds % 3600 / 60;
        int seconds = startTimeInSeconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    private static LinkedHashMap<String, Integer> getRobotsMap(String[] robotsData) {
        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (String robotData : robotsData) {
            // robotData = "ROB-15" -> split("-") -> ["ROB", "15"]
            String robotName = robotData.split("-")[0];
            int processingTime = Integer.parseInt(robotData.split("-")[1]);
            robots.put(robotName, processingTime);
        }
        return robots;
    }
}
