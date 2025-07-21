package com.emine.services;

import com.emine.dto.DtoAddress;

public interface IAddressService {
    public DtoAddress findAddressById(Long id);
}
