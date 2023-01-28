package med.ben.dockerjenkinsintegration.repository;

import med.ben.dockerjenkinsintegration.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
