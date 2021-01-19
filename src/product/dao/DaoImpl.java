package product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import conn.DBConnect;
import model.Product;

public class DaoImpl implements Dao {
	
	private DBConnect db;
	
	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	

	public void insert(Product p) {
		
	}

	
	public Product select(int num) {
		
		return null;
	}
	
	public ArrayList<Product> selectAllById(String s_id) {
		
		return null;
	}

	

	public void update(Product p) {
		
	}

	public void delete(int num) {
		
	}

	@Override
	public int selectNum() {
		
		return 0;
	}
	
	
	

	
	public ArrayList<Product> selectAll() {
		
		return null;
	}

	
	
	public Product updateQuantity(int q, int num) {
		// TODO Auto-generated method stub
		// 비워두어도 됌
		return null;
		
	}



	

}
