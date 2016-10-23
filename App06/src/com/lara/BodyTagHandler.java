package com.lara;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.Tag;

public class BodyTagHandler implements BodyTag {
	private PageContext pc=null;
	private BodyContent bc=null;
	@Override
	public void setPageContext(PageContext arg0) {
		System.out.println("setPageContext");
		pc=arg0;
	}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("do end tag");
		
//		return EVAL_PAGE;
		return SKIP_PAGE;
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("do start tag");
		return EVAL_BODY_BUFFERED;
//		return SKIP_BODY;
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
	public void setParent(Tag arg0) {
		System.out.println("setParent : ");
	}
	@Override
	public int doAfterBody() throws JspException {
		System.out.println("do after body");
		JspWriter out=bc.getEnclosingWriter();
		String str=bc.getString();
		str=new StringBuffer(str).reverse().toString();
		try{
			out.println("Reverse of a Body Content : "+str);
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		return SKIP_BODY;
	}
	@Override
	public void doInitBody() throws JspException {
		System.out.println("do Init Body...");
	}
	@Override
	public void setBodyContent(BodyContent arg0) {
		System.out.println("setBody Content...");
		bc=arg0;
	}
}
