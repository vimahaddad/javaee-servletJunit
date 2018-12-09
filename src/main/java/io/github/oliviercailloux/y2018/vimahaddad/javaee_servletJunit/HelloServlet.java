package io.github.oliviercailloux.y2018.vimahaddad.javaee_servletJunit;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

@SuppressWarnings("serial")
@WebServlet("/hello")

public class HelloServlet extends HttpServlet {

	public String sayHello() {
		return "Hello world";
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
		resp.setContentType(MediaType.TEXT_PLAIN);
		resp.setLocale(Locale.FRENCH);
		@SuppressWarnings("resource")
		final ServletOutputStream out = resp.getOutputStream();
		out.println(this.sayHello());
	}
	
}