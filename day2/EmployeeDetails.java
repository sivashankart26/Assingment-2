package week1.day2;

public class EmployeeDetails {
	public void employee() {
		String empName = "Siva";
		System.out.println("The employee name is "+ empName);
		int empID = 234423;
		System.out.println("The employee ID is "+ empID);
	}
	public void employeeaddress() {
		String empAddress = "Kanyakumari";
		System.out.println("Address: "+ empAddress);
	}
	public void employeesalary() {
		double empSalary = 53210.26;
		System.out.println("Salary : "+ empSalary);
		
	}
	public void employeenumber() {
		long phno = 9876543210L;
		System.out.println("Phone Number :" + phno);
	}
	public static void main(String[] args) {
		EmployeeDetails details = new EmployeeDetails() ;
		details.employee();
		details.employeeaddress();
		details.employeenumber();
		details.employeesalary();
		}
		
		
	}


