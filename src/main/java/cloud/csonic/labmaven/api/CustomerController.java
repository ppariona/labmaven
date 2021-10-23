package cloud.csonic.labmaven.api;

import cloud.csonic.labmaven.api.dto.CustomersDto;
import cloud.csonic.labmaven.model.Customer;
import cloud.csonic.labmaven.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public CustomersDto listAll(){

        return CustomersDto.builder()
                .customers(customerService.listAll())
                .build();
    }

}
