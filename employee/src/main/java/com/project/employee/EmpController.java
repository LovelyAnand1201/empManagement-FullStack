package com.project.employee;

import org.springframework.web.bind.annotation.RestController;

// import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;

// employ
@RestController
@CrossOrigin("http://localhost:3000/")
public class EmpController {
    
    //EmployeeSerivce employeeSerivce = new EmployeeSerivceImpl();
    //Dependcy Injection
    @Autowired
    EmpService empService;

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return empService.readEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee getAllEmployee(@PathVariable Long id) {
        return empService.readEmployee(id);
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        //employees.add(employee);
        return empService.createEmployee(employee);
        
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(empService.deleteEmployee(id))
            return "Delete Succesfully";
        return "Not found";
    }

    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
        return empService.updateEmployee(id, employee);
    }
    
    
}
