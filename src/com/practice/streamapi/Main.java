package com.practice.streamapi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {

        employeeList.add(new Employee("Amit Panda", 10000));
        employeeList.add(new Employee("Neil Bohr", 20000));
        employeeList.add(new Employee("Thomas Edison", 30000));
        employeeList.add(new Employee("Albin Joseph", 40000));
        employeeList.add(new Employee("Anand", 50000));

        method1();
        method2();
    }

    public static void method1() {
        System.out.println("\nQ1. To find the employee's salary whose salary is less than or equal to 20k from the employee list");
        employeeList.stream().filter(employee -> employee.getSalary() <= 20000).map(Employee::getName).forEach(System.out::println);
    }

    public static void method2() {
        System.out.println("\nQ2. Convert the lowercase name in employee list to uppercase");
        employeeList.stream().map(employee -> employee.getName().toUpperCase()).forEach(System.out::println);
    }
}