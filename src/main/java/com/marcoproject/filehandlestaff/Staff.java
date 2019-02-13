/**
 * @(#)Staff.java
 *
 *
 * @author
 * @version 1.00 2018/7/17
 */
package com.marcoproject.filehandlestaff;

public class Staff {
	private int staffNo;
	private String firstName;
	private String lastName;
	private double salary;

    public Staff() {
    }
    public Staff(int snum, String fname, String lname, double sal){

    	staffNo = snum;
    	firstName =fname;
    	lastName = lname;
    	salary = sal;
    }

    public void setStaffNo(int sn){
    	staffNo = sn;
    }
    public void setFirstName(String fn){
    	firstName = fn;
    }
    public void setLastName(String ln){
    	lastName = ln;
    }
    public void setSalary(double sala){
    	salary = sala;
    }

    public int getStaffNo(){
    	return staffNo;
    }
    public String getFirstName(){
    	return firstName;
    }
    public String getLastName(){
    	return lastName;
    }
    public double getSalary(){
    	return salary;
    }
    public String toString(){
    	String out;
    	return out = String.format("%-20d%-20s%-20s%-20f", staffNo, firstName, lastName, salary);
    }
    public String printTofile(){
    	return staffNo + "@" + firstName + "@" + lastName + "@" + salary;
    }

}