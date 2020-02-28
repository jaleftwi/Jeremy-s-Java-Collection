package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	// Testing constructor SimpleList() on creating a list. Test should Succeed.
	@Test
	void testSimpleList1() {
		SimpleList test = new SimpleList();
		assertNotNull(test);
	}
		
	// Testing add() method on adding over the limit of 10 elements. Test should Succeed.
	@Test
	void testAdd1() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
		assertEquals("11 10 9 8 7 6 5 4 3 2 1", test.toString());
	}
		
	// Testing add() method on adding 10 unique elements in the list. Test should Succeed.
	@Test
	void testAdd2() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		assertEquals("10 9 8 7 6 5 4 3 2 1", test.toString());
	}
		
	// Testing add() method on adding same element to the list. Test should Fail.
	// Reason: Adding duplicates is entirely possible on the list.
	@Test
	void testAdd3() {
		SimpleList test = new SimpleList();
		test.add(5);
		test.add(5);
		assertEquals("5", test.toString());
	}
		
	// Testing remove() method on removing a single element from a full list. Test should Succeed.
	@Test
	void testRemove1() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.remove(3);
		assertEquals("2 1", test.toString());
	}
		
	// Testing remove() method on removing an element when a duplicate exists. Test should Fail.
	// Reason: remove() only removes the first instance of an element, not all instances.
	@Test
	void testRemove2() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(3);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.remove(3);
		assertEquals("10 9 8 7 6 5 2 1", test.toString());
	}

	// Testing count() method for simple addition of element. Test should Succeed.
	@Test
	void testCount1() {
		SimpleList test = new SimpleList();
		test.add(4);
		assertEquals(1, test.count());
	}
		
	// Testing count() method for adding 11 elements, despite list limit of 10. Test should Succeed
	@Test
	void testCount2() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
		assertEquals(11, test.count());
	}

	// Testing toString() method on simple message printing. Test should Succeed.
	@Test
	void testToString1() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		assertEquals("5 4 3 2 1", test.toString());
	}
		
	// Testing toString() method on empty message printing. Test should Succeed.
	@Test
	void testToString2() {
		SimpleList test = new SimpleList();
		assertEquals("", test.toString());
	}
		
	// Testing toString() method on printing a list that had its elements altered. Test should Succeed.
	@Test
	void testToString3() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
		assertEquals("11 10 9 8 7 6 5 4 3 2 1", test.toString());
	}
		
	// Testing search() for simple index location. Test should Succeed.
	@Test
	void testSearch1() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		assertEquals(1, test.search(7));
	}
		
	// Testing search() for element that doesn't exist. Test should Succeed.
	@Test
	void testSearch2() {
		SimpleList test = new SimpleList();
		test.add(2);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		assertEquals(-1, test.search(1));
	}
		
	// Testing search() for an element present twice in the list. Test should Fail.
	// Reason: search() will obtain only the first instance of the element in the list.
	@Test
	void testSearch3() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(1);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		assertEquals(9, test.search(1));
	}

	// Testing append
	@Test
	void testAppend1() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.append(11);
		assertEquals("10 9 8 7 6 5 4 3 2 1 11", test.toString());
	}

	// Testing if value is passing through
	@Test
	void testFirst1() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		assertEquals(2, test.first());
	}
	
	// Testing if dummy value is working
	@Test
	void testFirst2() {
		SimpleList test = new SimpleList();
		assertEquals(-1, test.first());
	}

	// Testing if value is passing through
	@Test
	void testLast1() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		assertEquals(1, test.last());
	}
	
	// Testing if dummy value is working
		@Test
		void testLast2() {
			SimpleList test = new SimpleList();
			assertEquals(-1, test.last());
		}

	// Testing size 10 (Initial size)
	@Test
	void testSize1() {
		SimpleList test = new SimpleList();
		assertEquals(10, test.size());
	}
	
	// Testing size 1
	@Test
	void testSize2() {
		SimpleList test = new SimpleList();
		test.add(2);
		assertEquals(1, test.size());
	}
	
	// Testing size 11
	@Test
	void testSize3() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
		assertEquals(11, test.size());
	}
	
	// Testing expansion
	@Test
	void testSize4() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
		assertEquals(15, test.size());
	}
	
	// Testing reduction
	@Test
	void testSize5() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
		test.add(12);
		System.out.println(test.toString());
		test.remove(12);
		assertEquals(12, test.size());
	}

	// Testing reduction 25%
	@Test
	void testSize6() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
		test.add(12);
		test.remove(12);
		test.remove(11);
		test.remove(10);
		test.remove(9);
		assertEquals(12, test.size());
	}
}
