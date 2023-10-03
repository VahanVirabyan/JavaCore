package homework1.employee;

import homework1.employee.Employee;
import homework1.employee.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 FOR EXIT");
            System.out.println("Please input 1 ADD EMPLOYEE");
            System.out.println("Please input 2 ALL EMPLOYEE");
            System.out.println("Please input 3  BY EMPLOYEE ID");
            System.out.println("Please input 4 COMPANY NAME");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    isRun = false;
                    break;
                case 1:
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
                    break;
                case 2:
                    employeeStorage.print();
                    break;
                case 3:
                    System.out.println("Please input employeeID");
                    String id = scanner.nextLine();
                    employeeStorage.searchEmployeeID(id);
                    break;
                case 4:
                    System.out.println("Please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchCompanyName(companyName);
                    break;
            }
        }
    }
}
