package com.bookstore.dao;

import java.util.List;

import com.bookstore.bean.BookType;


public interface BookTypeDao {
	public  BookType searchById(String id);
	public List<BookType> findAllProduct();
	public int updateProject(BookType book,String id);
	public int deleteProject(String id);
}
