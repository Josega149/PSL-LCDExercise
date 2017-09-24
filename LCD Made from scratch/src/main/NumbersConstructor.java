package main;

public class NumbersConstructor {

	private final static String LINE_FULL_OF_HORIZONTALS = "full";
	private final static String LINE_FULL_OF_HORIZONTALS_VERTICAL_END = "full,vEnd";
	private final static String LINE_FULL_OF_HORIZONTALS_VERTICAL_START = "full,vStart";
	private final static String LINE_FULL_OF_HORIZONTALS_VERTICAL_START_END = "full,vStart,vEnd";
	private final static String LINE_FULL_OF_SPACES = "spaces";

	private final static String BOTH_VERTICALS= "both";
	private final static String JUST_RIGTH_VERTICAL = "rigth";
	private final static String JUST_LEFT_VERTICAL = "left";
	private final static String IN_THE_MIDDLE_VERTICAL = "middleV";

	public static Number ZERO; 	 public static Number ONE; 	public static Number TWO;  public static Number THREE;  public static Number FOUR;
	public static Number FIVE;   public static Number SIX; 	public static Number SEVEN; public static Number EIGTH; public static Number NINE; 


	public NumbersConstructor(){
		ZERO = new Number(LINE_FULL_OF_HORIZONTALS,BOTH_VERTICALS,BOTH_VERTICALS,BOTH_VERTICALS,LINE_FULL_OF_HORIZONTALS);
		ONE = new Number(LINE_FULL_OF_SPACES,IN_THE_MIDDLE_VERTICAL,IN_THE_MIDDLE_VERTICAL,IN_THE_MIDDLE_VERTICAL,LINE_FULL_OF_SPACES);
		TWO = new Number(LINE_FULL_OF_HORIZONTALS,JUST_RIGTH_VERTICAL,LINE_FULL_OF_HORIZONTALS,JUST_LEFT_VERTICAL,LINE_FULL_OF_HORIZONTALS);
		THREE = new Number(LINE_FULL_OF_HORIZONTALS,JUST_RIGTH_VERTICAL,LINE_FULL_OF_HORIZONTALS_VERTICAL_END,JUST_RIGTH_VERTICAL,LINE_FULL_OF_HORIZONTALS);
		FOUR = new Number(LINE_FULL_OF_SPACES,BOTH_VERTICALS,LINE_FULL_OF_HORIZONTALS_VERTICAL_END,JUST_RIGTH_VERTICAL,LINE_FULL_OF_SPACES);
		FIVE = new Number(LINE_FULL_OF_HORIZONTALS,JUST_LEFT_VERTICAL,LINE_FULL_OF_HORIZONTALS,JUST_RIGTH_VERTICAL,LINE_FULL_OF_HORIZONTALS);
		SIX = new Number(LINE_FULL_OF_HORIZONTALS,JUST_LEFT_VERTICAL,LINE_FULL_OF_HORIZONTALS_VERTICAL_START,BOTH_VERTICALS,LINE_FULL_OF_HORIZONTALS);
		SEVEN = new Number(LINE_FULL_OF_HORIZONTALS,JUST_RIGTH_VERTICAL,JUST_RIGTH_VERTICAL,JUST_RIGTH_VERTICAL,LINE_FULL_OF_SPACES);
		EIGTH = new Number(LINE_FULL_OF_HORIZONTALS,BOTH_VERTICALS,LINE_FULL_OF_HORIZONTALS_VERTICAL_START_END,BOTH_VERTICALS,LINE_FULL_OF_HORIZONTALS);
		NINE = new Number(LINE_FULL_OF_HORIZONTALS,BOTH_VERTICALS,LINE_FULL_OF_HORIZONTALS_VERTICAL_END,JUST_RIGTH_VERTICAL,LINE_FULL_OF_SPACES);
	}

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
		case IN_THE_MIDDLE_VERTICAL:
			for(int i=0;i< size-1;i++) {
				st.append(" ");
			}
			st.append("|");
			break;
		case LINE_FULL_OF_HORIZONTALS_VERTICAL_END:
			st.append(" ");
			for(int i=0;i< size-2;i++) {
				st.append("-");
			}
			st.append("|");
			break;
		case LINE_FULL_OF_HORIZONTALS_VERTICAL_START:
			st.append("|");
			for(int i=0;i< size-2;i++) {
				st.append("-");
			}
			st.append(" ");
			break;
		case LINE_FULL_OF_HORIZONTALS_VERTICAL_START_END:
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
		case BOTH_VERTICALS:
			st.append("|");
			for(int i=0;i< size-2;i++) {
				st.append(" ");
			}
			st.append("|");
			break;
		case JUST_LEFT_VERTICAL:
			st.append("|");
			for(int i=0;i< size-1;i++) {
				st.append(" ");
			}
			break;
		case JUST_RIGTH_VERTICAL:
			for(int i=0;i< size-1;i++) {
				st.append(" ");
			}
			st.append("|");
			break;
		
			
		}
		return st.toString();
	}

	public Number NumberFromChar(char c) {
		Number number = null;
		switch (c) {
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
