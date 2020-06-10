package com.sow.java8Featr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaAsObjectEx {
	
	Integer id;
	Integer salary;
	String name;
	String dept;

	public LambdaAsObjectEx(Integer id, Integer salary, String name, String dept) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.dept = dept;
	}

	public static void main(String a[]) {

		List<LambdaAsObjectEx> empList = new ArrayList<LambdaAsObjectEx>();
		empList.add(new LambdaAsObjectEx(1, 8000, "Accounts", "Nataraja G"));
		empList.add(new LambdaAsObjectEx(2, 15000, "Admin", "Nagesh Y"));
		empList.add(new LambdaAsObjectEx(3, 2500, "Security", "Vasu V"));
		empList.add(new LambdaAsObjectEx(7, 8500, "Entertainment", "Amar"));

		LambdaAsObjectEx.sortInLambdaWay(empList);
	}

	public static void sortInLambdaWay(List<LambdaAsObjectEx> empList) {

		Comparator<LambdaAsObjectEx> cmpDesc = (LambdaAsObjectEx e1, LambdaAsObjectEx e2) -> e2.getSalary().compareTo(e1.getSalary());

		Collections.sort(empList, cmpDesc);

		System.out.println("<--- Sorted list with Lambda - DESC order --->");
		empList.forEach(emp -> System.out.println(emp.toString()));

		Comparator<LambdaAsObjectEx> cmpAsc = (LambdaAsObjectEx e1, LambdaAsObjectEx e2) -> e1.getSalary().compareTo(e2.getSalary());
		Collections.sort(empList, cmpAsc);

		System.out.println("\n\n<--- Sorted list with Lambda - ASC order --->");
		empList.forEach(emp -> System.out.println(emp.toString()));
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LambdaAsObjectEx [id=" + id + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
	}
}