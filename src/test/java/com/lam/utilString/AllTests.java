package com.lam.utilString;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	ExtractNumbersTest.class, 
	HungarianCurrencyFormatTest.class,
	LetterCountTest.class,
	LevenshteinWordDistanceCalculatorTest.class,
	NumberToLettersTest.class,
	PalindromeTest.class, 
	PalindromicSlicesTest.class,
	PalindromizeTest.class,
	RomanNumberTest.class,
	SoundexPhoneticEncoderTest.class,
	StringParserTest.class,
	StringUtilsTest.class,
	UserNameTest.class,
	WordCountTest.class 
	})

public class AllTests {
}
