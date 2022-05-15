package advanced.DefiningClasses.Exercise.OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String personalInformation = scanner.nextLine();
            String name = personalInformation.split("\\s+")[0];
            int age = Integer.parseInt(personalInformation.split("\\s+")[1]);
            Person person = new Person(name, age);

            if (age > 30) {
                peopleList.add(person);
            }
        }
        peopleList.sort(Comparator.comparing(person -> person.getName()));
        // print the List
        for (Person person : peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}



















