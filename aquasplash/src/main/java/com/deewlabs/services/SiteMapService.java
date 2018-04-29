package com.deewlabs.services;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.deewlabs.repositories.AquaSiteMapRepository;

@Service
public class SiteMapService {

	private final String BASE_URL="http://www.aquasplashcamp.com/";
	private final AquaSiteMapRepository siteMapRepository;
	
	@Inject
	public SiteMapService(AquaSiteMapRepository siteMapRepository) {
		this.siteMapRepository=siteMapRepository;
	}
	
	public void createSiteMap(){
//		WebSitemapGenerator sitemap = new WebSitemapGenerator(BASE_URL);
//
//		for (BlogEntry entry : blogRepository.findAll()) {
//			sitemap.addUrl(BASE_URL + "/blog/" + entry.getTitle());
//		}
//
//		return String.join("", sitemap.writeAsStrings()); 
		
	}
}
