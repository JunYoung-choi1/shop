package order.service;

import java.util.ArrayList;

import model.Order;
import order.dao.Dao;
import order.dao.DaoImpl;

public class ServiceImpl implements Service {
	private Dao dao;
	public ServiceImpl() {
		dao = new DaoImpl();
	}
	@Override
	public void addOrder(Order o) {
		// TODO 주문 및 장바구니 리스트 추가
		dao.insert(o);
	}

	@Override
	public Order getOrder(int num) {
		// TODO 주문 내역 상세 가져오기
		return dao.select(num);
	}

	@Override
	public ArrayList<Order> orderList(String o_id, int o_state) {
		// TODO 장바구니 + 주문 리스트 가져오기.
		// 메소드를 보아 o_state가 장바구니인지 주문인지 구분시키는 변수인듯.
		return dao.selectAll(o_id, o_state);
	}

	@Override
	public void editState(String type, int num) {
		// TODO 장바구니랑 주문 변경
		dao.update(type, num);
	}

	@Override
	public void delOrder(int num) {
		// TODO 장바구니나 주문 내역 삭제
		dao.delete(num);
	}

}
