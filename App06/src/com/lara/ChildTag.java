package com.lara;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class ChildTag extends TagSupport{
	private String country;
	private Tag parent;
	public void setCountry(String country) {
		this.country = country;
	}
	public void setParent(Tag parent) {
		this.parent = parent;
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("do start tag");
		ParentTag p1=(ParentTag)parent;
		if(p1.getCountry().equals(country)){
			return EVAL_BODY_INCLUDE;
		}
		else{
			return SKIP_BODY;
		}
	}
}
