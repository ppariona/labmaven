package cloud.csonic.labmaven.service;

import cloud.csonic.labmaven.model.Customer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{


    Customer customer1 = Customer.builder()
            .id(1)
            .lastName("Picapiedra")
            .name("Pedro")
            .build();

    Customer customer2 = Customer.builder()
            .id(2)
            .lastName("Marmol")
            .name("Pablo")
            .build();

    @Override
    public List<Customer> listAll() {
        return Arrays.asList(customer1,customer2);
    }

    @Override
    public Customer getById(long id) {
        return customer1;
    }


}
