package com.vinod;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class ChildTag implements Tag{
	private Tag parentTag;
	public int doEndTag() throws JspException {
		return 0;
	}
	public int doStartTag() throws JspException {
		return 0;
	}
	public Tag getParent() {
		return null;
	}
	public void release() {
	}
	public void setPageContext(PageContext arg0) {
	}
	public void setParent(Tag arg0) {
	}

	public Tag getParentTag() {
		return parentTag;
	}

	public void setParentTag(Tag parentTag) {
		this.parentTag = parentTag;
	}

}
