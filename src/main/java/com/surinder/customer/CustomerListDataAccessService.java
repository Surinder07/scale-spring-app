package com.surinder.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("list")
public class CustomerListDataAccessService implements CustomerDao{

    private static List<Customer> customers;
    static {
        customers = new ArrayList<>();
        Customer surinder = new Customer(1,
                "Surinder",
                "surinder@gmail.com",
                23);
        Customer sachin = new Customer(2,
                "sachin",
                "sachin@gmail.com",
                21);
        customers.add(surinder);
        customers.add(sachin);

    }
    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
          return customers
                .stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    @Override
    public void insertCustomer(Customer customer) {
         customers.add(customer);
    }

    @Override
    public boolean exitsPersonWithEmail(String email) {
        return customers.stream()
                .anyMatch(c -> c.getEmail().equals(email));
    }
}