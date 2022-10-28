package com.farfi;

import org.junit.Assert;
import org.junit.Before;

public class FunnyAlgorithmsTest
{
	private FunnyAlgorithms fn;

	@Before
	public void BeforeTest()
	{
		fn = new FunnyAlgorithms();
	}


	@org.junit.Test
	public void stringToIntConverterShouldParseCorrectly()
	{
		String[] inputs = new String[]{"-3", "500", "-10", "32767"};
		int[] expectedOutputs = new int[]{-3, 500, -10, 32767};
		for (int i = 0; i < inputs.length; i++) {
			String input = inputs[i];
			int expectedOutput = expectedOutputs[i];
			Assert.assertEquals(fn.stringToIntConverter(input), expectedOutput);
		}
	}

	@org.junit.Test(expected = IllegalArgumentException.class)
	public void stringToIntConverterShouldThrowIllegalArgumentException()
	{
		String input = "2 3";
		fn.stringToIntConverter(input);
	}
}