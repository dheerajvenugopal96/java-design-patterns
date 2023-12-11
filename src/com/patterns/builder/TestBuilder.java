package com.patterns.builder;

import com.patterns.builder.HttpClient.HttpClientBuilder;

public class TestBuilder {

	public static void main(String[] args) {

		HttpClientBuilder builder = new HttpClient.HttpClientBuilder();
		
		//more readable than passing null,null,null 
		//this takes only the methods we need
		
		HttpClient httpClient = builder.method("POST").url("http://test.com").body("{}").build();
		System.out.println(httpClient);
	}

}
