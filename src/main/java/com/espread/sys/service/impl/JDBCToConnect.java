package com.espread.sys.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.alibaba.druid.pool.DruidDataSource;
import com.espread.common.constant.GCConst;
import com.espread.common.constant.YXContant;

public class JDBCToConnect {

	public List<HashMap> getGCConnection(String sql) throws SQLException {
		List<HashMap> list = new ArrayList<HashMap>();
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			String user = GCConst.getSlaveName();
			String pwd = GCConst.getSlavePwd();
			String url = GCConst.getSlaveUrl();
			
			/*ComboPooledDataSource cpds = new ComboPooledDataSource();
			
			cpds.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cpds.setJdbcUrl(url);
			cpds.setUser(user);
			cpds.setMaxPoolSize(20);
			cpds.setInitialPoolSize(3);
			cpds.setPassword(pwd);
			conn = cpds.getConnection();*/
			
			DruidDataSource dds = new  DruidDataSource();

			dds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			dds.setUrl(url);
			dds.setUsername(user);
			dds.setPassword(pwd);
			dds.setInitialSize(5);
			dds.setMaxActive(10);
			dds.setMaxWait(3000);
			dds.setValidationQuery("select 1");
			dds.setTestWhileIdle(true);
			dds.setMinIdle(3);
			
			conn = dds.getConnection();

			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			ResultSetMetaData md = rs.getMetaData(); // 获得结果集结构信息,元数据
			int columnCount = md.getColumnCount(); // 获得列数
			while (rs.next()) {
				HashMap rowData = new HashMap();
				for (int i = 1; i <= columnCount; i++) {
					rowData.put(md.getColumnName(i), rs.getObject(i));
				}
				list.add(rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		} finally {
			if(conn != null) {
				conn.close();
			}
			if(rs != null) {
				rs.close();
			}
			if(st != null) {
				st.close();
			}
			System.out.println("Closed database successfully");
		}
		return list;
	}

	public int YXUpdate(String sql) throws SQLException {
		Connection conn = null;
		PreparedStatement st = null;
		int rs = 0;
		try {
			String user = YXContant.getYX_username();
			String pwd = YXContant.getYX_password();
			String url = YXContant.getYX_driverUrl();

			/*ComboPooledDataSource cpds = new ComboPooledDataSource();
			
			cpds.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cpds.setJdbcUrl(url);
			cpds.setUser(user);
			cpds.setPassword(pwd);
			cpds.setMaxPoolSize(20);
			cpds.setInitialPoolSize(3);
			
			conn = cpds.getConnection();*/
			
			DruidDataSource dds = new  DruidDataSource();

			dds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			dds.setUrl(url);
			dds.setUsername(user);
			dds.setPassword(pwd);
			dds.setInitialSize(5);
			dds.setMaxActive(10);
			dds.setMaxWait(3000);
			dds.setValidationQuery("select 1");
			dds.setTestWhileIdle(true);
			dds.setMinIdle(3);
			
			conn = dds.getConnection();

			st = conn.prepareStatement(sql);
			rs = st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		} finally {
			if(st != null) {
				st.close();
			}
			if(conn != null) {
				conn.close();
			}
			System.out.println("Closed database successfully");
		}
		return rs;
	}

	public int GCUpdate(String sql) throws SQLException {
		Connection conn = null;
		PreparedStatement st = null;
		int rs = 0;
		try {
			String user = GCConst.getSlaveName();
			String pwd = GCConst.getSlavePwd();
			String url = GCConst.getSlaveUrl();

			/*ComboPooledDataSource cpds = new ComboPooledDataSource();
			
			cpds.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cpds.setJdbcUrl(url);
			cpds.setUser(user);
			cpds.setPassword(pwd);
			cpds.setMaxPoolSize(20);
			cpds.setInitialPoolSize(3);
			
			conn = cpds.getConnection();*/
			
			DruidDataSource dds = new  DruidDataSource();

			dds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			dds.setUrl(url);
			dds.setUsername(user);
			dds.setPassword(pwd);
			dds.setInitialSize(5);
			dds.setMaxActive(10);
			dds.setMaxWait(3000);
			dds.setValidationQuery("select 1");
			dds.setTestWhileIdle(true);
			dds.setMinIdle(3);
			
			conn = dds.getConnection();

			st = conn.prepareStatement(sql);
			rs = st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		} finally {
			if(st != null) {
				st.close();
			}
			if(conn != null) {
				conn.close();
			}
			System.out.println("Closed database successfully");
		}
		return rs;
	}
	
}
