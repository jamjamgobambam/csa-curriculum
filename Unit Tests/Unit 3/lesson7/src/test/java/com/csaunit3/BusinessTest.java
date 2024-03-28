package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("BusinessName.java Test")
public class BusinessTest {
    
    Employee first = new Employee("Ellis", 40000);
    Manager second = new Manager("Kristina", 45000, 2000);
    Employee third = new Employee("Daphne", 50000);
    Manager fourth = new Manager("David", 50000, 5000);
    Employee[] employeeList = {first, second, third, fourth};
    String message;

    @Test
    @Order(1)
    @DisplayName("Return a String containing each employee's name and salary => ")
    public void testGetEmployeeInfo() {
        message = "Business getEmployeeInfo() does not return a String containing each employee's name and salary.";
        message += "\n        Traverse the \"employees\" array and concatenate each name and salary to the \"result\".";
        message += "\n       ";

        String expected = getExpectedEmployeeInfo();
        Business myBusiness = new Business(employeeList);
        String actual = myBusiness.getEmployeeInfo();

        assertEquals(expected, actual, message);
    }

    private String getExpectedEmployeeInfo() {
        String result = "";

        for (Employee employee : employeeList) {
            result += employee.getName() + ": " + employee.getSalary() + "\n";
        }

        return result;
    }
}