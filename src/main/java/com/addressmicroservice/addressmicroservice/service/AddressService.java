package com.addressmicroservice.addressmicroservice.service;

import com.addressmicroservice.addressmicroservice.entity.Address;
import com.addressmicroservice.addressmicroservice.repo.AddressRepository;
import com.addressmicroservice.addressmicroservice.request.CreateAddressRequest;
import com.addressmicroservice.addressmicroservice.response.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
        Address address = new Address();
        address.setCity(createAddressRequest.getCity());
        address.setStreet(createAddressRequest.getStreet());
        addressRepository.save(address);
        return new AddressResponse(address);
    }

    public AddressResponse getById(long id){
        Address address = addressRepository.findById(id).get();
        return new AddressResponse(address);
    }
}
