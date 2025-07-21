package com.emine.controller;

import com.emine.dto.DtoCustomer;

public interface ICustomerController {
    public DtoCustomer findCustomerById(Long id);
}

