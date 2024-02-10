package com.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Book;
import com.service.productService;

/**
 * Servlet implementation class productServlet
 */
@WebServlet("/LibraryServlet")
public class LibraryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		productService service=new productService();
		RequestDispatcher rd = null;
		String action = request.getParameter("action");
		if ("List".equals(action)) {
			rd = request.getRequestDispatcher("list.jsp");
			List<Book> bookList = service.getBookList();
			request.setAttribute("LIST", bookList);
		}
		else if ("Delete".equals(action)) {
			String id = request.getParameter("id");
			boolean result = service.deleteBookById(Integer.parseInt(id));
			if (result == true) {
				rd = request.getRequestDispatcher("list.jsp");
				List<Book> bookList = service.getBookList();
				request.setAttribute("LIST", bookList);
			} else {
				rd = request.getRequestDispatcher("deleteFailure.jsp");
			}

		}
		else if ("Search".equals(action)) {
			Book book = null;
			String name = request.getParameter("bname");
			book = service.searchBookByName(name);
			if (book != null) {
				rd = request.getRequestDispatcher("searchSuccess.jsp");
				request.setAttribute("BOOK", book);
			} else {
				rd = request.getRequestDispatcher("searchFailure.jsp");
			}
		}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		productService service = new productService();
		RequestDispatcher rd = null;
		String action = request.getParameter("action");
		if ("Register".equals(action)) {
		String id = request.getParameter("bid");
		String name = request.getParameter("bname");
		String publisher = request.getParameter("publisher");
		String price = request.getParameter("price");
		Book b = new Book(Integer.parseInt(id), name, publisher, Double.parseDouble(price));
		boolean result = service.addBook(b);
		if (result == true) {
			rd = request.getRequestDispatcher("list.jsp");
			List<Book> bookList = service.getBookList();
			request.setAttribute("LIST", bookList);
		} else {
			rd = request.getRequestDispatcher("registrationFailed.jsp");
		}
	}
	rd.forward(request, response);
}

}
