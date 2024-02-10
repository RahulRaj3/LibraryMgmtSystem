package com.service;

import java.util.List;

import com.bean.Book;
import com.dao.productDAO;

public class productService {

	public List<Book> getBookList() {
		productDAO dao = new productDAO();
		return dao.getBookList();
	}

	public boolean deleteBookById(int id) {
		productDAO dao = new productDAO();
		return dao.deleteBookById(id);
	}

	public Book searchBookByName(String name) {
		productDAO dao = new productDAO();
		return dao.searchBookByName(name);
	}

	public boolean addBook(Book book) {
		productDAO dao = new productDAO();
		return dao.addBook(book);
	}
}
