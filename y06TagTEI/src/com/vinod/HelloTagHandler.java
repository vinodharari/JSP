package com.vinod;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.Tag;


public class HelloTagHandler implements BodyTag{
	private Integer id;
	private String message;
	int count=5;
	private BodyContent bodyContent;
	public Integer getId() {
		System.out.println("get id");
		return id;
	}
	public void setId(Integer id) {
		System.out.println("set id");
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
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
		return EVAL_BODY_BUFFERED;
	}
	public void doInitBody() throws JspException {
		System.out.println("doInit Body");
	}
	public void setBodyContent(BodyContent bodyContent) {
		this.bodyContent=bodyContent;
		System.out.println("setBody Content");
	}
	public int doAfterBody() throws JspException {
		String s1=bodyContent.getString().trim();
		if(s1.length() > 10){
			s1=s1.substring(0, 10) + "....";
		}
		System.out.println("Body of the tag is : "+bodyContent.getString());
		System.out.println(s1);

		JspWriter writer = bodyContent.getEnclosingWriter();
		try {
			writer.println(s1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("do after body");
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
