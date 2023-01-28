package med.ben.dockerjenkinsintegration.service;

import med.ben.dockerjenkinsintegration.model.Customer;
import med.ben.dockerjenkinsintegration.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> findCustomerById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> allCustomers() {
        return customerRepository.findAll();
    }
}
