package com.addressmicroservice.addressmicroservice.controller;


import com.addressmicroservice.addressmicroservice.entity.Address;
import com.addressmicroservice.addressmicroservice.request.CreateAddressRequest;
import com.addressmicroservice.addressmicroservice.response.AddressResponse;
import com.addressmicroservice.addressmicroservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/create")
    public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest){
        return addressService.createAddress(createAddressRequest);
    }

    @GetMapping("/get/{id}")
    public AddressResponse getAddress(@PathVariable long id){
        return addressService.getById(id);
    }
}
