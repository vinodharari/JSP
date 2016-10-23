package com.vinod;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;


public class HelloTagHandler implements IterationTag{
	private Integer id;
	private String message;
	int count=5;
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
		return EVAL_BODY_AGAIN;
	}
	@Override
	public int doAfterBody() throws JspException {
		System.out.println("do after body");
		if(count > 1){
			count--;
			return EVAL_BODY_AGAIN;
		}
		return SKIP_BODY;
	}
	@Override
	public String toString() {
		return "HelloTagHandler [count=" + count + "]";
	}
	public int doEndTag() throws JspException {
		System.out.println("do end");
		return EVAL_PAGE;
	}

	public void release() {
		System.out.println("release");
	}
	
}
