package org.emp;

public class Employee {  //class
	
	private void emplyeeID() {
	
		System.out.println("145678");

	}
	private void emplyeeName() {
		System.out.println("Usha");

		}
	private void emplyeeDob() {
		System.out.println("07/06/1994");

		}
	private void emplyeePhone() {
		System.out.println("0123467893");

		}
	private void emplyeeEmail() {
		System.out.println("usha79@gmail.com");

		}
	private void emplyeeaddress() {
		System.out.println("thiruvanmiyur");

		}
public static void main (String[]args) {
	Employee emp = new Employee();
	emp.emplyeeID();
	emp.emplyeeName();
	emp.emplyeeDob();
	emp.emplyeePhone();
	emp.emplyeeEmail();
	emp.emplyeeaddress();
	
}
}
