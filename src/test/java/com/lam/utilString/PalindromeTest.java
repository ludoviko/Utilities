package com.lam.utilString;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest  {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsPalindromeString() {
		Assert.assertTrue(Palindrome.isPalindrome(""));
		Assert.assertTrue(Palindrome.isPalindrome("abba"));
		Assert.assertTrue(Palindrome.isPalindrome("a"));
		Assert.assertTrue(Palindrome.isPalindrome("aba"));
		Assert.assertTrue(Palindrome.isPalindrome("abXba"));
		Assert.assertTrue(Palindrome.isPalindrome("adan nada"));
		
		String string = "pgNtDJeBjnxDxkdKTyGhMF{pinIdypWSOUfCqFLWuvYFKvsuczNxgRvHuOZmmouJucH" +
				"j[DlhLwnSocmcrMCltuwhvqjEnDpeIeKjbFdCNEzsNkZhepYP[uD[mlkVwXt[NiLjoNxgPTSVSivgWtjRdNQjjePpQrERjG" +
				"KobNUvWdXqnWbqWbSSpizKcDDKyGTIruwbqSmioKDG{YiGMhlSroLOFpRHhIjMMCBWdsdlDPUK[nFDsMyjPOG{XClqcsB" +
				"WzKOxsVIejVqCMyOebKeRqRFc[GgHbDxCtMrrnEdfbsRXCGgWrvjOTOWXBCMIyntcQRgUvUYMePMdJnXljKfNkpWGNPRHG" +
				"bgOMD[qwQERqoXgoEQipSzXmLiGHeofoubFLcEELFqPD[bRoTMMToRb[DPqFLEEcLFbuofoeHGiLmXzSpiQEogXoqREQwq" +
				"[DMOgbGHRPNGWpkNfKjlXnJdMPeMYUvUgRQctnyIMCBXWOTOjvrWgGCXRsbfdEnrrMtCxDbHgG[cFRqReKbeOyMCqVjeIVs" +
				"xOKzWBscqlCX{GOPjyMsDFn[KUPDldsdWBCMMjIhHRpFOLorSlhMGiY{GDKoimSqbwurITGyKDDcKzipSSbWqbWnqXdWvUN" +
				"boKGjRErQpPejjQNdRjtWgviSVSTPgxNojLiN[tXwVklm[Du[PYpehZkNszENCdFbjKeIepDnEjqvhwutlCMrcmcoSnwLhl" +
				"D[jHcuJuommZOuHvRgxNzcusvKFYvuWLFqCfUOSWpydInip{FMhGyTKdkxDxnjBeJDtNgp";
		Assert.assertTrue(Palindrome.isPalindrome(string, true));
	}

	@Test
	public void testIsNotPalindromeString() {
		Assert.assertFalse(Palindrome.isPalindrome("az"));
		Assert.assertFalse(Palindrome.isPalindrome("abza"));
		Assert.assertFalse(Palindrome.isPalindrome("2abba"));
		Assert.assertFalse(Palindrome.isPalindrome("fabXba"));
		Assert.assertFalse(Palindrome.isPalindrome("ggadan nada"));
		String string = "XYZpgNtDJeBjnxDxkdKTyGhMF{pinIdypWSOUfCqFLWuvYFKvsuczNxgRvHuOZmmouJucH" +
				"j[DlhLwnSocmcrMCltuwhvqjEnDpeIeKjbFdCNEzsNkZhepYP[uD[mlkVwXt[NiLjoNxgPTSVSivgWtjRdNQjjePpQrERjG" +
				"KobNUvWdXqnWbqWbSSpizKcDDKyGTIruwbqSmioKDG{YiGMhlSroLOFpRHhIjMMCBWdsdlDPUK[nFDsMyjPOG{XClqcsB" +
				"WzKOxsVIejVqCMyOebKeRqRFc[GgHbDxCtMrrnEdfbsRXCGgWrvjOTOWXBCMIyntcQRgUvUYMePMdJnXljKfNkpWGNPRHG" +
				"bgOMD[qwQERqoXgoEQipSzXmLiGHeofoubFLcEELFqPD[bRoTMMToRb[DPqFLEEcLFbuofoeHGiLmXzSpiQEogXoqREQwq" +
				"[DMOgbGHRPNGWpkNfKjlXnJdMPeMYUvUgRQctnyIMCBXWOTOjvrWgGCXRsbfdEnrrMtCxDbHgG[cFRqReKbeOyMCqVjeIVs" +
				"xOKzWBscqlCX{GOPjyMsDFn[KUPDldsdWBCMMjIhHRpFOLorSlhMGiY{GDKoimSqbwurITGyKDDcKzipSSbWqbWnqXdWvUN" +
				"boKGjRErQpPejjQNdRjtWgviSVSTPgxNojLiN[tXwVklm[Du[PYpehZkNszENCdFbjKeIepDnEjqvhwutlCMrcmcoSnwLhl" +
				"D[jHcuJuommZOuHvRgxNzcusvKFYvuWLFqCfUOSWpydInip{FMhGyTKdkxDxnjBeJDtNgp";
		Assert.assertFalse(Palindrome.isPalindrome(string, true));
	}
}
