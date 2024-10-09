package com.espread.sys.service.impl;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import com.espread.common.constant.YXContant;
import com.espread.common.constant.Global;
import com.espread.common.constant.GCConst;

public class JDBCToChanjet {

	public List<HashMap> getGCConnection(String sql) throws SQLException {
		List<HashMap> list = new ArrayList<HashMap>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			String user = GCConst.getSlaveName01();
			String pwd = GCConst.getSlavePwd01();
			String url = GCConst.getSlaveUrl01();

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, user, pwd);
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			ResultSetMetaData md = rs.getMetaData(); // 获得结果集结构信息,元数据
			int columnCount = md.getColumnCount(); // 获得列数
			while (rs.next()) {
				HashMap rowData = new HashMap();
				for (int i = 1; i <= columnCount; i++) {
					rowData.put(md.getColumnName(i), rs.getObject(i));
				}
				list.add(rowData);
			}
			rs.close();
			st.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		} finally {
			rs.close();
			st.close();
			conn.close();
			System.out.println("Closed database successfully");
		}
		return list;
	}

	public int YXUpdate(String sql) throws SQLException {
		Connection conn = null;
		Statement st = null;
		int rs = 0;
		try {
			String user = YXContant.getYX_username();
			String pwd = YXContant.getYX_password();
			String url = YXContant.getYX_driverUrl();

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, user, pwd);
			st = conn.createStatement();
			rs = st.executeUpdate(sql);
			st.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		} finally {
			st.close();
			conn.close();
			System.out.println("Closed database successfully");
		}
		return rs;
	}

	public int GCUpdate(String sql) throws SQLException {
		Connection conn = null;
		Statement st = null;
		int rs = 0;
		try {
			String user = GCConst.getSlaveName01();
			String pwd = GCConst.getSlavePwd01();
			String url = GCConst.getSlaveUrl01();

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, user, pwd);
			st = conn.createStatement();
			rs = st.executeUpdate(sql);
			st.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		} finally {
			st.close();
			conn.close();
			System.out.println("Closed database successfully");
		}
		return rs;
	}

}
