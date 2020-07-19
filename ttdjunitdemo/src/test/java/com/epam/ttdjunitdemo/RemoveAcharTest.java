package com.epam.ttdjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAcharTest {
    /*TODO
     *1.ABCD => BCD
     *2.AACD => CD 
     *3.BACD => BCD
     *4.BBAA => BBAA       
     *5.AABAA => BAA
     *6."" => ""
     *7.A => ""
     *8.AA => ""
     *9.AB => B
     *10.BA => B
    */
	RemoveA removeA;
	@BeforeEach
	void setUp() {
		removeA=new RemoveA();
	}
	@Test
	void test1() {
		assertEquals("BCD",removeA.remove("ABCD"));
	}
	@Test
	void test2() {
		assertEquals("CD",removeA.remove("AACD"));
	}
	@Test
	void test3() {
		assertEquals("BCD",removeA.remove("BACD"));
	}
	@Test
	void test4() {
		assertEquals("BBAA",removeA.remove("BBAA"));
	}
	@Test
	void test5() {
		assertEquals("BAA",removeA.remove("AABAA"));
	}
	@Test
	void test6() {
		assertEquals("",removeA.remove(""));
	}
	@Test
	void test7() {
		assertEquals("",removeA.remove("A"));
	}
	@Test
	void test8() {
		assertEquals("",removeA.remove("AA"));
	}
	@Test
	void test9() {
		assertEquals("B",removeA.remove("AB"));
	}
	@Test
	void test10() {
		assertEquals("B",removeA.remove("BA"));
	}
	
}
