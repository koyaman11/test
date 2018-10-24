package com.internousdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;

public class InquiryCompleteAction extends ActionSupport{

	private String name;
	private String ptype;
	private String body;

	public String execute(){
		return SUCCESS;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getQtype(){
		return ptype;
	}
	public void setQtype(String qtype){
		this.ptype=qtype;
	}

	public String getBody(){
		return body;
	}

	public void setBody(String body){
		this.body=body;
	}



}
