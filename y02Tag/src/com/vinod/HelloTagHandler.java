package com.vinod;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;


public class HelloTagHandler implements Tag{
	private Integer id;
	private String message;
	public Integer getId() {
		System.out.println("get id");
		return id;
	}
	public void setId(Integer id) {
		System.out.println("set id");
		this.id = id;
	}
	public String getMessage() {
		System.out.println("get message");
		return message;
	}
	public void setMessage(String message) {
		System.out.println("set message");
		this.message = message;
	}
	public void setPageContext(PageContext arg0) {
		System.out.println("set Page context");
	}
	public void setParent(Tag arg0) {
		System.out.println("set Parent");
	}
	public Tag getParent() {
		System.out.println("get Parent");
		return null;
	}
	public int doStartTag() throws JspException {
		System.out.println("do start");
		return SKIP_BODY;
	}
	public int doEndTag() throws JspException {
		System.out.println("do end");
		return EVAL_PAGE;
	}

	public void release() {
		System.out.println("release");
	}

	

}
