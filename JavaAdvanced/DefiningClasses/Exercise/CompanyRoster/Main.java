package advanced.DefiningClasses.Exercise.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Employee>> departments = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String employeeInformation = scanner.nextLine();
            String[] parameters = employeeInformation.split("\\s+");
            String name = parameters[0];
            double salary = Double.parseDouble(parameters[1]);
            String position = parameters[2];
            String department = parameters[3];
            Employee employee = null;
            // 6 param -> name, salary, position, department, email, age
            if (parameters.length == 6) {
                String email = parameters[4];
                int age = Integer.parseInt(parameters[5]);
                employee = new Employee(name, salary, position, department, email, age);
            }
            // 4 param -> name, salary, position, department
            else if (parameters.length == 4) {
                employee = new Employee(name, salary, position, department);
            }
            // 5 param -> name, salary, position, department, email
            else if (parameters.length == 5) {
                String forthParameter = parameters[4]; // email or age
                if (forthParameter.contains("@")) {
                    String email = forthParameter;
                    employee = new Employee(name, salary, position, department, email);
                } else {
                    int age = Integer.parseInt(forthParameter);
                    employee = new Employee(name, salary, position, department, age);
                }
            }

            // object Employee
            // department of the employee to be invalid(non exist)
            if (!departments.containsKey(department)) {
                departments.put(department, new ArrayList<>());
                departments.get(department).add(employee);
            }
            // department of the employee to be valid(exist)
            else {
                departments.get(department).add(employee);
            }
        }

        // department (average salary) -> list of employees
        String maxAverageSalaryDepartment = departments.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> getAverageSalary(entry.getValue())))
                .get() // entry (department -> list of employees)
                .getKey();

        System.out.printf("Highest Average Salary: %s%n", maxAverageSalaryDepartment);
        // list of people with the highest salary
        List<Employee> employeeList = departments.get(maxAverageSalaryDepartment);
        employeeList.sort(Comparator.comparingDouble(employee -> employee.getSalary())); // ascending by salary
        Collections.reverse(employeeList); // descending

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static double getAverageSalary(List<Employee> employees) {
        // total sum of salary divided by number of employees
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }
}




















