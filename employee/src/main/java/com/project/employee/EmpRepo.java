package com.project.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import java.util.List;


@Repository
public interface EmpRepo extends JpaRepository<EmployeeEntity, Long> {
    //cutom method
    //List<EmployeeEntity> findByName(String name);
    //save, delete, finbyId , findall
}
