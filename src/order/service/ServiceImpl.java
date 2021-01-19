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
		// TODO �ֹ� �� ��ٱ��� ����Ʈ �߰�
		dao.insert(o);
	}

	@Override
	public Order getOrder(int num) {
		// TODO �ֹ� ���� �� ��������
		return dao.select(num);
	}

	@Override
	public ArrayList<Order> orderList(String o_id, int o_state) {
		// TODO ��ٱ��� + �ֹ� ����Ʈ ��������.
		// �޼ҵ带 ���� o_state�� ��ٱ������� �ֹ����� ���н�Ű�� �����ε�.
		return dao.selectAll(o_id, o_state);
	}

	@Override
	public void editState(String type, int num) {
		// TODO ��ٱ��϶� �ֹ� ����
		dao.update(type, num);
	}

	@Override
	public void delOrder(int num) {
		// TODO ��ٱ��ϳ� �ֹ� ���� ����
		dao.delete(num);
	}

}
