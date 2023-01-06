package com.employee.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.data.entity.Employee;
import com.employee.data.repository.EmployeeRepository;
import com.employee.data.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
    super();
    this.employeeRepository = employeeRepository;

    }
    
    @Override
    public Employee saveEmployee(Employee employee) {        
        return employeeRepository.save(employee);
    }


    
}
