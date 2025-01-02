package com.prorigo.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.prorigo.thrillio.constants.BookGenre;
import com.prorigo.thrillio.constants.MovieGenre;
import com.prorigo.thrillio.managers.BookmarkManager;

public class BookTest {

	@Test
	public void testIsKidFriendlEligible() {
		//Test1
		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications", new String[] {"Henry David Thoreau"}, BookGenre.PHILOSOPHY, 4.3);
		
		boolean isKidFriendlyEligible = book.isKidFriendlyEligible();
		
		assertFalse("For Philosophy Genre - isKidFriendly should return false", isKidFriendlyEligible);
		
		//Test2
		
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications", new String[] {"Henry David Thoreau"}, BookGenre.SELF_HELP, 4.3);
		
		isKidFriendlyEligible = book.isKidFriendlyEligible();
		
		assertFalse("For self help Genre - isKidFriendly should return false", isKidFriendlyEligible);
	}

}
