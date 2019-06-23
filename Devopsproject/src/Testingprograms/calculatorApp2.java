package Testingprograms;

import org.testng.annotations.Test;

public class calculatorApp2 {
	
		int a= 100;
		int b= 200;
		
//this is test method	
		@Test
void sum() {
	System.out.println(a+b);

}@Test
		public void mul(){
			System.out.println(a*b);
		}
}
