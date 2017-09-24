package main;

import util.InputReader;

public class ImpresorLCD {
	
	private InputReader input;
	private NumbersConstructor numbersConstructor;
	
	public ImpresorLCD() throws Exception{
		numbersConstructor = new NumbersConstructor();
		input = new InputReader(); 
		
		printer();
	}
	
	public void printer() throws Exception{
		//The input reader is another class just because TODO.
		Integer [] numberToPrint = input.readNextNumberFromConsole();
		while(numberToPrint[0] != 0 && numberToPrint[1] !=0){
			//solo se alargan el 2 y el 5 dependiendo del size
			char [] digits = (numberToPrint[1]+"").toCharArray();
			int size = numberToPrint[0];
			//Top line (first one) is always composed by - horizontal lines
			String topHorizontal = createLineOfNumbers(digits, size, Number.TOP_HORIZONTAL);
			System.out.println(topHorizontal);
			
			//The second line is always composed by | vertical lines. Depending on size, the following lines can be vertical as well.
			String topVertical = createLineOfNumbers(digits, size, Number.TOP_VERTICAL);
			for(int i=0; i< size;i++) {
				System.out.println(topVertical);
			}
			
			//The middle line is always composed by - horizontal lines
			String midHorizontal = createLineOfNumbers(digits,size, Number.MID_HORIZONTAL);
			System.out.println(midHorizontal);
			
			//The next to last line is always composed by | vertical lines. Depending on size, the previous lines can be vertical as well.
			String botVertical = createLineOfNumbers(digits, size, Number.BOT_VERTICAL);
			for(int i=0; i< size;i++) {
				System.out.println(botVertical);
			}
			//Bottom line is always composed by - horizontal lines
			String botHorizontal = createLineOfNumbers(digits, size, Number.BOT_HORIZONTAL);
			System.out.println(botHorizontal);
			numberToPrint = input.readNextNumberFromConsole();
		}
	}
	
	public String createLineOfNumbers(char [] digits, int size, String posOfLine) {
		StringBuilder st = new StringBuilder();
		
		switch (posOfLine) {
		case Number.TOP_HORIZONTAL:
			for(int i=0;i< digits.length;i++) {
				Number current = numbersConstructor.NumberFromChar(digits[i]);
				st.append(numbersConstructor.createLine(size, current.topHorizontal()) );
				st.append(" ");
			}
			break;
		case Number.TOP_VERTICAL:
			for(int i=0;i< digits.length;i++) {
				Number current = numbersConstructor.NumberFromChar(digits[i]);
				st.append(numbersConstructor.createLine(size, current.topVertical()) );
				st.append(" ");
			}
			break;
		case Number.MID_HORIZONTAL:
			for(int i=0;i< digits.length;i++) {
				Number current = numbersConstructor.NumberFromChar(digits[i]);
				st.append(numbersConstructor.createLine(size, current.midHorizontal()) );
				st.append(" ");
			}
			break;
		case Number.BOT_VERTICAL:
			for(int i=0;i< digits.length;i++) {
				Number current = numbersConstructor.NumberFromChar(digits[i]);
				st.append(numbersConstructor.createLine(size, current.botVertical()) );
				st.append(" ");
			}
			break;
		case Number.BOT_HORIZONTAL:
			for(int i=0;i< digits.length;i++) {
				Number current = numbersConstructor.NumberFromChar(digits[i]);
				st.append(numbersConstructor.createLine(size, current.botHorizontal()) );
				st.append(" ");
			}
			break;
		}
		return st.toString();
	}
	
	public static void main(String[] args) {
		try {
			ImpresorLCD impresorLcd = new ImpresorLCD();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
