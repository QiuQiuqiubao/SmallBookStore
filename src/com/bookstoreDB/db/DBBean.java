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
	
	 // 静态成员，支持单态模式
    private static DBBean per = null;
    private Statement stmt = null;
	
	 // 单态模式-懒汉模式
    public DBBean() {
    }
    
    public static DBBean createInstance() {
        if (per == null) {
            per = new DBBean();
            per.initDB();
        }
        return per;
    }

    // 加载驱动
    public void initDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 // 连接数据库，获取句柄+对象
    public void connectDB() {
        System.out.println("正在连接数据库.....");
        try {
            dbCon = DriverManager.getConnection(url, user, password);
            stmt = dbCon.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("数据库连接成功.");
    }
	
	// 查询
    public ResultSet executeQuery(String sql) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
   
    // 增添/删除/修改
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
		connectDB();//连接数据库
		try {
			ps=dbCon.prepareStatement(sql);//生成语句对象
			int i=0;
			for(String param:params){
				ps.setString(++i, param);//给参数赋值
			}
			rs=ps.executeQuery();//执行查询
			//list=rsToList(rs);//将结果集转换成集合对象
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
    
    
    

	// 关闭数据库 关闭对象，释放句柄
    public void closeDB() {
        System.out.println("正在关闭数据库....");
        try {
            stmt.close();
            dbCon.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("数据库关闭成功!");
    }
}
