package advanced.SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user -> {ip -> count}
        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();
        String input = scanner.nextLine();
        //"IP={IP.Address} message={A&sample&message} user={username}"
        while (!input.equals("end")) {
            String[] inputParts = input.split("\\s+"); //["IP={IP.Address}", "message={A&sample&message}", "user={username}"]
            String ip = inputParts[0].split("=")[1]; //"IP={IP.Address}".split("=") -> ["IP","{ip addres}"]
            //String message = inputParts[1].split("=")[1]; // "message={A&sample&message}".split("=") -> ["message", "{A&sample&message}"]
            String username = inputParts[2].split("=")[1]; //"user={username}".split("=") -> ["user", "{username}"]

            // username to not exist
            if (!data.containsKey(username)) {
                data.put(username, new LinkedHashMap<>(){
                    {
                        put(ip, 1);
                    }
                });
            } else { // username exists
                // current list with ip
                Map<String, Integer> currentIps = data.get(username); // list with ip
                // ip to be visited (in the list)
                if (currentIps.containsKey(ip)) {
                    int currentTimes = currentIps.get(ip);
                    currentIps.put(ip, currentTimes + 1);
                } else { // ip haven't visited (not in the list)
                    currentIps.put(ip, 1);
                }
            }

            input = scanner.nextLine();
        }

        //"username:
        //{IP} => {count}, {IP} => {count}."
        data.keySet().forEach(username -> {
            System.out.println(username + ":");
            Map<String, Integer> ips = data.get(username);
            // rec: ip -> times visited
            ips.entrySet().forEach(entry -> {
                // if is not the last ip
                System.out.print(entry.getKey() + " => " + entry.getValue() + ", ");
                // the last ip to be printed with a dot
                // if is the last ip in the map
                System.out.println(entry.getKey() + " => " + entry.getValue() + ". ");
            });
        });
    }
}