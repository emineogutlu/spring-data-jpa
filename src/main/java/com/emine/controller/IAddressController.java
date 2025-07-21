package com.emine.controller;

import com.emine.dto.DtoAddress;

public interface IAddressController {
    public DtoAddress findAddressById(Long id);
}
