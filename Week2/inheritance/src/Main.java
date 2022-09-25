public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.add();
        employeeManager.list();
        employeeManager.bestEmployee();

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.list();


    }
}