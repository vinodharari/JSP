package com.lara;

import org.apache.jasper.runtime.HttpJspBase;

public abstract class MyHttpServlet extends HttpJspBase{

	public String sayHello(){
		return "Hello to All";
	}
	
}
