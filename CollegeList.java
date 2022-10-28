package PrelimTP;

import java.util.*;

public class CollegeList {
	public static void main(String[] args) {
		Scanner wew = new Scanner(System.in);
		
		Person person = new Person();
		Employee employee = new Employee();
		Faculty faculty = new Faculty();
		
		System.out.print("Press 'E' for Employee, 'F' for Faculty, and 'S 'for Student: ");
		
		String wan = wew.next(); 
		
		while(true){
			 if (wan.equalsIgnoreCase("E")) {
				 
			 
			 System.out.println("Type Employee's name, contact number, salary and department. \nPress Enter after every input");
			 
			 person.setName(wew.next());
			 
			 person.setContactNum(wew.next());
			 
			 employee.setSalary(wew.nextDouble());
			 
			 employee.setDepartment(wew.nextLine());
			 System.out.println("----------------------------------------------------------------------------");
			 
			 System.out.println("Name: " + person.getName() + "\nContact Number: " + person.getContactNum() + "\nSalary: " + employee.getSalary() + "\nDepartment: " + employee.getDepartment());
			 break;
			 }else if (wan.equalsIgnoreCase("F")){ 
			 
				 System.out.println("Press 'Y' if the faculty member is regular/tenured or 'N' if not: ");
				 String ten = wew.next();
				 
				 while(true){
					 if (faculty.isRegular() == ten.equalsIgnoreCase("Y")){
						 
					 
					 System.out.println("Type faculty's name, contact number, salary and department. \nPressEnter after every input");
					 person.setName(wew.next());
					 
					 person.setContactNum(wew.next());
					 
					 employee.setSalary(wew.nextDouble());
					 
					 employee.setDepartment(wew.nextLine());
					 
					 System.out.println("----------------------------------------------------------------------------");
					 System.out.println("Name: " + person.getName() + "\nContact Number: " + person.getContactNum() + "\nSalary: " + employee.getSalary() + "\nDepartment: " + employee.getDepartment()+ "\nStatus: Regular");
					 break;
					 
					 }
					 
					 else if(faculty.isRegular() == ten.equalsIgnoreCase("N")){
					 System.out.println("Type faculty's name, contact number, salary and department. \nPress Enter after every input");
					 person.setName(wew.nextLine());
					 
					 person.setContactNum(wew.nextLine());
					 
					 employee.setSalary(wew.nextDouble());
					 wew.nextLine();
					 
					 employee.setDepartment(wew.nextLine());
					 System.out.println("----------------------------------------------------------------------------");
					 System.out.println("Name: " + person.getName() + "\nContact Number: " + person.getContactNum() +"\nSalary: " + employee.getSalary() + "\nDepartment: " + employee.getDepartment()+ "\nStatus: Not Regular");
					 break;
					 }
				 }	 
			 }	 
		}
	}
}

