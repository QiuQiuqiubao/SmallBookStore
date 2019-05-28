package com.bookstore.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.bean.BookType;
import com.bookstore.dao.BookTypeDao;
import com.bookstoreDB.db.BaseDao;

public class BookTypeImpl extends BaseDao implements BookTypeDao{

	@Override
	public BookType searchById(String id) {
		BookType book=null;
		String sql="select * from tb_booktypeinfo where BookTypeId=?";
		String params[]={id};
		List list=this.executeQuery(sql, params);
		if(list.size()>0){
			book=(BookType) list.get(0);
		}
		return book;
	}

	@Override
	public List<BookType> findAllProduct() {
		String sql="select * from tb_booktypeinfo";
		String params[]=new String[0];
		return this.executeQuery(sql, params);
	}

	@Override
	public int updateProject(BookType book, String id) {
		String sql="update tb_booktypeinfo set BookTypeName=? where BookTypeId=?";
		String params[]={book.getBookTypeName(),id};
		return this.executeSQL(sql, params);
	}

	@Override
	public int deleteProject(String id) {
		String sql="delete tb_booktypeinfo where BookTypeId=?";
				String params[]={id};
				return this.executeSQL(sql, params);
	}

	@Override
	public List rsToList(ResultSet rs2) {
		List list=new ArrayList();
		try {
			while(rs2.next()){
				BookType book=new BookType();
				book.setBookTypeId(rs2.getInt(1));
				book.setBookTypeName(rs2.getString(2));
				list.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
