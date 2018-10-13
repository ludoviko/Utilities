package com.lam.utilString;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class StringParserTest {
	StringParser parser;
	
	@Before
	public void setUp() throws Exception {
		this.parser = new StringParser();
	}

	@After
	public void tearDown() throws Exception {
		this.parser = null;
	}

	@Test
	public void testParse() {
		 org.junit.Assert.assertArrayEquals(new String[] {"delimiter","the","is","period"}, this.parser.parse(".period.is.the..delimiter").toArray(new String[] {} ));
		 org.junit.Assert.assertArrayEquals(new String[] {"test","a","is","this"}, this.parser.parse("AAthisAAAisAaAAtestAAA").toArray(new String[] {} ));
	}

	@Test
	public void parseSystemTest() {
		 org.junit.Assert.assertArrayEquals(new String[] {}, this.parser.parse(".").toArray(new String[] {} ));
		 org.junit.Assert.assertArrayEquals(new String[] {"test", "a", "is", "This"}, this.parser.parse(",This,is,,,a,test,").toArray(new String[] {} ));
		 org.junit.Assert.assertArrayEquals(new String[] {"YOU", "RE", "HOW", "HI"}, this.parser.parse("AHIAHOWAAREAYOU").toArray(new String[] {} ));
		 org.junit.Assert.assertArrayEquals(new String[] {"ZZ", "ZZ"}, this.parser.parse("zZZzZZ").toArray(new String[] {} ));
		 org.junit.Assert.assertArrayEquals(new String[] {"A a", "3", "1 HO 2?"}, this.parser.parse("-1 HO 2?-3-A a").toArray(new String[] {} ));
	}
}
