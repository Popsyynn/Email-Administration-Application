package emailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String department;
	private String password;
	private String email;
	private String altEmail;
	
	public Email(String firstname , String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email Creation for " + this.firstname + " " + this.lastname);
		
		this.department = setDepartment();
		System.out.println("Department : " + this.department);
		
		this.password = setPassword(10);
		System.out.println("Your password is : " + this.password);
		
		email = this.firstname.toLowerCase() +"."+this.lastname.toLowerCase()+"@"+this.department+"."+"company.com";
		System.out.println("Your email address is: " + email);
		
	}
	
	
	//setting the department
		public String setDepartment() {
		System.out.print("Enter the department: \nDepartment codes \n1 Marketing \n2 Sales \n3 Account \n4 HR");
		System.out.print("\nSelect : ");
		Scanner sc = new Scanner(System.in);
		int deptChoice = sc.nextInt();
		if(deptChoice==1) 
		{
			return "marketing";}
		else if(deptChoice ==2) {
			return "sales";}
		else if(deptChoice ==3) {
			return "account";}
		else if(deptChoice==4){
			return "HR";}
		else {return "";}
		
		
		
		
		
	
}
	//setting the password
		@SuppressWarnings("unused")
		private String setPassword(int length) {
			String passwordSet = "abcdefghijklmnopqrstuvwxyz0123456789";
			char[] password = new char[length];
			for(int i=0;i<length;i++) {
				int rand = (int)(Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return new String(password);
		}
	
		
		
		public void setAlternateEmail(String altmail) {
			this.altEmail = altmail;
		}
		
		public void changePassword(String password) {
			this.password=password;
		}
		
	
		public String getAlternateEmail() {
			return altEmail;
		}
		public String getPassword() {
			return password;
		}


		public void showInfo() {
			System.out.println("Diplay Information");
			System.out.println("Name : "+ this.firstname +" " + this.lastname);
			System.out.println("Department: " + this.department);
			System.out.println("Password : "+ this.password);
			System.out.println("Email address : "+ this.email);
		}
}