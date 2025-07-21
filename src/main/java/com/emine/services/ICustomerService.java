package com.emine.services;

import com.emine.controller.ICustomerController;
import com.emine.dto.DtoCustomer;

public interface ICustomerService  {
    public DtoCustomer findCustomerById(Long id);
}
