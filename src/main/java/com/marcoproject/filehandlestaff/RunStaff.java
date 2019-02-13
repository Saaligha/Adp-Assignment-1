/**
 * @(#)RunStaff.java
 *
 *
 * @author
 * @version .00 2018/7/17
 */
package com.marcoproject.filehandlestaff;
import java.util.*;
import javax.swing.*;
import java.io.*;


public class RunStaff {
	///////////////////////Version 1///////////////////////
	BufferedReader br;

	public void RunStaff(){
	try{
  	 	br = new BufferedReader(new FileReader("StaffData.txt"));
    		String ln;
	  	    while((ln = br.readLine()) != null){
	  	    	System.out.println(ln);
	  	    }
	}
  	    catch(Exception e){
   	 		e.getMessage();
  	    }
  	    try{
    		br.close();
  		}
    	catch(Exception e){
   	 		e.getMessage();
  		}
    }


  	///////////////////////Version 2///////////////////////

  	public void RunStaffV2(){
	  	try{
	  	 	br = new BufferedReader(new FileReader("StaffData.txt"));
	    		//String ln= br.readLine();
	    		String ln;
		  	    while((ln= br.readLine()) != null){
		  	    	StringTokenizer token = new StringTokenizer(ln,"#");

		  	    	int staffN = Integer.parseInt(token.nextToken());
		  	    	String name = token.nextToken();
		  	    	String lname = token.nextToken();
		  	    	double sal = Double.parseDouble(token.nextToken());

		  	    	Staff staff = new Staff(staffN, name, lname, sal);

		  	    	System.out.println(staff.toString());
		  	    }

		}
	  	catch(Exception e){
	   	 	e.getMessage();
	  	}
	  	try{
    		br.close();
  		}
    	catch(Exception e){
   	 		e.getMessage();
  		}
    }

    ///////////////////////Version 3///////////////////////
  	public void RunStaffV3(){
  	ArrayList<Staff> list = new ArrayList<Staff>();
  	try{
	  	 	br = new BufferedReader(new FileReader("StaffData.txt"));

	    		String ln;
		  	    while((ln= br.readLine()) != null){
		  	    	StringTokenizer token = new StringTokenizer(ln,"#");

		  	    	int staffN = Integer.parseInt(token.nextToken());
		  	    	String name = token.nextToken();
		  	    	String lname = token.nextToken();
		  	    	double sal = Double.parseDouble(token.nextToken());

		  	    	Staff staff = new Staff(staffN, name, lname, sal);

		  	    	list.add(staff);
		  	    }

		  	    for(int i = 0; i<list.size();i++){
		  	    	System.out.println(list.get(i).toString());
		  	    }

	}
	catch(Exception e){
	   	 e.getMessage();
	}

	try{
    	br.close();
  	}
    catch(Exception e){
   	 	e.getMessage();
  	}
  	}

  	///////////////////////Version 4///////////////////////

	public void RunStaffV4(){

  	ArrayList<Staff> list = new ArrayList<Staff>();
  	try{
	  	 	br = new BufferedReader(new FileReader("StaffData.txt"));
	  	 	FileWriter fw = new FileWriter("StaffSalary.txt");
	  	 	FileWriter fw1 = new FileWriter("FormatedStaff.txt");

			BufferedWriter bw = new BufferedWriter(fw);
	  	 	BufferedWriter bw1 = new BufferedWriter(fw1);



	    		String ln;
		  	    while((ln= br.readLine()) != null){
		  	    	StringTokenizer token = new StringTokenizer(ln,"#");

		  	    	int staffN = Integer.parseInt(token.nextToken());
		  	    	String name = token.nextToken();
		  	    	String lname = token.nextToken();
		  	    	double sal = Double.parseDouble(token.nextToken());

		  	    	Staff staff = new Staff(staffN, name, lname, sal);

		  	    	list.add(staff);
		  	    }
				String out = String.format("%-20s%-20s%-20s%-20s", "StaffNum", "First Name", "Last Name", "Salary");

					bw1.write(out);
					bw1.newLine();
		  	    	for(int i = 0; i<list.size();i++){
		  	    		if(list.get(i).getSalary() > 50000.00){
		  	    			bw.write(list.get(i).printTofile());
		  	    			bw1.write(list.get(i).toString());
		  	    			bw.newLine();
		  	    			bw1.newLine();

		  	    		}

		  	    	}
			bw.close();
			bw1.close();


	}
	catch(Exception e){
	   	 e.getMessage();
	}
	try{
    	br.close();

  	}
    catch(Exception e){
   	 	e.getMessage();
  	}

  	}



    public static void main(String[] args){
    	RunStaff run = new RunStaff();
    	//run.RunStaff();
    	//run.RunStaffV2();
    	//run.RunStaffV3();
    	run.RunStaffV4();
    }

}