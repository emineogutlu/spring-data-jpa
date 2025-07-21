package com.emine.services.impl;

import com.emine.dto.DtoAddress;
import com.emine.dto.DtoCustomer;
import com.emine.entities.Address;
import com.emine.entities.Customer;
import com.emine.repository.CustomerRepository;
import com.emine.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public DtoCustomer findCustomerById(Long id) {
        DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAddress dtoAddress = new DtoAddress();

        Optional<Customer> optional =customerRepository.findById(id);
       if(optional.isEmpty()){
       return null;
       }
       Customer customer = optional.get();
       Address address = optional.get().getAddress();
       BeanUtils.copyProperties(customer, dtoCustomer);
       BeanUtils.copyProperties(address, dtoAddress);
        dtoCustomer.setAddress(dtoAddress);

        return dtoCustomer;
    }





}
