package com.lara;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;
import javax.servlet.jsp.tagext.VariableInfo;

public class MyTEITag extends TagExtraInfo{
	public VariableInfo[] getVariableInfo(TagData data){
		VariableInfo v1=new VariableInfo("test1", "String", true, VariableInfo.AT_BEGIN);
		VariableInfo v2=new VariableInfo("test1", "String", true, VariableInfo.AT_BEGIN);
		VariableInfo x[]={v1,v2};
		return x;
	}
}
