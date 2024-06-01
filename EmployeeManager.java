package CollectionPractice;
import java.util.*;
public class EmployeeManager 
{
	private Map<Integer, Employee> employeeMap = new HashMap<>();
	
	public void addEmployee(Employee employee) 
	{
		employeeMap.put(employee.getId(), employee);
	}
	public Employee getEmployee(int id) 
	{
		return employeeMap.get(id);
	}
	public void removeEmployee(int id) 
	{
        employeeMap.remove(id);
    }

    public void updateEmployee(Employee employee) 
    {
        employeeMap.put(employee.getId(), employee);
    }
    public void displayAllEmployees() 
    {
        for (Employee employee : employeeMap.values()) 
        {
            System.out.println(employee);
        }
    }
    
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Adding employees
        Employee emp1 = new Employee(1, "Alice", "Engineering", 75000);
        Employee emp2 = new Employee(2, "Bob", "HR", 55000);
        Employee emp3 = new Employee(3, "Charlie", "Marketing", 60000);

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);

        // Display all employees
        System.out.println("All Employees:");
        manager.displayAllEmployees();

        // Get and display a specific employee
        System.out.println("\nGet Employee with ID 2:");
        System.out.println(manager.getEmployee(2));

        // Update an employee
        Employee emp2Updated = new Employee(2, "Bob", "HR", 58000);
        manager.updateEmployee(emp2Updated);

        System.out.println("\nUpdated Employee with ID 2:");
        System.out.println(manager.getEmployee(2));

        // Remove an employee
        manager.removeEmployee(3);

        System.out.println("\nAll Employees after removing Employee with ID 3:");
        manager.displayAllEmployees();
    }
}