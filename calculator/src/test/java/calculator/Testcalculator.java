package calculator;

 

import static org .junit.Assert.*;
 
import org.junit.Test;


public class Testcalculator {
	private static Calculator calculator;
	 
	@Test  
	public void testFindMax(){ 
		
		assertEquals(4,calculator.findMax(1,3,4));  
		 
	} 
	 
		@Test  
		public void testFindMax2(){ 
			
			assertEquals(6,calculator.findMax(1,3,4));  
			 
		}
		 
		@Test  
		public void testFindMax3(){ 
			
			assertNotEquals(6,calculator.findMax(1,3,4));  
			 
		}
	@Test  
	public void testSquare1(){
		
		assertEquals(9,calculator.square(3));  
	}
	
	@Test (expected = IllegalArgumentException.class) 
	public void testSquare2(){
		
		assertEquals(-1,calculator.cube(14));  
	}
	
	@Test  
	public void testSquare3(){
		
		assertEquals(9,calculator.square(3));  
	}
	
	@Test  
	public void testCube1(){
		
		assertEquals(27,calculator.cube(3));  
	}
	
	@Test  
	public void testCube2(){
		
		assertNotEquals(27,calculator.cube(3));  
	}
	
	@Test  
	public void testCube3(){
		
		assertEquals(32,calculator.cube(3));  
	}
	 
}

	


