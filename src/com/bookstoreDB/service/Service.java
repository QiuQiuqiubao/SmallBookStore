package com.bookstoreDB.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import com.bookstore.bean.Manager;
import com.bookstoreDB.db.DBBean;

public class Service{
	
	//����Ա��¼
	public Boolean adminLogin(String AdminName,String AdminPwd){
		// ��ȡSql��ѯ���
		String gmlogSql="select * from tb_manager where AdminName ='"+ AdminName 
				+ "' and AdminPwd ='" + AdminPwd + "'";
		//��ȡDB����
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
	
	
	//�û���½
	public Boolean login(String CustomerName, String CustomerPwd) {
        // ��ȡSql��ѯ���
        String logSql = "select * from tb_customerinfo where CustomerName ='" + CustomerName
                + "' and CustomerPwd ='" + CustomerPwd + "'";
        // ��ȡDB����
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

	//ע������û�
    public Boolean register(String CustomerName, String CustomerPwd,String Customertruename,String CustomerSex,String CustomerTel,String CustomerEmail,String CustomerAddr) {
        // ��ȡSql��ѯ���
        String regSql = "insert into tb_customerinfo values('"+ CustomerName+ "','"+ CustomerPwd+ "','"+Customertruename+"','"+CustomerSex+"','"+CustomerTel+"','"+CustomerEmail+"','"+CustomerAddr+"')";
        // ��ȡDB����
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
    
  //���ͼ������
    public Boolean bookTypeInsert(String bookTypeName) {
        // ��ȡSql��ѯ���
        String regSql = "insert into tb_booktypeinfo values('"+ bookTypeName+ "')";
        // ��ȡDB����
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
