package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class is in charge of retrieve the input values.
 * @author Jose Gabriel Tamura Lara
 *
 */
public class LCDInputReader {
	private BufferedReader in;
	
	public LCDInputReader(){
		 in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	/**
	 * This method reads the next line in the console, split the size and the number to be printed and return the values.
	 * @return Integer [] numberToPrint
	 * numberToPrint[0] -> size
	 * numberToPrint[1] -> number
	 * 
	 */
	public Integer [] readNextNumberFromConsole() throws Exception{
		Integer [] numberToPrint = new Integer[2];
		try {
			String [] inputNewNumber = in.readLine().split(",");
			int size = Integer.parseInt(inputNewNumber[0]);
			int number =  Integer.parseInt(inputNewNumber[1]);
			
			if(size<0 || size > 10 || (size <1 && number !=0)){
				throw new Exception("The given input is incorrect. Size has to be a value between 1 and 10.");
			}
			
			
			
			numberToPrint[0] = size;
			numberToPrint[1] = number;
			
		} catch (IOException e) {
			e.printStackTrace();
			
			throw new Exception("The given input is incorrect. Please insert size,numberToPrint");
		}
		return numberToPrint;
	}

}
