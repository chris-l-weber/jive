package com.chrisweber.jive;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class OSControler extends ActionSupport implements ServletRequestAware {
	public	HttpServletRequest request;
	private String name;
	
	public String list() throws Exception {
		Connection conn = null;
		LinkedList <OsData> data = new LinkedList <OsData>();
		OsData item;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    conn = DriverManager.getConnection("jdbc:mysql://localhost/clwtest?user=root");

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

	public String execute() throws Exception {
		return "success";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletRequest getServletRequest() {
        return request;
    }
}
