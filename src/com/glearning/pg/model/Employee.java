package com.glearning.pg.model;

public class Employee {

    /** Declaring the employee attributes
     *  First name, Last name, Department name
     */
   private String firstname;
   private String lastname;
   private String Dept_name;
   private int passlength;

   // setting the contructor
    public Employee(String firstname, String lastname, String dept_name, int passlength) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.Dept_name = dept_name;
        this.passlength=passlength;
    }

   // setting the getters and setters for all attributes

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDept_name() {
        return Dept_name;
    }

    public void setDept_name(String dept_name) {
        Dept_name = dept_name;
    }
    public int getPasslength()
    {
        return passlength;
    }
    public void setPasslength(int passlength)
    {
        this.passlength=passlength;
    }
}
