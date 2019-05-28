package com.bookstore.dao;

import java.util.List;


import com.bookstore.bean.Manager;

public interface ManagerDao {
	public Manager searchById(String id);
	public List<Manager> findAllProduct();
}
