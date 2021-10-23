package cloud.csonic.labmaven.api.dto;

import cloud.csonic.labmaven.model.Customer;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class CustomersDto {

    private List<Customer> customers;
}
