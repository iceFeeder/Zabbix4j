package com.zabbix4j.user;

import java.util.ArrayList;
import java.util.List;

import com.zabbix4j.ZabbixApiResponse;

public class UserGetResponse extends ZabbixApiResponse {
	private List<Result> result = new ArrayList<Result>();
	
	public UserGetResponse(){
		super();
	}

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}
	
	 public class Result extends UserObject {
		 
	 }
}
