package com.bookstore.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.bookstore.bean.Manager;
import com.bookstore.dao.ManagerDao;
import com.bookstoreDB.db.BaseDao;

public class ManagerImpl extends BaseDao implements ManagerDao{

	@Override
	public Manager searchById(String id) {
		Manager manager=null;
		String sql="select * from tb_manager where AdminId=?";
		String params[]={id};
		List list=this.executeQuery(sql, params);
		if(list.size()>0){
			manager=(Manager)list.get(0);
		}
		return manager;
	}

	@Override
	public List<Manager> findAllProduct() {
		String sql = "select * from tb_manager";
		String params[] = new String[0];
		return this.executeQuery(sql, params);
	}

	@Override
	public List rsToList(ResultSet rs2) {
		List list = new ArrayList();
		try {
			while (rs2.next()) {
				Manager pro = new Manager();
				pro.setAdminId(rs2.getInt(1));
				pro.setAdminName(rs2.getString(2));
				pro.setAdminPwd(rs2.getString(3));
				list.add(pro);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
