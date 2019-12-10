package emailapp;

import java.util.Scanner;

public class email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 1000;
	private String alternateEmail ;
	private String schoolSuffix = "shu.edu";
	private String email;
	// make first and last name 
	public email(String firstName, String lastName) {
		this .firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		//Call a methd ask for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
	
		//Call a method that returns a random passowrd
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
		//combine elements to generate email
		email = firstName. toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + schoolSuffix;
		System.out.print("Your email is : " + email);
	}
	private String randomPassword(int defaultPasswordLength2) {
		// TODO Auto-generated method stub
		return null;
	}
	//get a random password
	private String randomPassowrd(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand  = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			System.out.println(rand);
			System.out.println(passwordSet.charAt(rand));
			
		}
		return new String(password);
		
				
	}
	
	// Ask for department
	private String setDepartment() {
	System.out.println("Department Code\n1 for Registrar\n2 for finance\n3 for Accounting\n0 for none\nEnter department code:");
	Scanner in = new Scanner(System.in);
	int depChoice = in.nextInt();
	if  (depChoice == 1) {return "reg";}
	else if (depChoice == 2) {return"fin";}
	else if (depChoice == 3) {return "acct";}	
	else {return "";}

	}
	//set the mailbox capacity
	public void SetMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	
	//set an alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
		
	}
	public int getMailboxCapacity() { return mailboxCapacity;}
	public String getAlternateEmail() { return alternateEmail;}
	public String getPassword() { return password; }
	
	//Shows the users info
	public String showInfo() {
	return "Display Name:" + firstName + " " + lastName + 
			"Company Email: " + email + 
			"Mailbox Capacity: " + mailboxCapacity + "mb";
	}
	
}
