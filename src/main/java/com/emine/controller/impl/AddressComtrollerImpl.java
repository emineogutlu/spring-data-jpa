package com.emine.controller.impl;

import com.emine.controller.IAddressController;
import com.emine.dto.DtoAddress;
import com.emine.services.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/address")
public class AddressComtrollerImpl implements IAddressController {
@Autowired
private IAddressService addressService;
    @GetMapping(path = "/list/{id}")
    @Override
    public DtoAddress findAddressById(@PathVariable(name="id") Long id) {
        return addressService.findAddressById(id);
    }
}
