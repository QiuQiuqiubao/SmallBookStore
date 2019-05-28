package com.bookstore.bean;

public class BookType {
	private int bookTypeId;
	private String bookTypeName;
	
	public BookType(){	
	}
	
	public BookType(int bookTypeId,String bookTypeName){
		super();
		this.bookTypeId=bookTypeId;
		this.bookTypeName=bookTypeName;
	}

	public int getBookTypeId() {
		return bookTypeId;
	}

	public void setBookTypeId(int bookTypeId) {
		this.bookTypeId = bookTypeId;
	}

	public String getBookTypeName() {
		return bookTypeName;
	}

	public void setBookTypeName(String bookTypeName) {
		this.bookTypeName = bookTypeName;
	}
	
	
}
