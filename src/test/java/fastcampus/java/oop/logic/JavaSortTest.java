package fastcampus.java.oop.logic;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class JavaSortTest {
	@Test
	public void given_List_WhenExecuting_ThenReturnSortedList() {
		// Given
		JavaSort<Integer> javaSort = new JavaSort<>();
		// When
		List<Integer> actual = javaSort.sort(Arrays.asList(3, 2, 4, 5, 1));

		// Then
		assertEquals(Arrays.asList(1, 2, 3, 4, 5), actual);
	}
}
