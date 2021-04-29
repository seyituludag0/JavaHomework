public class Main {
    public static void main (String[] args){

        Customer customer = new Customer();
        customer.firstName = "Burak";

        Employee employee = new Employee();
        employee.firstName = "Seyit";

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.BestEmployee();

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();



    }
}
