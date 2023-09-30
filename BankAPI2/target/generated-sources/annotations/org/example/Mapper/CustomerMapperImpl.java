package org.example.Mapper;

import javax.annotation.processing.Generated;
import org.example.DTO.CustomerDto;
import org.example.Model.Customer;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-30T19:44:25+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto mapToDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setId( customer.getId() );
        customerDto.setName( customer.getName() );
        customerDto.setGender( customer.getGender() );
        customerDto.setAge( customer.getAge() );
        customerDto.setAddress( customer.getAddress() );

        return customerDto;
    }
}
