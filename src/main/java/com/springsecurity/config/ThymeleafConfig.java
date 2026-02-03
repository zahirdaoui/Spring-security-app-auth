package com.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class ThymeleafConfig {

	 @Bean
	    public SpringResourceTemplateResolver templateResolver() {
	        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
	        resolver.setPrefix("/WEB-INF/views/");
	        resolver.setSuffix(".html");
	        resolver.setTemplateMode(TemplateMode.HTML);
	        resolver.setCharacterEncoding("UTF-8");
	        resolver.setCacheable(false); // good for dev
	        return resolver;
	    }

	    @Bean
	    public SpringTemplateEngine templateEngine() {
	        SpringTemplateEngine engine = new SpringTemplateEngine();
	        engine.setTemplateResolver(templateResolver());
	        engine.setEnableSpringELCompiler(true);
	        return engine;
	    }

	    @Bean
	    public ThymeleafViewResolver viewResolver() {
	        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	        resolver.setTemplateEngine(templateEngine());
	        resolver.setCharacterEncoding("UTF-8");
	        return resolver;
	    }
}