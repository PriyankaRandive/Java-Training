package com.yash.TddExample.basicfourthex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TddExample.basicfourthex.SumOfExpression;

public class SumOfExpressionTest {
	SumOfExpression s=new SumOfExpression();
	@Test
	public void test_sumOf_Expression1()
	{
		assertEquals(s.calculateSum("2+3+4"), 9);
	}
	
	@Test
	public void test_sumOf_Expression2()
	{
		assertEquals(s.calculateSum("2+5+4"), 11);
	}
}
