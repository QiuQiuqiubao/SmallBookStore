package com.bookstore.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.bean.Customer;
import com.bookstore.dao.CustomerDao;
import com.bookstoreDB.db.BaseDao;

public class CustomerImpl extends BaseDao implements CustomerDao{

	@Override
	public Customer searchById(String id) {
		Customer customer=null;
		String sql="select * from tb_customerinfo where CustomerId=?";
		String params[]={id};
		List list=this.executeQuery(sql, params);
		if(list.size()>0){
			customer=(Customer)list.get(0);
		}
		return customer;
	}

	@Override
	public List<Customer> findAllProduct() {
		String sql="select * from tb_customerinfo";
		String params[]=new String[0];
		return this.executeQuery(sql, params);
	}

	@Override
	public List rsToList(ResultSet rs2) {
		List list=new ArrayList();
		try {
			while(rs2.next()){
				Customer cus=new Customer();
				cus.setCustomerId(rs2.getInt(1));
				cus.setCustomerName(rs2.getString(2));
				cus.setCustomerPwd(rs2.getString(3));
				cus.setCustomertruename(rs2.getString(4));
				cus.setCustomerSex(rs2.getString(5));
				cus.setCustomerTel(rs2.getString(6));
				cus.setCustomerEmail(rs2.getString(7));
				cus.setCustomerAddr(rs2.getString(8));
				list.add(cus);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public int deleteProject(String id) {
		String sql="delete tb_customerinfo where CustomerId=?";
		String params[]={id};
		return this.executeSQL(sql, params);
	}

	@Override
	public int updateProject(Customer cus, String id) {
		String sql="update tb_customerinfo set CustomerName=?,CustomerPwd=?,CustomertrueName=?,CustomerSex=?,CustomerTel=?,CustomerEmail=?,CustomerAddr=? where CustomerId=?";
		String params[]={cus.getCustomerName(),cus.getCustomerPwd(),cus.getCustomertruename(),cus.getCustomerSex(),cus.getCustomerTel(),cus.getCustomerEmail(),cus.getCustomerAddr(),id};
		return this.executeSQL(sql, params);
	}
	
}
