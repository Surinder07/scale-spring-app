package com.surinder.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer id);
    void insertCustomer(Customer customer);
    boolean exitsPersonWithEmail(String email);
    void updateCustomer(Customer update);
    boolean exitsPersonWithId(Integer customerId);
    void deleteCustomerById(Integer customerId);
}
