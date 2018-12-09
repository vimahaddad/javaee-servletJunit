package io.github.oliviercailloux.y2018.vimahaddad.javaee_servletJunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloServletTest {

	@Test
	void testSayHello() {
		HelloServlet hello = new HelloServlet();
		assertTrue(hello.sayHello().equals("Hello world"),"sayHello() doit renvoyer Hello world");
	}
	
}
