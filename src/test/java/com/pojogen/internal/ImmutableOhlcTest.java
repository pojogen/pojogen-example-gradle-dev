package com.pojogen.internal;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class ImmutableOhlcTest {

	@Test
	public void testImmutableOhlcGetters() {
		BigDecimal open = BigDecimal.valueOf(100);
		BigDecimal high = BigDecimal.valueOf(102);
		BigDecimal low = BigDecimal.valueOf(98);
		BigDecimal close = BigDecimal.valueOf(101);
		
		Ohlc ohlc = new ImmutableOhlc(open, high, low, close);
		
		assertEquals(open, ohlc.getOpen());
		assertEquals(high, ohlc.getHigh());
		assertEquals(low, ohlc.getLow());
		assertEquals(close, ohlc.getClose());
	}
}
