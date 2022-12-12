package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

public class AppMain {
	public static void main(String[] args) {
		//entry point
		
		Employee demoEmployee = new Employee("John", "Adam");
		ICredentials credentialsService = new CredentialsService();
	
		System.out.println("Please select the departments from the following options");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();
		
		String generatedEmail = null;
		String generatedPassword = null;
		
		switch(option) {
		case 1: {
			//dept is technical & short form is tech
			generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(), 
					demoEmployee.getLastName().toLowerCase(), "tech");
			generatedPassword = credentialsService.generatePassword();
			break;
		}
		case 2: {
			//dept is Admin & short form is adm
			generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(), 
					demoEmployee.getLastName().toLowerCase(), "adm");
			generatedPassword = credentialsService.generatePassword();
			break;
		}
		case 3: {
			//dept is Human Resource & short form is HR
			generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(), 
					demoEmployee.getLastName().toLowerCase(), "hr");
			generatedPassword = credentialsService.generatePassword();
			break;
}
		case 4: {
			//dept is Legal & short form is LG
			generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(), 
					demoEmployee.getLastName().toLowerCase(), "lg");
			generatedPassword = credentialsService.generatePassword();
			break;
			
			}
		default : {
			System.out.println("Enter a valid department option");
		}
				}
		demoEmployee.setEmail(generatedEmail);
		demoEmployee.setPassword(generatedPassword);
		credentialsService.showCredentials(demoEmployee);
	}
	
}

