package com.bookstoreDB.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import com.bookstore.bean.Manager;
import com.bookstoreDB.db.DBBean;

public class Service{
	
	//管理员登录
	public Boolean adminLogin(String AdminName,String AdminPwd){
		// 获取Sql查询语句
		String gmlogSql="select * from tb_manager where AdminName ='"+ AdminName 
				+ "' and AdminPwd ='" + AdminPwd + "'";
		//获取DB对象
		DBBean sql= DBBean.createInstance();
		sql.connectDB();
		ResultSet rs=sql.executeQuery(gmlogSql);
		try {
			if(rs.next()){
				sql.closeDB();
                return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql.closeDB();
        return false;
	}
	
	
	//用户登陆
	public Boolean login(String CustomerName, String CustomerPwd) {
        // 获取Sql查询语句
        String logSql = "select * from tb_customerinfo where CustomerName ='" + CustomerName
                + "' and CustomerPwd ='" + CustomerPwd + "'";
        // 获取DB对象
        DBBean sql = DBBean.createInstance();
        sql.connectDB();
        try {
            ResultSet rs = sql.executeQuery(logSql);
            if (rs.next()) {
                sql.closeDB();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        sql.closeDB();
        return false;
    }

	//注册添加用户
    public Boolean register(String CustomerName, String CustomerPwd,String Customertruename,String CustomerSex,String CustomerTel,String CustomerEmail,String CustomerAddr) {
        // 获取Sql查询语句
        String regSql = "insert into tb_customerinfo values('"+ CustomerName+ "','"+ CustomerPwd+ "','"+Customertruename+"','"+CustomerSex+"','"+CustomerTel+"','"+CustomerEmail+"','"+CustomerAddr+"')";
        // 获取DB对象
        DBBean sql = DBBean.createInstance();
        sql.connectDB();
        int ret = sql.executeUpdate(regSql);
        if (ret != 0) {
            sql.closeDB();
            return true;
        }
        sql.closeDB();
        return false;
    }
    
  //添加图书类型
    public Boolean bookTypeInsert(String bookTypeName) {
        // 获取Sql查询语句
        String regSql = "insert into tb_booktypeinfo values('"+ bookTypeName+ "')";
        // 获取DB对象
        DBBean sql = DBBean.createInstance();
        sql.connectDB();
        int ret = sql.executeUpdate(regSql);
        if (ret != 0) {
            sql.closeDB();
            return true;
        }
        sql.closeDB();
        return false;
    }
    
    
}
