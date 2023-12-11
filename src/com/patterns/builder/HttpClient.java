package com.patterns.builder;

public class HttpClient {


	private String method;
	private String url;
	private String username;
	private String password;
	private String headers;
	private String body;
	
	
	/*
	 * public HttpClient(String method, String url, String username, String
	 * password,String headers, String body) { super(); this.method = method;
	 * this.url = url; this.username = username; this.password = password;
	 * this.headers = headers; this.body = body; }
	 */

	public HttpClient(HttpClientBuilder httpClientBuilder) {
		this.method = httpClientBuilder.method;
		this.url = httpClientBuilder.url;
		this.username = httpClientBuilder.username;
		this.password = httpClientBuilder.password;
		this.headers = httpClientBuilder.headers;
		this.body = httpClientBuilder.body;
	}
	
	//this is a static class that return each object variable as type of object 
	//this is then made made accessible by calling the build method 
	//build should be of the main class type
	//set properties of class from the properties set in builder;
	public static class HttpClientBuilder {
		private String method;
		private String url;
		private String username;
		private String password;
		private String headers;
		private String body;

		public HttpClientBuilder method(String method) {
			this.method = method;
			return this;
		}

		public HttpClientBuilder url(String url) {
			this.url = url;
			return this;
		}

		public HttpClientBuilder security(String username, String password) {
			this.username = username;
			this.password = password;
			return this;
		}

		public HttpClientBuilder headers(String headers) {
			this.headers = headers;
			return this;
		}

		public HttpClientBuilder body(String body) {
			this.body = body;
			return this;
		}
		
		public HttpClient build() {
			return new HttpClient(this);
		}
	}
	public String getMethod() {
		return method;
	}
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getHeaders() {
		return headers;
	}
	public String getBody() {
		return body;
	}
	@Override
	public String toString() {
		return "HttpClient [method=" + method + ", url=" + url + ", username=" + username + ", password=" + password
				+ ", headers=" + headers + ", body=" + body + "]";
	}
}
