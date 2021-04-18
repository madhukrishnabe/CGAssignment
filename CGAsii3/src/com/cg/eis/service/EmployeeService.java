package com.cg.eis.service;
import com.cg.eis.bean.Employeee;
interface Service{
	public void empDetails(Integer id, String name,double salary);
	public void findScheme();
}


public class EmployeeService extends Employeee implements Service {
	public void empDetails(Integer id, String name,double salary){
		super.setId(id);
		super.setName(name);
		super.setSalary(salary);
		findScheme();
		}
		public void findScheme(){
			StringBuffer insuranceScheme = new StringBuffer();
			StringBuffer designation = new StringBuffer();
			
			if(super.getSalary()>=5000&&super.getSalary()<=20000){
				insuranceScheme.append("Scheme C");
				designation.append("System Associate");
			}
			else if(super.getSalary()>20000&&super.getSalary()<=40000){
				insuranceScheme.append("Scheme B");
				designation.append("Programmer");
			}
			else if(super.getSalary()>40000){
				insuranceScheme.append("Scheme A");
				designation.append("Manager");
			}
			else{
				insuranceScheme.append("NO Scheme");
				designation.append("Clerk");
			}
			super.setinsuranceScheme(insuranceScheme.toString());
			super.setDesignation(designation.toString());
		}
	}
