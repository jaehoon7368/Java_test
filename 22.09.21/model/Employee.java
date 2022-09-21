package com.sh.oop.model;

import java.util.Scanner;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bounsPoint;
	private String phone;
	private String address;
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getJob() {
		return job;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setBounsPoint(double bounsPoint) {
		this.bounsPoint = bounsPoint;
	}
	public double getBonusPoint() {
		return bounsPoint;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getphone() {
		return phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void empInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번 : ");
		empNo = sc.nextInt();
		setEmpNo(empNo);
	
		System.out.print("이름 : ");
		empName = sc.next();
		setEmpName(empName);
				
		System.out.print("소속부서 : ");
		dept = sc.next();
		setDept(dept);
		
		System.out.print("직급 : ");
		job = sc.next();
		setJob(job);
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		setAge(age);
		
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		setGender(gender);
		
		System.out.print("급여 : ");
		salary = sc.nextInt();
		setSalary(salary);
		
		System.out.print("보너스포인트 : ");
		bounsPoint = sc.nextDouble();
		setBounsPoint(bounsPoint);
		
		System.out.print("핸드폰 : ");
		phone = sc.next();
		setPhone(phone);
		
		System.out.print("주소 : ");
		address = sc.next();
		setAddress(address);
		
		
		System.out.println("입력이 완료되었습니다.");
		
	}
	
	public void empOutput() {
		
		
		System.out.println("사번 : " + getEmpNo());
		System.out.println("이름 : " + getEmpName());
		System.out.println("소속부서 : " + getDept());
		System.out.println("직급 : " + getJob());
		System.out.println("나이 : " + getAge());
		System.out.println("성별 : " + getGender());
		System.out.println("급여 : " + getSalary());
		System.out.println("보너스포인트 : " + getBonusPoint());
		System.out.println("핸드폰 : " + getphone());
		System.out.println("주소 : " + getAddress());
	}
}
