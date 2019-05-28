package com.bookstoreDB.db;

import java.sql.*;
import java.util.List;

public  class DBBean {
	
	private Connection dbCon;
	private String url="jdbc:sqlserver://localhost:1433;databaseName=bookStore";
	private String user="sa";
	private String password="cq520";
	
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	 // ��̬��Ա��֧�ֵ�̬ģʽ
    private static DBBean per = null;
    private Statement stmt = null;
	
	 // ��̬ģʽ-����ģʽ
    public DBBean() {
    }
    
    public static DBBean createInstance() {
        if (per == null) {
            per = new DBBean();
            per.initDB();
        }
        return per;
    }

    // ��������
    public void initDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 // �������ݿ⣬��ȡ���+����
    public void connectDB() {
        System.out.println("�����������ݿ�.....");
        try {
            dbCon = DriverManager.getConnection(url, user, password);
            stmt = dbCon.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("���ݿ����ӳɹ�.");
    }
	
	// ��ѯ
    public ResultSet executeQuery(String sql) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
   
    // ����/ɾ��/�޸�
    public int executeUpdate(String sql) {
        int ret = 0;
        try {
            ret = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ret;
    }
    
    public List executeQuery(String sql,String[] params){
		List list=null;
		connectDB();//�������ݿ�
		try {
			ps=dbCon.prepareStatement(sql);//����������
			int i=0;
			for(String param:params){
				ps.setString(++i, param);//��������ֵ
			}
			rs=ps.executeQuery();//ִ�в�ѯ
			//list=rsToList(rs);//�������ת���ɼ��϶���
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
    
    
    

	// �ر����ݿ� �رն����ͷž��
    public void closeDB() {
        System.out.println("���ڹر����ݿ�....");
        try {
            stmt.close();
            dbCon.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("���ݿ�رճɹ�!");
    }
}
