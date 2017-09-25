package main;

import util.LCDInputReader;

public class PrinterLCD {
	
	private LCDInputReader input;
	private NumbersConstructor numbersConstructor;
	
	public PrinterLCD(boolean testMode) {
		numbersConstructor = new NumbersConstructor();
		input = new LCDInputReader(); 
		
		try {
			if(!testMode){
				printer();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
	
	public void printer() throws Exception{
		Integer [] numberToPrint = input.readNextNumberFromConsole();
		while(numberToPrint[0] != 0 && numberToPrint[1] !=0){
			char [] digits = (numberToPrint[1]+"").toCharArray();
			int size = numberToPrint[0];
			//Top line (first one) is always composed by - horizontal lines
			String topHorizontal = createLineOfNumbers(digits, size, Digit.TOP_HORIZONTAL);
			System.out.println(topHorizontal);
			
			//The second line is always composed by | vertical lines. 
			//The following "size" lines are the same: TOP_VERTICAL.
			String topVertical = createLineOfNumbers(digits, size, Digit.TOP_VERTICAL);
			for(int i=0; i< size;i++) {
				System.out.println(topVertical);
			}
			
			//The middle line is always composed by - horizontal lines
			String midHorizontal = createLineOfNumbers(digits,size, Digit.MIDDLE);
			System.out.println(midHorizontal);
			
			//The next to last line is always composed by | vertical lines. 
			//The following "size" lines are the same: BOT_VERTICAL.
			String botVertical = createLineOfNumbers(digits, size, Digit.BOT_VERTICAL);
			for(int i=0; i< size;i++) {
				System.out.println(botVertical);
			}
			//Bottom line is always composed by - horizontal lines
			String botHorizontal = createLineOfNumbers(digits, size, Digit.BOT_HORIZONTAL);
			System.out.println(botHorizontal);
			
			//Between each print a jump line must exist
			System.out.println("\n");
			numberToPrint = input.readNextNumberFromConsole();
		}
	}
	
	/**
	 * This method creates a complete line ready to be printed. 
	 * It concatenate all the separate digit lines into one.
	 * 
	 * @param digits. The sequence of numbers to be printed.
	 * @param size.   The size given by the user.
	 * @param positionOfLine  
	 * If the line is Top Horizontal (the first line), Top Vertical(lines between Top Horizontal and Middle), 
	 * the Middle line, Bot Vertical(lines between Middle and Bot Horizontal) and Bot Horizontal (the last line).
	 * 
	 * @return String. A line ready to be printed in console
	 */
	public String createLineOfNumbers(char [] digits, int size, String positionOfLine) {
		StringBuilder st = new StringBuilder();
		
		switch (positionOfLine) {
		case Digit.TOP_HORIZONTAL:
			for(int i=0;i< digits.length;i++) {
				Digit current = numbersConstructor.digitFromChar(digits[i]);
				st.append(numbersConstructor.createLine(size, current.topHorizontal()) );
				st.append(" ");
			}
			break;
		case Digit.TOP_VERTICAL:
			for(int i=0;i< digits.length;i++) {
				Digit current = numbersConstructor.digitFromChar(digits[i]);
				st.append(numbersConstructor.createLine(size, current.topVertical()) );
				st.append(" ");
			}
			break;
		case Digit.MIDDLE:
			for(int i=0;i< digits.length;i++) {
				Digit current = numbersConstructor.digitFromChar(digits[i]);
				st.append(numbersConstructor.createLine(size, current.midHorizontal()) );
				st.append(" ");
			}
			break;
		case Digit.BOT_VERTICAL:
			for(int i=0;i< digits.length;i++) {
				Digit current = numbersConstructor.digitFromChar(digits[i]);
				st.append(numbersConstructor.createLine(size, current.botVertical()) );
				st.append(" ");
			}
			break;
		case Digit.BOT_HORIZONTAL:
			for(int i=0;i< digits.length;i++) {
				Digit current = numbersConstructor.digitFromChar(digits[i]);
				st.append(numbersConstructor.createLine(size, current.botHorizontal()) );
				st.append(" ");
			}
			break;
		}
		return st.toString();
	}
	
	public static void main(String[] args) {
		
		PrinterLCD printerLcd = new PrinterLCD(false);
		
	}

}
