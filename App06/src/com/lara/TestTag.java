package com.lara;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class TestTag extends TagSupport{
	private PageContext pc=null;

	public void setPc(PageContext pc) {
		this.pc = pc;
	}
	@Override
	public int doStartTag() throws JspException {
		pc.setAttribute("test1", "Lara");
		pc.setAttribute("test2", "Technologies");
		return EVAL_BODY_INCLUDE;
	}
}
