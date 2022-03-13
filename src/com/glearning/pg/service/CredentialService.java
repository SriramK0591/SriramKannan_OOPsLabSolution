package com.glearning.pg.service;
import com.glearning.pg.model.Employee;
import java.io.*;
import java.util.Random;

// Create a Credential Service to generate passwords for the user requests
public final class CredentialService
{
    // Function to generate Email address
    public final String generateEmailAddress(String Firstname, String Lastname, String dept)
    {
        return Firstname + Lastname + "@" + dept + "abc.com";
    }

    // Function to generate password
    public final String generatePassword(int passlength)
    {
        // Generating the password for the required length
        String temp_chr="", temp_num="", temp_spc="";
        String num= "0123456789";
        String chrs="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialchrs="~!@#$%^&*()";
        Random random = new Random();
        // Password is going to be a combination of all.
        // We're going to keep 1 place for special char, 4 for numbers and the rest for chars
        // For rest of chars
        StringBuilder stringBuilder_chr = new StringBuilder();
        StringBuilder stringBuilder_spc = new StringBuilder();
        StringBuilder stringBuilder_num = new StringBuilder();
        for (int i=0;i<passlength-5;i++)
        {
        int ind= random.nextInt(chrs.length());
        stringBuilder_chr.append(chrs.charAt(ind));
        }
        //For special char
        stringBuilder_spc.append(specialchrs.charAt(random.nextInt(specialchrs.length())));
        //For numbers, we are going to get four
        for (int i=0;i<4;i++)
        {
            stringBuilder_num.append(num.charAt(random.nextInt(num.length())));
        }
        StringBuilder result = stringBuilder_chr.append(stringBuilder_spc.append(stringBuilder_num));
        return result.toString();
    }

    public void showCredentials (Employee emp)
    {
     System.out.println("Welcome to the User portal");
     System.out.println("Dear" + " " + emp.getFirstname() + ", " + "your generated credentials are as follows");
     System.out.println("Email --->   " + generateEmailAddress(emp.getFirstname(), emp.getLastname(), emp.getDept_name()));
     System.out.println("password is -->  " + generatePassword(emp.getPasslength()));
    }
}