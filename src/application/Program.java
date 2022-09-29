package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d%n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            for (Employee employee : employees) {
                if (employee.getId().equals(id)) {
                    System.out.println("This id already exists!");
                }
            }
            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee employee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        try{
            if(!(employee.getId() == null)) {
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();
                employee.increaseSalary(percentage);
            }
        } catch (Exception e){
                System.out.println("This id does not exist!");
        }

        System.out.println("\nList of emplooyees: ");
        for (Employee emp1 : employees) {
            System.out.println(emp1);
        }
            sc.close();
    }
}
