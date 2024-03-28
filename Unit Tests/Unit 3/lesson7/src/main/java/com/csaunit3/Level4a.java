package com.csaunit3;

public class Level4a {
    public static void main(String[] args) {
        
        Employee first = new Employee("Ellis", 40000);
        Manager second = new Manager("Kristina", 45000, 2000);
        Employee third = new Employee("Daphne", 50000);
        Manager fourth = new Manager("David", 50000, 5000);

        // TO DO #2: Create an Employee array containing the Employee objects.
        Employee[] employeeList = {first, second, third, fourth};

        // TO DO #3: Instantiate a Business object with the Employee array
        // and call the printEmployees() method.
        Business myBusiness = new Business(employeeList);
        System.out.println(myBusiness.getEmployeeInfo());
        
    }
}