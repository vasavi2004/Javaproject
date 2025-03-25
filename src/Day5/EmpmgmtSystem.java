package Day5;
	import java.util.*;
	class Employee {
	    private int id;
	    private String name;
	    private double salary;
	    private String department;
	    public Employee(int id, String name, double salary, String department) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.department = department;
	    }
	    public int getId() { return id; }
	    public String getName() { return name; }
	    public double getSalary() { return salary; }
	    public String getDepartment() { return department; }
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Employee employee = (Employee) obj;
	        return id == employee.id;  
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }
	    @Override
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Salary: $" + salary + ", Dept: " + department;
	    }
	}
	class SalaryComparator implements Comparator<Employee> {
	    @Override
	    public int compare(Employee e1, Employee e2) {
	        return Double.compare(e1.getSalary(), e2.getSalary());
	    }
	}
	class NameComparator implements Comparator<Employee> {
	    @Override
	    public int compare(Employee e1, Employee e2) {
	        return e1.getName().compareTo(e2.getName());
	    }
	}
	public class EmpmgmtSystem {
	    private List<Employee> employeeList = new ArrayList<>();
	    private Set<Employee> employeeSet = new HashSet<>();
	    private Map<String, List<Employee>> departmentMap = new HashMap<>();
	    public void addEmployee(Employee emp) {
	        if (!employeeSet.add(emp)) {
	            System.out.println("Duplicate Employee ID found: " + emp.getId());
	            return;
	        }
	        employeeList.add(emp);
	        departmentMap.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>()).add(emp);
	    }
	    public void displayEmployees() {
	        System.out.println("\nEmployee List:");
	        for (Employee emp : employeeList) {
	            System.out.println(emp);
	        }
	    }
	    public void sortBySalary() {
	        employeeList.sort(new SalaryComparator());
	        System.out.println("\nEmployees Sorted by Salary:");
	        displayEmployees();
	    }
	    public void sortByName() {
	        employeeList.sort(new NameComparator());
	        System.out.println("\nEmployees Sorted by Name:");
	        displayEmployees();
	    }
	    public Employee findEmployeeById(int id) {
	        for (Employee emp : employeeList) {
	            if (emp.getId() == id) {
	                return emp;
	            }
	        }
	        return null;
	    }
	    public void displayEmployeesByDepartment() {
	        System.out.println("\nEmployees by Department:");
	        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
	            System.out.println("Department: " + entry.getKey());
	            for (Employee emp : entry.getValue()) {
	                System.out.println("  " + emp);
	            }
	        }
	    }
	    public static void main(String[] args) {
	        EmpmgmtSystem ems = new EmpmgmtSystem();
	        ems.addEmployee(new Employee(101, "Alice", 60000, "HR"));
	        ems.addEmployee(new Employee(102, "Bob", 55000, "Finance"));
	        ems.addEmployee(new Employee(103, "Charlie", 70000, "IT"));
	        ems.addEmployee(new Employee(104, "David", 50000, "HR"));
	        ems.addEmployee(new Employee(105, "Eve", 80000, "Finance"));
	        ems.addEmployee(new Employee(101, "Duplicate", 60000, "IT")); 
	        ems.displayEmployees();
	        ems.sortBySalary();
	        ems.sortByName();
	        int searchId = 103;
	        Employee foundEmployee = ems.findEmployeeById(searchId);
	        System.out.println("\nSearch Employee by ID (" + searchId + "):");
	        System.out.println(foundEmployee != null ? foundEmployee : "Employee not found!");
	        ems.displayEmployeesByDepartment();
	    }
	}
