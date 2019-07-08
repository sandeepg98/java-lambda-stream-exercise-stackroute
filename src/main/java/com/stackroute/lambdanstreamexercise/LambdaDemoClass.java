package com.stackroute.lambdanstreamexercise;

import java.util.ArrayList;

public class LambdaDemoClass {
    public static void main(String[] args)
    {
        //a list of object employee class
        ArrayList<Employee> employeeList=new ArrayList<>();

        //adding data to the array list
        employeeList.add(new Employee(23,"Utkarsh","Anand"));
        employeeList.add(new Employee(25,"John","Hennry"));
        employeeList.add(new Employee(21,"Sandeep","Grover"));
        employeeList.add(new Employee(24,"Robert","Clove"));

        System.out.println("After Sorting the student data by Name:");
        //Lambda expression for sorting the list by student last name
        employeeList.sort((Employee e1, Employee e2)->e1.getLastName().compareTo(e2.getLastName()));
        employeeList.forEach((e)->System.out.println(e));

        System.out.println("\n");
        employeeList.stream().filter(emp->emp.getLastName().startsWith("C")).forEach((e)->System.out.println(e));

    }
}
