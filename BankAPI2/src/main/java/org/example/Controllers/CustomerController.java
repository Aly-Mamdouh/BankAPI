package org.example.Controllers;

import org.example.DTO.CustomerDto;
import org.example.Model.Customer;
import org.example.Services.CustomerService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customers")
public class CustomerController {


    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/addCustomer")
    public CustomerDto addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }


    @GetMapping("/{id}")
    public CustomerDto getCustomerDetails(Long customerId) {
        return customerService.getCustomerById(customerId);

    }

}
