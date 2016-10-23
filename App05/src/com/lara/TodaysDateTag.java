package com.lara;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class TodaysDateTag implements Tag {
	private PageContext pc;
	@Override
	public int doEndTag() throws JspException {
		System.out.println("inside do end tag...");
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println("inside do start tag...");
		JspWriter out=pc.getOut();
		Date d1=new Date();
		try {
			out.println("Todays Date : "+d1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	@Override
	public Tag getParent() {
		System.out.println("get Parent...");
		return null;
	}

	@Override
	public void release() {
		System.out.println("inside release...");
	}

	@Override
	public void setPageContext(PageContext arg0) {
		System.out.println("inside set Page context...");
		pc=arg0;
	}

	@Override
	public void setParent(Tag arg0) {
		System.out.println("inside set parent...");
	}

}

