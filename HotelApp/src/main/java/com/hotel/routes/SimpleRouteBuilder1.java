package com.hotel.routes;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder1 extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:\\Users\\Hari\\Desktop\\inbox?noop=true").doTry().setHeader("subject", simple("JavaInUse Invitation111"))
				.setHeader("to", simple("hmr.inat@gmail.com"))
				.to("smtps://smtp.gmail.com:465?username=testcamel99@gmail.com&password=12345678aB");
	}
}