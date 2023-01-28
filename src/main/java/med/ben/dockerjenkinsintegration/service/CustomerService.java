package med.ben.dockerjenkinsintegration.service;

import med.ben.dockerjenkinsintegration.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Optional<Customer> findCustomerById(int id);
    List<Customer> allCustomers();

}
