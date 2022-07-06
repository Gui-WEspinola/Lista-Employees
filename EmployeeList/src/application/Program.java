package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> listEmployees = new ArrayList<>();
        Employee employee;

        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d:%n", i + 1);
            System.out.print("Id: ");
            int id = scanner.nextInt();

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employee = new Employee(id, name, salary);
            listEmployees.add(employee);
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();
        Integer idPosition = searchId(listEmployees, id);

        if (idPosition == null){
            System.out.println("This ID does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            listEmployees.get(idPosition).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of Employees:");
        for (Employee obj : listEmployees) {
            System.out.println(obj);
        }
        scanner.close();
    }

    public static Integer searchId(List<Employee> employeeList, int id){
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}





