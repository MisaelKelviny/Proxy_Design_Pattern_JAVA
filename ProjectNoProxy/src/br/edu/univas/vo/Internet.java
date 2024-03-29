package br.edu.univas.vo;

import java.util.ArrayList;

public class Internet {
	private String hostingName;
	public ArrayList<String> bannedSites = new ArrayList<String>(); 

	public Internet() {
		
	}
	
	public String getHostingName() {
		return hostingName;
	}

	public void setHostingName(String hostingName) {
		this.hostingName = hostingName;
	}
	
	public void bannedSites(String hosting) {
		this.bannedSites.add(hosting);
	}
	
	public void connectTo(String hosting) {
		if(bannedSites.contains(hosting.toLowerCase())) {
			System.out.println("** Denied ***");
		}else {
			System.out.println("Connecting to " + hosting);
		}
	}

}
