package com.test.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorLambdaForObjects {

	public static void main(String[] args) {

		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(20, "shashi"));
		al.add(new Employee(05, "vinnu"));
		al.add(new Employee(8, "riki"));
		System.out.println(al.toString());
		
		
		List<Employee> al1=new ArrayList<>();
		al1.add(new Employee(20, "shashi1"));
		al1.add(new Employee(05, "vinnu1"));
		al1.add(new Employee(8, "riki1"));
		System.out.println(al1.toString());
		
		
		Collections.sort(al1,(e1,e2)->((e1.empId)<(e2.empId))?-1:((e1.empId)>(e2.empId))?1:0);
		System.out.println(al1.toString());
		
		
	}
}

class Employee{
	Integer empId;
	String empName;
	
	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
}
