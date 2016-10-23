package com.lara;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class ParentTag extends TagSupport{
	private String country;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_BODY_INCLUDE;
	}
	
}
