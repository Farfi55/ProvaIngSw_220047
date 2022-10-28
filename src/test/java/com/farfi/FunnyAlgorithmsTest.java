package com.farfi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.UnsupportedOperationException;

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

	@org.junit.Test(expected = UnsupportedOperationException.class)
	public void stringToIntConverterUpperBound()
	{
		String input = "32768";
		fn.stringToIntConverter(input);
	}

	@org.junit.Test(expected = UnsupportedOperationException.class)
	public void stringToIntConverterLowerBound()
	{
		String input = "-32769";
		fn.stringToIntConverter(input);
	}

	@org.junit.Test(expected = IllegalArgumentException.class)
	public void stringToIntConverterNull()
	{
		String input = null;
		fn.stringToIntConverter(input);
	}
	@Test(expected = IllegalArgumentException.class)
	public void selectionSortOrderIllegalArgumentException()
	{
		int[] arr = new int[]{4, 7, 3, 0};
		int order = 3;
		fn.selectionSort(arr, order);
	}

	@Test
	public void selectionSortIncreasing()
	{
		int[] arr = new int[]{199, 7, 3, 0, -78};
		int[] expectedSorted = new int[]{-78, 0, 3, 7, 199};
		int order = 1;
		fn.selectionSort(arr, order);
		for (int i = 0; i < arr.length; i++)
		{
			Assert.assertEquals(arr[i], expectedSorted[i]);
		}
	}


	@Test
	public void selectionSortDecreasing()
	{
		int[] arr = new int[]{199, 7, 3, 0, -78};
		int[] expectedSorted = new int[]{199, 7, 3, 0, -78};
		int order = 0;
		fn.selectionSort(arr, order);
		for (int i = 0; i < arr.length; i++)
		{
			Assert.assertEquals(arr[i], expectedSorted[i]);
		}
	}


	@Test
	public void swapTest() {
		int[] arr = new int[] {3, 5, 8, 13, 17, 20};
		int[] expectedSwappedArr = new int[] {3, 5, 20, 13, 17, 8};
		int i = 2, j = 5;

		FunnyAlgorithms.swap(arr, i, j);

		for (int k = 0; k < arr.length; k++)
		{
			Assert.assertEquals(arr[k], expectedSwappedArr[k]);
		}
	}


	@Test
	public void binarySearchMissingElementTest() {
		int[] arr = new int[] {3, 5, 8, 13, 17, 20};
		int target = 15;

		Assert.assertEquals(fn.binarySearch(arr, target), -1);
	}



}