package com.lam.utilString;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LetterCountTest {
	public static final String DirIn = "./src/test/resources/dataIn/";
	public static final String DataIn = DirIn + "data2";

	LetterCount letterCount;
	
	@Before
	public void setUp() throws Exception {
		this.letterCount = new LetterCount(DataIn); 	
	}

	@After
	public void tearDown() throws Exception {
		this.letterCount = null;
	}

	@Test
	public void testProcessFileException() {
		this.letterCount = new LetterCount("XXX"); 	
		try {
			this.letterCount.processFile();
			Assert.fail("Failure to throe exception");
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	@Test
	public void testProcessFile() {
		this.letterCount = new LetterCount(DataIn); 	
		try {
			this.letterCount.processFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(new Integer(40), this.letterCount.getMap().get('e'));
		Assert.assertEquals(new Integer(32), this.letterCount.getMap().get('a'));
		Assert.assertEquals(new Integer(24), this.letterCount.getMap().get('t'));
		Assert.assertEquals(new Integer(22), this.letterCount.getMap().get('s'));
		Assert.assertEquals(new Integer(20), this.letterCount.getMap().get('n'));
		Assert.assertEquals(new Integer(19), this.letterCount.getMap().get('r'));
		Assert.assertEquals(new Integer(13), this.letterCount.getMap().get('d'));
	}

	@Test
	public void testProcessLine() {
		this.letterCount.processWord("Terrassa, capital ");
		Assert.assertEquals(new Integer(2), this.letterCount.getMap().get('t'));
		Assert.assertEquals(new Integer(1), this.letterCount.getMap().get('e'));
		Assert.assertEquals(new Integer(2), this.letterCount.getMap().get('r'));
		Assert.assertEquals(new Integer(4), this.letterCount.getMap().get('a'));
		Assert.assertEquals(new Integer(2), this.letterCount.getMap().get('s'));
		Assert.assertEquals(new Integer(1), this.letterCount.getMap().get('c'));
		Assert.assertEquals(new Integer(1), this.letterCount.getMap().get('p'));
		Assert.assertEquals(new Integer(1), this.letterCount.getMap().get('i'));
		Assert.assertEquals(new Integer(1), this.letterCount.getMap().get('l'));
	}

	@Test
	public void testProcessWord() {
		this.letterCount.processWord("Terrassa");
		Assert.assertEquals(new Integer(1), this.letterCount.getMap().get('t'));
		Assert.assertEquals(new Integer(1), this.letterCount.getMap().get('e'));
		Assert.assertEquals(new Integer(2), this.letterCount.getMap().get('r'));
		Assert.assertEquals(new Integer(2), this.letterCount.getMap().get('a'));
		Assert.assertEquals(new Integer(2), this.letterCount.getMap().get('s'));
	}

	@Test
	public void testGetMap() {
		this.letterCount.processWord("Terrassa");
		Assert.assertEquals(5, this.letterCount.getMap().size());
	}

}
