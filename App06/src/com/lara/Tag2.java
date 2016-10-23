package com.lara;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class Tag2 implements Tag {
	private PageContext pc;
	private String param1;
	private Integer param2;
	public String getParam1() {
		System.out.println("getParam1");
		return param1;
	}
	public void setParam1(String param1) {
		System.out.println("setParam1 : "+param1);
		this.param1 = param1;
	}
	public Integer getParam2() {
		System.out.println("getParam2");
		return param2;
	}
	public void setParam2(Integer param2) {
		System.out.println("setParam2 : "+param2);
		this.param2 = param2;
	}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("do end tag");
		JspWriter out=pc.getOut();
		try{
			out.println("<br>from do end tag : ");
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
//		return EVAL_PAGE;
		return SKIP_PAGE;
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("do start tag");
		JspWriter out=pc.getOut();
		try{
			out.println("from do start tag : <br>");
			out.println("Param1 : "+param1);
			out.println("<br>Param2 : "+param2);
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
//		return EVAL_BODY_INCLUDE;
		return SKIP_BODY;
	}
	@Override
	public Tag getParent() {
		System.out.println("get Parent");
		return null;
	}
	@Override
	public void release() {
		System.out.println("release");
	}
	@Override
	public void setPageContext(PageContext arg0) {
		System.out.println("setPageContext");
		pc=arg0;
	}
	@Override
	public void setParent(Tag arg0) {
		System.out.println("setParent : "+arg0);
	}
}
