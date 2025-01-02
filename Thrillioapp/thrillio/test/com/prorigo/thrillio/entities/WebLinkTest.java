package com.prorigo.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.prorigo.thrillio.managers.BookmarkManager;

public class WebLinkTest {

	@Test
	public void testIsKidFriendlyEligible() {
		
		//Test 1 : porn in url -- false
		WebLink webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tigerporn--part-2.html", "http://www.javaworld.com");
		
		boolean isKidFriendlyEligible = webLink.isKidFriendlyEligible();
	
		assertFalse("For porn in url - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
	
		//Test 2 : porn  must be present in title
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger porn, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com");
		
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
	
		assertFalse("For porn in title - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
	
		//Test 3: Adult in host -- false
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworldadult.com");
		
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
	
		assertFalse("For adult in host - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
	
		//Test 4: adult in url, but not in host part -- true
		
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", "http://www.javaworldadult.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com");
		
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
	
		assertTrue("For adult in url but not host - isKidFriendlyEligible() must return true", isKidFriendlyEligible);
		
		// Test 5: adult in title only -- true
	
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming adult, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com");
		
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
	
		assertTrue("For adult in title - isKidFriendlyEligible() must return true", isKidFriendlyEligible);
		
	}
	

}
