package kxj;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FulijisuanTest {

	Fulijisuan cal;
	@Before
	public void setUp() throws Exception {
		cal=new Fulijisuan();
	}

	@Test
	public void testBenjin() {
		double n=10;
		double f=3000000;
		double i=0.03;
		double p=(float) (f*1/Math.pow(1+i, n));
		Assert.assertEquals(2232281, p, 1.0);       
	}

	@Test
	public void testNianshu() {
	double f=2000000;
	double p=1000000;
	double i=0.1;
	double  n=Logarithm.log(f/p,1+i);;
	Assert.assertEquals(8, n, 1.0);    
	}

	@Test
	public void testLilv() {
	double f=2000000;
	double p=1000000;
	double n=10;
	double i=Math.pow(f/p, 1.0/n)-1;
	Assert.assertEquals(0.072, i, 0.005);  
	}


}
