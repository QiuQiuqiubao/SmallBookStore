package com.bookstore.dao;

import java.util.List;


import com.bookstore.bean.Customer;

public interface  CustomerDao {
	public  Customer searchById(String id);
	public List<Customer> findAllProduct();
	public int updateProject(Customer cus,String id);
	public int deleteProject(String id);
}