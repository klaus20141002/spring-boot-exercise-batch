package com.julie.mikaelson;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebBean extends WebMvcConfigurerAdapter {
	private final Logger logger = Logger.getLogger(WebBean.class) ;
	
	@Bean
	public InternalResourceViewResolver setupInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		logger.info("-----------------------------------setupInternalResourceViewResolver invoke-----------------------------------------");
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
}