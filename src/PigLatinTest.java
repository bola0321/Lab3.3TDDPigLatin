import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

	@Test
	void testVowelA() {
		String result = PigLatin.translate("apple");
		assertEquals("appleway", result );
	}
	@Test
	void testVowelE() {
		String result = PigLatin.translate("ether");
		assertEquals("etherway", result);
	}
	@Test
	void testVowelI() {
		String result = PigLatin.translate("indigo");
		assertEquals("indigoway", result);
	}
	@Test
	void testVowelO() {
		String result = PigLatin.translate("options");
		assertEquals("optionsway", result);
	}
	@Test
	void testVowelU() {
		String result = PigLatin.translate("umbrage");
		assertEquals("umbrageway", result);
	}
	@Test
	void testOneconst1() {
		String result = PigLatin.translate("giraffe");
		assertEquals("iraffegay", result);		
	}
	@Test
	void testOneconst12() {
		String result = PigLatin.translate("cape");
		assertEquals("apecay", result);
	}
	@Test
	void testTwoconst1() {
		String result = PigLatin.translate("crave");
		assertEquals("avecray", result);
	}
	@Test
	void testTwoconst2() {
		String result = PigLatin.translate("think");
		assertEquals("inkthay", result);
	}
	
	@Test
	void testThreeconst1() {
		String result = PigLatin.translate("thwart");
		assertEquals("artthway", result);
	}
	
	@Test
	void testThreeconst2() {
		String result = PigLatin.translate("school");
		assertEquals("oolschay", result);
	}
	@Test
	void testContraction1() {
		String result = PigLatin.translate("can't");
		assertEquals("an'tcay", result);
	}
	@Test
	void testContraction2() {
		String result = PigLatin.translate("shouldn't");
		assertEquals("ouldn'tshay", result);
	}
}
