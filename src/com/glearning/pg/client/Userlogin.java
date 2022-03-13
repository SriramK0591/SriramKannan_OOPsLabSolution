package com.glearning.pg.client;
import com.glearning.pg.model.Employee;
import java.util.Scanner;
import com.glearning.pg.service.CredentialService;

// Main userlogin class to generate the password for an employee
public class Userlogin {
    public static void main (String[] args)
    {
        // Get the firstname, lastname and department of an employee
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name");
        String firstname = sc.next();
        System.out.println("Enter your Last name");
        String lastname = sc.next();
        System.out.println("Enter your department number from below");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        int dept = sc.nextInt();
        // Checking if the entered department is a valid number
        if (dept <1 || dept > 4) {
            throw new RuntimeException("Enter the valid department");
        }
        System.out.println("Enter your required password length");
        int passlen = sc.nextInt();
        // To make the password stronger, we are going to have a minimum of length 8
        // also, we will get the combination of char, number and special chars to make it stronger
        // checking for length greater or equal to 8, else raise exception
        if (passlen < 8 || passlen > 20)
        { throw new RuntimeException("Expected password length is more than 8 and less than 20.");
        }
        switch(dept)
        {
            case 1:
                Employee emp=new Employee(firstname, lastname, "Technical",passlen);
                CredentialService showCred_tech = new CredentialService();
                showCred_tech.showCredentials(emp);
                break;
            case 2:
                Employee emp1=new Employee(firstname, lastname, "Admin",passlen);
                CredentialService showCred_ad = new CredentialService();
                showCred_ad.showCredentials(emp1);
                break;
            case 3:
                Employee emp2=new Employee(firstname, lastname, "Human Resource",passlen);
                CredentialService showCred_hr = new CredentialService();
                showCred_hr.showCredentials(emp2);
                break;
            case 4:
                Employee emp3=new Employee(firstname, lastname, "Legal",passlen);
                CredentialService showCred_leg = new CredentialService();
                showCred_leg.showCredentials(emp3);
                break;
            default:System.out.println("Please enter the valid department");
        }
        sc.close();
    }
}
