package cloud.csonic.labmaven.api.dto;

import cloud.csonic.labmaven.model.Customer;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CustomerDto {
    
    private Customer customer;
}
