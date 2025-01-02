package com.prorigo.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.prorigo.thrillio.constants.MovieGenre;
import com.prorigo.thrillio.managers.BookmarkManager;

public class MovieTest {

	@Test
	public void testIsKidFriendlEligible() {
		//Test1
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941, new String[] {"Orson Welles", "Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.HORROR, 8.5);
		
		boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
		
		assertFalse("For Horror Genre - isKidFriendly should return false", isKidFriendlyEligible);
		
		//Test2
		
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941, new String[] {"Orson Welles", "Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.THRILLERS, 8.5);
		
		isKidFriendlyEligible = movie.isKidFriendlyEligible();
		
		assertFalse("For Thirllers Genre - isKidFriendly should return false", isKidFriendlyEligible);
	}

}
