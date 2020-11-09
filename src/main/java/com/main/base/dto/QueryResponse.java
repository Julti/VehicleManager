package com.main.base.dto;

public class QueryResponse {
	public String message;
	public long id;
	public QueryResponse(String message, long id) {
		this.message = message;
		this.id = id;
	}
}
