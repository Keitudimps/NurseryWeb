package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Address;
import za.ac.cput.repository.IAddressRepository;

import java.util.List;
@Service
public class AddressService implements IAddressService {
    @Autowired
    private IAddressRepository repository;

    @Override
    public Address create(Address object) {
        return repository.save(object);
    }

    @Override
    public Address read(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public Address update(Address object) {
        return repository.save(object);
    }

//    @Override
//    public boolean delete(Long aLong) {
//        return repository.delete(aLong);
//    }
    @Override
    public List<Address> getAll() {
        return repository.findAll();
    }
}