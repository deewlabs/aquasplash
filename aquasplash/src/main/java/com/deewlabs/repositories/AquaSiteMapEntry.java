package com.deewlabs.repositories;

import java.time.LocalDateTime;

public final class AquaSiteMapEntry {

	private final String pageName;
	private final String content;
	private final LocalDateTime localDateTime;
	public AquaSiteMapEntry(String pageName, String content, LocalDateTime localDateTime) {
		//super();
		this.pageName = pageName;
		this.content = content;
		this.localDateTime = localDateTime;
	}
	
}
