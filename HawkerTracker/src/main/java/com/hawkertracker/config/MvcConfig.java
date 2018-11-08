package com.hawkertracker.config;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hawkertracker.constants.ApplicationProperty;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
   @Autowired 
   ApplicationProperty appProp;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
        .addResourceHandler("images/**")
        .addResourceLocations(appProp.APPSTOREPATH+File.separator+appProp.IMAGEPATH+File.separator); 
	}
}
