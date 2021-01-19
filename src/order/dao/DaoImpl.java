package order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import conn.DBConnect;
import model.Cart;
import model.Order;
import model.Orders;

public class DaoImpl implements Dao {
	private DBConnect db;

	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	@Override
	public void insert(Order o) {
		// TODO 주문 및 장바구니 리스트 추가
		
	}

	@Override
	public Order select(int num) {
		// TODO 주문 내역 상세 가져오기
		
		return null;
	}

	@Override
	public ArrayList selectAll(String o_id, int o_state) {
		ArrayList<Cart> cart = new ArrayList<Cart>();
		ArrayList<Orders> orders = new ArrayList<Orders>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";
		if (o_state == 1) {
			try {
				conn = db.getConnection();
				sql = "select "
						+ "o.num, p.name, p.img, o.order_num, o.total_price, o.o_date "
						+ "from shop_product p "
						+ "join shop_order o "
						+ "on p.num = o.pro_num "
						+ "where o_state = 1 "
						+ "order by o.num";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					orders.add(new Orders(rs.getInt(1), rs.getString(2), 
							rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getDate(6)));
				}
				return orders;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (o_state == 2) {
			try {
				conn = db.getConnection();
				sql = "select "
						+ "p.name, p.img, o.order_num, o.total_price "
						+ "from shop_product p "
						+ "join shop_order o "
						+ "on p.num = o.pro_num "
						+ "where o_state = 2 "
						+ "order by o.num";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					cart.add(new Cart(rs.getString(1), rs.getString(2), 
							rs.getInt(3), rs.getInt(4)));
				}
				return cart;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void delete(int num) {
		// TODO 장바구니나 주문 내역 삭제
		
	}

	@Override
	public void update(String type, int num) {
		// TODO 장바구니랑 주문 변경
		
	}
}
