package org.chinson.tokenauth.authserver;

public class AuthResource {

	private final long id;
	private final String content;

	public AuthResource(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}