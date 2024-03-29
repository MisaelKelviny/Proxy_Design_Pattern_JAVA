package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.interfaces.Internet;

public class ProxyInternet implements Internet{

	private Internet internet = new InternetClass(); 
    private static List<String> bannedSites;
	
    static
    { 
        bannedSites = new ArrayList<String>(); 
        bannedSites.add("youtube.com"); 
        bannedSites.add("twitter.com"); 
        bannedSites.add("facebook.com"); 
    }
    
	@Override
	public void connectTo(String hosting) {
		if(bannedSites.contains(hosting.toLowerCase())) 
        { 
           System.out.println("** Denied **"); 
        }else {
        	internet.connectTo(hosting);         	
        }
          
	}

}
