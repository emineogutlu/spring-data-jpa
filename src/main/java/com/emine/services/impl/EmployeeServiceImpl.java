package com.emine.services.impl;

import com.emine.dto.DtoDepartment;
import com.emine.dto.DtoEmployee;
import com.emine.entities.Employee;
import com.emine.repository.EmployeeRepository;
import com.emine.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements IEmployeeService {

 @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<DtoEmployee> findAllEmployees() {
        List<DtoEmployee> dtoEmployeeList = new ArrayList<>();

       List<Employee>emplpoyeeList=employeeRepository.findAll();
       if(emplpoyeeList!=null &&!emplpoyeeList.isEmpty()){
           for(Employee employee:emplpoyeeList){

               DtoEmployee dtoEmployee=new DtoEmployee();
               BeanUtils.copyProperties(employee,dtoEmployee);
               dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),
                       employee.getDepartment().getDepartmentName()));

               dtoEmployeeList.add(dtoEmployee);
            }
       }
        return dtoEmployeeList;
    }
}
