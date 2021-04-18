package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.service.EmployeeService;

public class Excersice2 {
		
		public static void main(String[] args) {
			EmployeeService obj = new EmployeeService();
			Integer id;
			String name;
			double salary;
			Scanner s = new Scanner(System.in);
			id = s.nextInt();
			name = s.next();
			salary = s.nextDouble();
			obj.empDetails(id, name, salary);
			System.out.println(obj.getDesignation());
			System.out.println(obj.getinsuranceScheme());
			System.out.println(obj.getName() + " " + obj.getSalary() + " " + obj.getId());
			s.close();
		}

}
