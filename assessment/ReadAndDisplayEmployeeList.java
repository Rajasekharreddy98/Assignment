package assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadAndDisplayEmployeeList {
	public static void main(String[] args) {
		System.out.println("Enter Employee Details Below:");
		List<Employee> empList = new ArrayList<Employee>();
		try (Scanner sc = new Scanner(System.in)) {
			String promptToContinue;
			do {
				Employee emp = new Employee();

				System.out.println("Enter Employee Name:");
				emp.setName(sc.next());
				
				System.out.println("Enter Sap ID:");
				emp.setSap_id(sc.nextInt());

				System.out.println("Enter Employee Age:");
				emp.setAge(sc.nextInt());

				System.out.println("Enter Employee Designation:");
				emp.setDesignation(sc.next());

				empList.add(emp);

				System.out.println("Do you want to enter employee again?(yes/no)");
				promptToContinue = sc.next();
			} while ("yes".equals(promptToContinue));

		}

		System.out.println("Displaying Entered Employee List(Before Sorting)::");
		System.out.println("=======\t======\t======\t==========");
		System.out.println("Name\tsap_id\tAge\tDesignation");
		System.out.println("=======\t======\t======\t==========");

		for (Employee emp : empList) {
			System.out.println(
					emp.getName() + "\t" + emp.getSap_id() + "\t" + emp.getAge() + "\t" + emp.getDesignation());
		}

		Collections.sort(empList, new EmployeeNameComparator());

		System.out.println("=======\t======\t======\t==========");
		System.out.println();
		System.out.println("Displaying Entered Employee List(After Sorting)::");
		System.out.println("=======\t======\t======\t==========");
		System.out.println("Name\tsap_id\tAge\tDesignation");
		System.out.println("=======\t======\t======\t==========");

		for (Employee emp : empList) {
			System.out.println(
					emp.getName() + "\t" + emp.getSap_id() + "\t" + emp.getAge() + "\t" + emp.getDesignation());
		}

	}
}
