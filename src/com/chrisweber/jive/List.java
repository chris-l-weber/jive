package com.chrisweber.jive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class List extends ActionSupport implements ServletRequestAware{
	private	HttpServletRequest request;
	
	public String execute() throws Exception {
		Connection conn = null;
		LinkedList <OsData> data = new LinkedList <OsData>();
		OsData item;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    conn = DriverManager.getConnection(Config.CS);

		    Statement st=conn.createStatement();
			ResultSet rs = st.executeQuery("select * from os");
			while(rs.next())
			{
				item = new OsData();
				item.setName(rs.getString("Name"));
				item.setVersion(rs.getString("Version"));
				item.setNote(rs.getString("Notes"));
				data.add(item);
				
			}
			request.setAttribute("disp", data);
			rs.close();
			st.close();
			conn.close();
			
		} catch(Exception e){
 			e.printStackTrace();
 		}
		
		return "Success";
	}
	
	public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletRequest getServletRequest() {
        return request;
    }
}
