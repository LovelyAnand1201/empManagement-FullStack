package com.project.employee;

import java.util.List;

// import com.project.employee.Employee;

public interface EmpService {
    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    Employee readEmployee(Long id);
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id, Employee employee);

}
