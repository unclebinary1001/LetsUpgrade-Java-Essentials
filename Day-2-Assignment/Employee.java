
package com.employee;

public class Employee
{
    String name;
    int age;
    String city;
    
    
    public void display() {
        System.out.println("The name is " + this.name);
        System.out.println("The age is " + this.age);
        System.out.println("The city is " + this.city);
    }
    public static void main(final String[] args) {
        Employee e1 = new Employee();
        e1.name = "Saurab";
	e1.age = 23;
	e1.city = "chennai";
        e1.display();
    }
}
