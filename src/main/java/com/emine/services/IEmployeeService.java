package com.emine.services;

import com.emine.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeService {
    public List<DtoEmployee>findAllEmployees();
}
