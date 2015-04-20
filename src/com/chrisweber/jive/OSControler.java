package com.chrisweber.jive;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;

public class OSControler extends ActionSupport implements ServletRequestAware {
	HttpServletRequest request;
private String name;
	
	public String list() throws Exception {
		LinkedList <OsData> data = new LinkedList <OsData>();
		OsData item = new OsData();
		item.setName("windows");
		item.setVersion("8");
		item.setNote("Sucks");
		data.add(item);
		item = new OsData();
		item.setName("windows");
		item.setVersion("7");
		item.setNote("ok");
		data.add(item);
		item = new OsData();
		item.setName("ubuntu");
		item.setVersion("14.4");
		item.setNote("rocks");
		data.add(item);
		item = new OsData();
		item.setName("redhat");
		item.setVersion("8");
		item.setNote("");
		data.add(item);
		//get data from db
		request.setAttribute("disp", data);
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
