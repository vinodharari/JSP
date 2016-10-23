package com.vinod;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;
import javax.servlet.jsp.tagext.ValidationMessage;

public class HelloTagTEI extends TagExtraInfo{
	
	public boolean isValid(TagData data) {
		System.out.println("inside valid");
		try {
			Integer.parseInt(data.getAttributeString("id"));
			System.out.println("it is valid");
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public ValidationMessage[] validate(TagData data){
		ValidationMessage messArr[] = new ValidationMessage[1];
		
		try {
			Integer.parseInt(data.getAttributeString("id"));
		} catch (NumberFormatException e) {
			messArr[0] = new ValidationMessage("id", "input number is not a no");
		}
		return messArr;
	}
}
