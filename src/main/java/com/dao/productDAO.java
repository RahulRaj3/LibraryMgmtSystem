package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Book;
import com.util.DBUtil;

public class productDAO {

	public List<Book> getBookList() {
		List<Book> bookList = new ArrayList<Book>();
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			cn = DBUtil.createConnection();
			ps = cn.prepareStatement("select * from book order by book_id");
			rs = ps.executeQuery();
			while (rs.next()) {
				Book b = new Book(rs.getInt("book_id"), rs.getString("name"), rs.getString("publisher"),
						rs.getDouble("price"));
				bookList.add(b);
			}
			DBUtil.closeAllConnections(cn, ps, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return bookList;
	}

	public boolean deleteBookById(int id) {
		boolean result = false;
		Connection cn = null;
		PreparedStatement ps = null;
		try {
			cn = DBUtil.createConnection();
			ps = cn.prepareStatement("delete from book where book_id=?");
			ps.setInt(1, id);
			int t = ps.executeUpdate();
			if (t > 0) {
				result = true;
			}
			DBUtil.closeAllConnections(cn, ps, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public Book searchBookByName(String name) {
		Book b = null;
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		try {
			cn = DBUtil.createConnection();
			ps = cn.prepareStatement("select * from book where name=?");
			ps.setString(1, name);
			rs = ps.executeQuery();
			while (rs.next()) {
				b = new Book(rs.getInt("book_id"), rs.getString("name"), rs.getString("publisher"),
						rs.getDouble("price"));
			}
			DBUtil.closeAllConnections(cn, ps, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return b;
	}

	public boolean addBook(Book book) {
		boolean result = false;
		Connection cn = null;
		PreparedStatement ps = null;
		try {
			cn = DBUtil.createConnection();
			ps = cn.prepareStatement("insert into book values(?,?,?,?)");
			ps.setInt(1, book.getBook_id());
			ps.setString(2, book.getName());
			ps.setString(3, book.getPublisher());
			ps.setDouble(4, book.getPrice());
			int t = ps.executeUpdate();
			if (t > 0) {
				result = true;
			}
			DBUtil.closeAllConnections(cn, ps, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
}
