package CaseStudy.service.implement;

import CaseStudy.model.Customer;
import CaseStudy.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    @Override
    public List<Customer> findAll() {
        return customerList;
    }
    @Override
    public void add(Customer customer) {
    }
    @Override
    public void delete(int id) {
    }

    @Override
    public void search(String val) {
    }

    @Override
    public void edit(Customer customer) {
    }
}
