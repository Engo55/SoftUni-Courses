package advanced.DefiningClasses.Exercise.CompanyRoster;

public class Employee {
    // mandatory
    private final String name;

    public double getSalary() {
        return salary;
    }

    private final double salary;
    private final String position;
    private final String department;
    // optional
    private String email;
    private int age;

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }
    // 6 parameters
    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    // 5 parameters
    public Employee(String name, double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name + " ").append(String.format("%.2f ", salary));
        if (email != null) {
            builder.append(email + " ");
        } else {
            builder.append("n/a ");
        }

        if (age == 0) {
            builder.append("-1");
        } else {
            builder.append(age);
        }
        return builder.toString();
    }
}




















