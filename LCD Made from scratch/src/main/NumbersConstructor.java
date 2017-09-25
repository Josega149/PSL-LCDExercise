package main;

public class NumbersConstructor {
	/**
	 * Each one of these constants represents a pattern that describes the lines of the digits.
	 * Each digit, from 0 to 9, can be represented with one specific combination of five of these constants.
	 */
	private final static String LINE_FULL_OF_HORIZONTALS = "LINE_FULL_OF_HORIZONTALS";
	private final static String LINE_FULL_OF_HORIZONTALS_AND_ENDS_WITH_VERTICAL = "LINE_FULL_OF_HORIZONTALS_AND_ENDS_WITH_VERTICAL";
	private final static String LINE_FULL_OF_HORIZONTALS_AND_STARTS_WITH_VERTICAL = "LINE_FULL_OF_HORIZONTALS_AND_STARTS_WITH_VERTICAL";
	private final static String LINE_FULL_OF_HORIZONTALS_STARTS_AND_ENDS_WITH_VERTICAL = "LINE_FULL_OF_HORIZONTALS_STARTS_AND_ENDS_WITH_VERTICAL";
	private final static String LINE_FULL_OF_SPACES = "LINE_FULL_OF_SPACES";

	private final static String BOTH_ENDS_VERTICALS= "BOTH_ENDS_VERTICALS";
	private final static String ENDS_WITH_VERTICAL = "ENDS_WITH_VERTICAL";
	private final static String STARTS_WITH_VERTICAL = "STARTS_WITH_VERTICAL";

	public static Digit ZERO; 	 public static Digit ONE; 	public static Digit TWO;  public static Digit THREE;  public static Digit FOUR;
	public static Digit FIVE;   public static Digit SIX; 	public static Digit SEVEN; public static Digit EIGTH; public static Digit NINE; 

	/**
	 * This method creates each digit with the specific combination of constants to represent it with "|" and "-" .
	 */
	public NumbersConstructor(){
		ZERO = new Digit(LINE_FULL_OF_HORIZONTALS,BOTH_ENDS_VERTICALS,BOTH_ENDS_VERTICALS,BOTH_ENDS_VERTICALS,LINE_FULL_OF_HORIZONTALS);
		ONE = new Digit(LINE_FULL_OF_SPACES,ENDS_WITH_VERTICAL,ENDS_WITH_VERTICAL,ENDS_WITH_VERTICAL,LINE_FULL_OF_SPACES);
		TWO = new Digit(LINE_FULL_OF_HORIZONTALS,ENDS_WITH_VERTICAL,LINE_FULL_OF_HORIZONTALS,STARTS_WITH_VERTICAL,LINE_FULL_OF_HORIZONTALS);
		THREE = new Digit(LINE_FULL_OF_HORIZONTALS,ENDS_WITH_VERTICAL,LINE_FULL_OF_HORIZONTALS_AND_ENDS_WITH_VERTICAL,ENDS_WITH_VERTICAL,LINE_FULL_OF_HORIZONTALS);
		FOUR = new Digit(LINE_FULL_OF_SPACES,BOTH_ENDS_VERTICALS,LINE_FULL_OF_HORIZONTALS_AND_ENDS_WITH_VERTICAL,ENDS_WITH_VERTICAL,LINE_FULL_OF_SPACES);
		FIVE = new Digit(LINE_FULL_OF_HORIZONTALS,STARTS_WITH_VERTICAL,LINE_FULL_OF_HORIZONTALS,ENDS_WITH_VERTICAL,LINE_FULL_OF_HORIZONTALS);
		SIX = new Digit(LINE_FULL_OF_HORIZONTALS,STARTS_WITH_VERTICAL,LINE_FULL_OF_HORIZONTALS_AND_STARTS_WITH_VERTICAL,BOTH_ENDS_VERTICALS,LINE_FULL_OF_HORIZONTALS);
		SEVEN = new Digit(LINE_FULL_OF_HORIZONTALS,ENDS_WITH_VERTICAL,ENDS_WITH_VERTICAL,ENDS_WITH_VERTICAL,LINE_FULL_OF_SPACES);
		EIGTH = new Digit(LINE_FULL_OF_HORIZONTALS,BOTH_ENDS_VERTICALS,LINE_FULL_OF_HORIZONTALS_STARTS_AND_ENDS_WITH_VERTICAL,BOTH_ENDS_VERTICALS,LINE_FULL_OF_HORIZONTALS);
		NINE = new Digit(LINE_FULL_OF_HORIZONTALS,BOTH_ENDS_VERTICALS,LINE_FULL_OF_HORIZONTALS_AND_ENDS_WITH_VERTICAL,ENDS_WITH_VERTICAL,LINE_FULL_OF_SPACES);
	}
	
	
	/**
	 * This method receives the size and the type of line and recreates the pattern of the line with the
	 * needed size.
	 * 
	 * @param size The number of middle elements between the start column and the final column.
	 * @param type (one of the 8 constants above)
	 * 
	 */
	public String createLine(int size, String type) {
		StringBuilder st = new StringBuilder();
		size = size+2;
		switch (type) {
		case LINE_FULL_OF_HORIZONTALS:
			st.append(" ");
			for(int i=0;i< size-2;i++) {
				st.append("-");
			}
			st.append(" ");
			break;
		case LINE_FULL_OF_HORIZONTALS_AND_ENDS_WITH_VERTICAL:
			st.append(" ");
			for(int i=0;i< size-2;i++) {
				st.append("-");
			}
			st.append("|");
			break;
		case LINE_FULL_OF_HORIZONTALS_AND_STARTS_WITH_VERTICAL:
			st.append("|");
			for(int i=0;i< size-2;i++) {
				st.append("-");
			}
			st.append(" ");
			break;
		case LINE_FULL_OF_HORIZONTALS_STARTS_AND_ENDS_WITH_VERTICAL:
			st.append("|");
			for(int i=0;i< size-2;i++) {
				st.append("-");
			}
			st.append("|");
			break;
		case LINE_FULL_OF_SPACES:
			for(int i=0;i< size;i++) {
				st.append(" ");
			}
			break;
		case BOTH_ENDS_VERTICALS:
			st.append("|");
			for(int i=0;i< size-2;i++) {
				st.append(" ");
			}
			st.append("|");
			break;
		case STARTS_WITH_VERTICAL:
			st.append("|");
			for(int i=0;i< size-1;i++) {
				st.append(" ");
			}
			break;
		case ENDS_WITH_VERTICAL:
			for(int i=0;i< size-1;i++) {
				st.append(" ");
			}
			st.append("|");
			break;
		
			
		}
		return st.toString();
	}
	
	/**
	 * Returns a Digit object from a char that is always a digit (0 to 9)
	 * 
	 * @param char digit
	 * @return
	 */

	public Digit digitFromChar(char digit) {
		Digit number = null;
		switch (digit) {
		case '0':
			number = ZERO;
			break;
		case '1':
			number = ONE;
			break;
		case '2':
			number = TWO;
			break;
		case '3':
			number = THREE;
			break;
		case '4':
			number = FOUR;
			break;
		case '5':
			number = FIVE;
			break;
		case '6':
			number = SIX;
			break;
		case '7':
			number = SEVEN;
			break;
		case '8':
			number = EIGTH;
			break;
		case '9':
			number = NINE;
			break;
		}
		return number;
	}
}
