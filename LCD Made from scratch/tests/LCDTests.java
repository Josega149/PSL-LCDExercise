import org.junit.Test;

import junit.framework.TestCase;
import main.Digit;
import main.PrinterLCD;

/**
 * 
 * LCDTest
 * 
 * Only test the width, because the height is built from printer() which returns void.
 * Nevertheless, the rule of height is fulfilled because the method prints 3 lines: TOP_HORIZONTAL, MIDDLE, BOT_HORIZONTAL
 * and between them always prints size times  TOP_VERTICAL and BOT_VERTICAL. Always prints 3+size*2 rows.
 * 
 *In all cases the assert is anw.length()-1 because the method create line concatenates a space at the end. 
 *This space is not part of the digit, it exists in order to beautify the printing.
 */
public class LCDTests extends TestCase{
	
	PrinterLCD printer = new PrinterLCD(true);
	
	/**
	 * Test the width. Rule of Columns: Number of columns must be equals to size+2  
	 * 
	 * Test from size 2 to 10 if the number of columns is correct for the number 0.
	 */
	@Test
	public void testWidthFor0() {
		//from size 1 to 10
		//Test first line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("0").toCharArray() , i , Digit.TOP_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test second line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("0").toCharArray() , i , Digit.TOP_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test third line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("0").toCharArray() , i , Digit.MIDDLE);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fourth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("0").toCharArray() , i , Digit.BOT_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fifth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("0").toCharArray() , i , Digit.BOT_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
	}
	/**
	 * Test the width. Rule of Columns: Number of columns must be equals to size+2  
	 * 
	 * Test from size 2 to 10 if the number of columns is correct for the number 1.
	 */
	@Test
	public void testWidthFor1() {
		//from size 1 to 10
		//Test first line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("1").toCharArray() , i , Digit.TOP_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test second line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("1").toCharArray() , i , Digit.TOP_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test third line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("1").toCharArray() , i , Digit.MIDDLE);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fourth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("1").toCharArray() , i , Digit.BOT_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fifth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("1").toCharArray() , i , Digit.BOT_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
	}
	/**
	 * Test the width. Rule of Columns: Number of columns must be equals to size+2  
	 * 
	 * Test from size 2 to 10 if the number of columns is correct for the number 2.
	 */
	@Test
	public void testWidthFor2() {
		//from size 1 to 10
		//Test first line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("2").toCharArray() , i , Digit.TOP_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test second line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("2").toCharArray() , i , Digit.TOP_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test third line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("2").toCharArray() , i , Digit.MIDDLE);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fourth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("2").toCharArray() , i , Digit.BOT_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fifth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("2").toCharArray() , i , Digit.BOT_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
	}
	/**
	 * Test the width. Rule of Columns: Number of columns must be equals to size+2  
	 * 
	 * Test from size 2 to 10 if the number of columns is correct for the number 3.
	 */
	@Test
	public void testWidthFor3() {
		//from size 1 to 10
		//Test first line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("3").toCharArray() , i , Digit.TOP_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test second line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("3").toCharArray() , i , Digit.TOP_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test third line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("3").toCharArray() , i , Digit.MIDDLE);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fourth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("3").toCharArray() , i , Digit.BOT_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fifth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("3").toCharArray() , i , Digit.BOT_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
	}
	/**
	 * Test the width. Rule of Columns: Number of columns must be equals to size+2  
	 * 
	 * Test from size 2 to 10 if the number of columns is correct for the number 4.
	 */
	@Test
	public void testWidthFor4() {
		//from size 1 to 10
		//Test first line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("4").toCharArray() , i , Digit.TOP_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test second line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("4").toCharArray() , i , Digit.TOP_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test third line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("4").toCharArray() , i , Digit.MIDDLE);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fourth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("4").toCharArray() , i , Digit.BOT_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fifth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("4").toCharArray() , i , Digit.BOT_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
	}
	/**
	 * Test the width. Rule of Columns: Number of columns must be equals to size+2  
	 * 
	 * Test from size 2 to 10 if the number of columns is correct for the number 5.
	 */
	@Test
	public void testWidthFor5() {
		//from size 1 to 10
		//Test first line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("5").toCharArray() , i , Digit.TOP_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test second line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("5").toCharArray() , i , Digit.TOP_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test third line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("5").toCharArray() , i , Digit.MIDDLE);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fourth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("5").toCharArray() , i , Digit.BOT_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fifth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("5").toCharArray() , i , Digit.BOT_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
	}
	/**
	 * Test the width. Rule of Columns: Number of columns must be equals to size+2  
	 * 
	 * Test from size 2 to 10 if the number of columns is correct for the number 6.
	 */
	@Test
	public void testWidthFor6() {
		//from size 1 to 10
		//Test first line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("6").toCharArray() , i , Digit.TOP_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test second line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("6").toCharArray() , i , Digit.TOP_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test third line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("6").toCharArray() , i , Digit.MIDDLE);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fourth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("6").toCharArray() , i , Digit.BOT_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fifth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("6").toCharArray() , i , Digit.BOT_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
	}
	/**
	 * Test the width. Rule of Columns: Number of columns must be equals to size+2  
	 * 
	 * Test from size 2 to 10 if the number of columns is correct for the number 7.
	 */
	@Test
	public void testWidthFor7() {
		//from size 1 to 10
		//Test first line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("7").toCharArray() , i , Digit.TOP_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test second line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("7").toCharArray() , i , Digit.TOP_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test third line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("7").toCharArray() , i , Digit.MIDDLE);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fourth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("7").toCharArray() , i , Digit.BOT_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fifth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("7").toCharArray() , i , Digit.BOT_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
	}
	/**
	 * Test the width. Rule of Columns: Number of columns must be equals to size+2  
	 * 
	 * Test from size 2 to 10 if the number of columns is correct for the number 8.
	 */
	@Test
	public void testWidthFor8() {
		//from size 1 to 10
		//Test first line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("8").toCharArray() , i , Digit.TOP_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test second line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("8").toCharArray() , i , Digit.TOP_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test third line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("8").toCharArray() , i , Digit.MIDDLE);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fourth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("8").toCharArray() , i , Digit.BOT_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fifth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("8").toCharArray() , i , Digit.BOT_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
	}
	/**
	 * Test the width. Rule of Columns: Number of columns must be equals to size+2  
	 * 
	 * Test from size 2 to 10 if the number of columns is correct for the number 9.
	 */
	@Test
	public void testWidthFor9() {
		//from size 1 to 10
		//Test first line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("9").toCharArray() , i , Digit.TOP_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test second line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("9").toCharArray() , i , Digit.TOP_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test third line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("9").toCharArray() , i , Digit.MIDDLE);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fourth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("9").toCharArray() , i , Digit.BOT_VERTICAL);
			assertEquals(i+2, anw.length()-1);
		}
		//Test fifth line
		for(int i = 1; i <= 10; i++) {
			String anw = printer.createLineOfNumbers(("9").toCharArray() , i , Digit.BOT_HORIZONTAL);
			assertEquals(i+2, anw.length()-1);
		}
	}
	
	
}
