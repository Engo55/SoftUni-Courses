package advanced.DefiningClasses.Exercise.Google;

public class Company {
    private final String companyName;
    private final String department;
    private final double salary;

    public Company(String companyName, String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return companyName + " " + department + " " + String.format("%.2f", salary);
    }
}





















