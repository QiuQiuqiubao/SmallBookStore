package com.bookstoreDB.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	public Connection getConn(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bookStore","sa","cq520");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public List executeQuery(String sql,String[] params){
		List list=null;
		conn=getConn();//�������ݿ�
		try {
			ps=conn.prepareStatement(sql);//����������
			int i=0;
			for(String param:params){
				ps.setString(++i, param);//��������ֵ
			}
			rs=ps.executeQuery();//ִ�в�ѯ
			list=rsToList(rs);//�������ת���ɼ��϶���
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public abstract List rsToList(ResultSet rs2);

	public int executeSQL(String sql,String[] params){
		int ret=0;
		conn=getConn();
		try {
			ps=conn.prepareStatement(sql);
			int i=0;
			for(String param:params){
				ps.setString(++i, param);
			}
			ret=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
}
