package book;

import java.sql.*;

public class DBConnection {
	public Connection dbConn;
	public DBConnection() {
		String driverName = "com.mysql.jdbc.Driver";  //����JDBC����   
		String dbURL = "jdbc:mysql://localhost:3306/mybook";  //���ӷ����������ݿ�test1������ܵ��޸�һ��DatabaseName��ֵ��������ݿ�����������sql2005���  
		String userName = "root";  //Ĭ���û��������㲻ͬ����ø�   
		String userPwd = "123456";  //���룬���㲻ͬ����ø�   
		   
		try {     
			Class.forName(driverName);     
			dbConn = DriverManager.getConnection(dbURL, userName, userPwd);   
			//System.out.println("Connection Successful!");  //������ӳɹ� ����̨���Connection Successful!
			   
			} catch (Exception e) {   
				e.printStackTrace();  
			}
		} 
	}


