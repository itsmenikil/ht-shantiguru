package com.hawkertracker.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperty {

	@Value("${app.store.path}")
	public String APPSTOREPATH;
	@Value("${image.path}")
	public  String IMAGEPATH;
	@Value("${logo.path}")
	public  String LOGOPATH;
	@Value("${product.path}")
	public  String PRODUCTPATH;
	
	
}
