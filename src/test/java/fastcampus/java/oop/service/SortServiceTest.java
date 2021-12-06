package fastcampus.java.oop.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import fastcampus.java.oop.logic.JavaSort;

public class SortServiceTest {

	private SortService sut = new SortService(new JavaSort<String>());

	@Test
	public void test() {
		// Given

		// When
		List<String> actual = sut.doSort(Arrays.asList("3", "2", "1"));
		// Then
		assertEquals(Arrays.asList("1", "2", "3"), actual);
	}
}
