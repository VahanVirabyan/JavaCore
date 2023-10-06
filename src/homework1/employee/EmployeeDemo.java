package homework1.employee;

import homework1.employee.Employee;
import homework1.employee.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();
    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    isRun = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    employeeStorage.print();
                    break;
                case 3:
                    printAllBook();
                    break;
                case 4:
                    printCompanyName();
                    break;
            }
        }
    }

    private static void printCompanyName() {
        System.out.println("Please input company name");
        String companyName = scanner.nextLine();
        employeeStorage.searchCompanyName(companyName);
    }

    private static void printAllBook() {
        System.out.println("Please input employeeID");
        String id = scanner.nextLine();
        employeeStorage.searchEmployeeID(id);
    }

    private static void addBook() {
        System.out.println("Please input employee name");
        String name = scanner.nextLine();
        System.out.println("Please input employee surname");
        String surname = scanner.nextLine();
        System.out.println("Please input employee ID");
        String employeeID = scanner.nextLine();
        System.out.println("Please input employee salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input company name ");
        String company = scanner.nextLine();
        System.out.println("Please input position ");
        String position = scanner.nextLine();
        Employee employee = new Employee(name, surname, employeeID,salary,
                company,position);
        employeeStorage.add(employee);
        System.out.println("Employee already created");
    }

    private static void printCommands() {
        System.out.println("Please input 0 FOR EXIT");
        System.out.println("Please input 1 ADD EMPLOYEE");
        System.out.println("Please input 2 ALL EMPLOYEE");
        System.out.println("Please input 3  BY EMPLOYEE ID");
        System.out.println("Please input 4 COMPANY NAME");
    }
}
