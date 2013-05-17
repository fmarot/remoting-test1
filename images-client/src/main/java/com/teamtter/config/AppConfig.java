package com.teamtter.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.SimpleHttpInvokerServiceExporter;
import org.springframework.remoting.support.SimpleHttpServerFactoryBean;

import com.sun.net.httpserver.HttpHandler;
import com.teamtter.service.ImageService;
import com.teamtter.services.IImageService;

@Configuration
public class AppConfig {

	private static final int PORT = 8090;

	@Bean
	public ImageService imageService() {
		return new ImageService();
	}

	@Bean
	public SimpleHttpInvokerServiceExporter serviceExporter() {
		SimpleHttpInvokerServiceExporter exporter = new SimpleHttpInvokerServiceExporter();
		exporter.setService(this.imageService());
		exporter.setServiceInterface(IImageService.class);
		return exporter;
	}

	public static final String DEFAULT_CONTEXT_ROOT = "/remoting/";

	@Bean
	public SimpleHttpServerFactoryBean httpServerFactoryBean() {
		Map<String, HttpHandler> contexts = new HashMap<String, HttpHandler>();
		contexts.put(DEFAULT_CONTEXT_ROOT + IImageService.class.getName(), serviceExporter());
		SimpleHttpServerFactoryBean serverFactory = new SimpleHttpServerFactoryBean();
		serverFactory.setContexts(contexts);
		serverFactory.setPort(PORT);
		return serverFactory;
	}
}