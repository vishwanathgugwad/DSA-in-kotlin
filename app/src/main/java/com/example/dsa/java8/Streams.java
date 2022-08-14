package com.example.dsa.java8;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {

        List<Employees> employeeList = new ArrayList<>();
        Employees employee1 = new Employees("jack",25,50000);
        Employees employee2 = new Employees("joe",24,150000);
        Employees employee3 = new Employees("tom",60,25000);
        Employees employee4 = new Employees("augustin",20,90000);
        Employees employee5 = new Employees("henry",35,500000);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        System.out.println(employeeList);

        List<Employees> incrementedSalaries = employeeList.stream().map(employees -> {
            if (employees.getAge()>25){
                employees.setSalary(employees.getSalary() * 1.10);
            }
            return employees;
        }).collect(Collectors.toList());

        System.out.println(incrementedSalaries);
    }
public static boolean gg(){
        return true;
}
}
