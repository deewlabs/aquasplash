package com.deewlabs.repositories;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public final class AquaSiteMapRepository {

	public final List<AquaSiteMapEntry> siteList=new ArrayList<>();
	public AquaSiteMapRepository(){
		save(new AquaSiteMapEntry("aqua", "homepage", LocalDateTime.now()));
		save(new AquaSiteMapEntry("pack", "package page", LocalDateTime.now()));
		save(new AquaSiteMapEntry("gallery", "gallery page", LocalDateTime.now()));
		save(new AquaSiteMapEntry("activities", "activities page", LocalDateTime.now()));
		save(new AquaSiteMapEntry("about", "about page", LocalDateTime.now()));
		save(new AquaSiteMapEntry("contact", "contact page", LocalDateTime.now()));
	}
	
	private void save(AquaSiteMapEntry entry){
		siteList.add(entry);
	}
	
}
