package order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.org.apache.xpath.internal.operations.Or;

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
