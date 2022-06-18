package org.chinson.tokenauth.authserver;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/auth")
	public AuthResource auth(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new AuthResource(counter.incrementAndGet(), String.format(template, name));
	}
}