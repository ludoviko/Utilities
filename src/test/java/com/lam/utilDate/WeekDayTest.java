/**
 * 
 */
package com.lam.utilDate;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lazuajemolle
 *
 */
public class WeekDayTest {
    WeekDay week_day;

	@Before
    public void setUp() throws Exception {
         this.week_day = new WeekDay();
    }

	@After
    public void tearDown() throws Exception {
        this.week_day = null;
    }

    @Test
    public void testCheckWeekDay() {
        Assert.assertEquals("Monday", this.week_day.getDay(4, 26, 1999));
    }

    @Test
    public void testCheckDateBoundaries() {
        try {
            this.week_day.getDay(2, 31, 1999);
            Assert.fail("Expected exception failed to be thrown");
        } catch (RuntimeException e) {
//        	e.printStackTrace();
        }
        
        try {
            this.week_day.getDay(2, 29, 1999);
            Assert.fail("Expected exception failed to be thrown");
        } catch (RuntimeException e) {
        } 

        try {
            this.week_day.getDay(4, 31, 1999);
            Assert.fail("Expected exception failed to be thrown");
        } catch (RuntimeException e) {
        } 
    }

    @Test
    public void testCheckWeekDaySystemTest() {
        Assert.assertEquals("Tuesday", this.week_day.getDay(11, 18, 1997));
        Assert.assertEquals("Thursday", this.week_day.getDay(6, 6, 1991));
        Assert.assertEquals("Monday", this.week_day.getDay(1, 1, 1990));
        Assert.assertEquals("Saturday", this.week_day.getDay(2, 29, 1992));
        Assert.assertEquals("Friday", this.week_day.getDay(12, 31, 1999));
    }
}
