package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Intro.LevelTwoIntermediate;

public class LvlTwoTests {

	@Test
	
	public void blackJackTest() {
		
		int result = LevelTwoIntermediate.blackJack(0, 0);
		
		assertEquals(0, result);		
		
	}
	
	
	@Test
	
	public void uniqueSumTest() {
		
		int result = LevelTwoIntermediate.uniqueSum(1, 2, 3);
		
		assertEquals(6, result);		
		
	}
	
	@Test
	
	public void tooHotTest() {
		
		boolean result = LevelTwoIntermediate.tooHot(60, true);
		
		assertEquals(true, result);
		
	}
	

}
