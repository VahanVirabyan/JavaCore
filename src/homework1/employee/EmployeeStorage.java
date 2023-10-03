package homework1.employee;

public class EmployeeStorage {
    private Employee[] emp = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == emp.length) {
            extend();
        }
        emp[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(emp[i].getName() + " " + emp[i].getSurname() + " " + emp[i].getEmployeeID() + " " + emp[i].getSalary() + " " + emp[i].getCompany() + " " + emp[i].getPosition());
        }
    }

    public void searchEmployeeID(String keyword) {
        for (int i = 0; i < size; i++) {
            if (emp[i].getEmployeeID().equals(keyword)) {
                System.out.println(emp[i].getName() + " " + emp[i].getSurname() + " " + emp[i].getEmployeeID() + " " + emp[i].getSalary() + " " + emp[i].getCompany() + " " + emp[i].getPosition());
            }
        }
    }
    public void searchCompanyName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (emp[i].getCompany().contains(keyword)) {
                System.out.println(emp[i].getName() + " " + emp[i].getSurname() + " " + emp[i].getEmployeeID() + " " + emp[i].getSalary() + " " + emp[i].getCompany() + " " + emp[i].getPosition());
            }
        }
    }
    private void extend() {
        Employee[] tmp = new Employee[emp.length + 10];
        System.arraycopy(emp, 0, tmp, 0, emp.length);
        emp = tmp;
    }
}
