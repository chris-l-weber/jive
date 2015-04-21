package com.chrisweber.jive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class Add extends ActionSupport implements ServletRequestAware {

	private	HttpServletRequest request;
	private String name="Redhat";
	private String version="1";
	private String notes ="OLD";
	
	public String execute() throws Exception {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    conn = DriverManager.getConnection(Config.CS);

		    Statement st=conn.createStatement();
			
		    String query = "INSERT INTO os "+
							"(Name,Version,Notes)"+" VALUES ('"+
							name+"' , '"+version+"' , '"+notes+"')";
		    st.executeUpdate(query);
			
			
			st.close();
			conn.close();
			
		} catch(Exception e){
 			e.printStackTrace();
 		}
		
		return "Success";
	}
	
	public void validate()
	   {
	      if (name == null || name.trim().equals(""))
	      {
	         addFieldError("name","The name is required");
	      }
	      if (version == null || version.trim().equals(""))
	      {
	         addFieldError("version","The version is required");
	      }
	   }
	
	public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletRequest getServletRequest() {
        return request;
    }
    
    public String getName() {
		return name;
	}
    
	public void setName(String name) {
		this.name = name;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}


}
