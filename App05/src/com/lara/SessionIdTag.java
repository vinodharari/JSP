package com.lara;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class SessionIdTag implements Tag {
	private PageContext pc;
	@Override
	public int doEndTag() throws JspException {
		System.out.println("do end tag");
		return EVAL_PAGE;
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("do start tag");
		JspWriter out=pc.getOut();
		HttpSession session=pc.getSession();
		String id=session.getId();
		try{
			out.println("Session Id : "+id);
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
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
		System.out.println("setPArent : "+arg0);
	}
}
