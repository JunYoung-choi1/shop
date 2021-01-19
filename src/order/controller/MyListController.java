package order.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Member;
import model.Order;
import model.Product;
import order.service.Service;
import order.service.ServiceImpl;

/**
 * Servlet implementation class MyListController
 */
@WebServlet("/order/myList")
public class MyListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setAttribute("m", new Member("id", "pwd", "name", "email", "addr", 1));
		Member m = (Member) session.getAttribute("m");
		String o_id = m.getId();
		Service service = new ServiceImpl();
		
		ArrayList<Order> cart = service.orderList(o_id, 2);
		request.setAttribute("cart", cart);
		
		ArrayList<Order> orders = service.orderList(o_id, 1);
		request.setAttribute("orders", orders);
		
		String path = "/view/order/myList.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
