/**
 * 
 */
package com.lam.utilDate;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lazuajemolle
 *
 */
public class WeekDayTest extends TestCase {
    WeekDay week_day;

    @Override
	@Before
    public void setUp() throws Exception {
         super.setUp();	 
         this.week_day = new WeekDay();
    }

    @Override
	@After
    public void tearDown() throws Exception {
    	super.tearDown();
        this.week_day = null;
    }

    @Test
    public void testCheckWeekDay() {
        TestCase.assertEquals( "Monday", this.week_day.getDay(4, 26, 1999) );
    }

    @Test
    public void testCheckDateBoundaries() {
        try {
            this.week_day.getDay(2, 31, 1999);
            TestCase.fail("Expected exception failed to be thrown");
        } catch (RuntimeException e) {
//        	e.printStackTrace();
        }
        
        try {
            this.week_day.getDay(2, 29, 1999);
            TestCase.fail("Expected exception failed to be thrown");
        } catch (RuntimeException e) {
        } 

        try {
            this.week_day.getDay(4, 31, 1999);
            TestCase.fail("Expected exception failed to be thrown");
        } catch (RuntimeException e) {
        } 
    }

    @Test
    public void testCheckWeekDaySystemTest() {
        TestCase.assertEquals("Tuesday", this.week_day.getDay(11, 18, 1997));
        TestCase.assertEquals("Thursday", this.week_day.getDay(6, 6, 1991));
        TestCase.assertEquals("Monday", this.week_day.getDay(1, 1, 1990) );
        TestCase.assertEquals("Saturday", this.week_day.getDay(2, 29, 1992));
        TestCase.assertEquals("Friday", this.week_day.getDay(12, 31, 1999));
    }
}
