package com.zaurtregulov.spring.rest;


import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        // получаем список работников
//        List<Employee> employees = communication.getAllEmployees();
//        System.out.println(employees);

//        // получаем работника по id
//        Employee employee = communication.getEmployee(2);
//        System.out.println(employee);

//        // сохраняем нового работника
//        Employee employee = new Employee("Sveta", "Solovieva", "HR", 900);
//        communication.saveEmployee(employee);

//        // изменяем работника
//        Employee employee = communication.getEmployee(17);
//        System.out.println(employee);
//        employee.setSalary(1200);
//        communication.saveEmployee(employee);
//        System.out.println(employee);

          // удаление работника
//        communication.deleteEmployee(17);
    }
}
