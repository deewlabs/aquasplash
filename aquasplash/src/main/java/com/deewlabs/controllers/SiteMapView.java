package com.deewlabs.controllers;

import java.io.Writer;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import com.deewlabs.services.SiteMapService;

@Component
public class SiteMapView extends AbstractView{

	
	private  SiteMapService service;
	@Override
	protected void renderMergedOutputModel(Map<String, Object> arg0, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType(MediaType.APPLICATION_XML_VALUE); 

		try (Writer writer = response.getWriter()) {
			//writer.append(service.createSitemap()); 
		}

		
	}
	

}
