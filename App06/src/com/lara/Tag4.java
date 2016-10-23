package com.lara;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;

public class Tag4 implements IterationTag {
	private PageContext pc;
	private int index=5;
	public void setPageContext(PageContext arg0) {
		System.out.println("Set Page Context");
		pc=arg0;
	}
	public void setParent(Tag arg0) {
		System.out.println("set Parent...");
	}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("do end tag...");
		return EVAL_PAGE;
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("do start tag...");
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public Tag getParent() {
		System.out.println("get Parent...");
		return null;
	}
	@Override
	public void release() {}
	
	@Override
	public int doAfterBody() throws JspException {
		System.out.println("do after body...");
		JspWriter out=pc.getOut();
		if(index>0){
			try {
				out.println("from DoAfterBody tag<br>");
				index--;
			} catch (IOException e) {
				// TODO: handle exception
			}
			return EVAL_BODY_AGAIN;
		}
		else{
		return SKIP_BODY;
		}
	}
}
