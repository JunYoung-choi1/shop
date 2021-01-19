package  member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import conn.DBConnect;
import model.Member;


public class DaoImpl implements Dao {
	
	
	private DBConnect db;
	 
	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	
	public void insert(Member m) {
		
		
	}

	public Member select(String id) {
		
		return null;
	}

	
	
	public void update(Member m) {
		
	}

	
	
	public void delete(String id) {
		
	}

}
