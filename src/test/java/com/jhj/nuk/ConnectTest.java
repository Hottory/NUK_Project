package com.jhj.nuk;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import com.jhj.product.ProductDAO;

public class ConnectTest extends AbstractTestCase{
	@Inject
	private ProductDAO dao;
	
	@Test
	public void test() throws Exception {
		int n = dao.getCount();
		assertEquals(0, n);
	}

}
