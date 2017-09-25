package main;

public class Digit {
	//The first line of the number
	public static final String TOP_HORIZONTAL = "TOP_HORIZONTAL";
	//The lines between TOP_HORIZONTAL and MIDDLE. The number of these lines is equal to "size"
	public static final String TOP_VERTICAL = "TOP_VERTICAL";
	//The middle line of the number
	public static final String MIDDLE = "MIDDLE";
	//The lines between MIDDLE and BOT_HORIZONTAL. the number of these lines is equal to "size"
	public static final String BOT_VERTICAL = "BOT_VERTICAL";
	//The last line of the number
	public static final String BOT_HORIZONTAL = "BOT_HORIZONTAL";
	
	private String topHorizontal;
	private String topVertical;
	private String midHorizontal;
	private String botVertical;
	private String botHorizontal;
	
	
	public Digit(String topH, String topV, String midH,String botV, String botH) {
		topHorizontal = topH;
		topVertical = topV;
		midHorizontal = midH;
		botVertical = botV;
		botHorizontal = botH;
	}
	
	public String topHorizontal() {
		return topHorizontal;
	}
	public String topVertical() {
		return topVertical;
	}
	public String midHorizontal() {
		return midHorizontal;
	}
	public String botVertical() {
		return botVertical;
	}
	public String botHorizontal() {
		return botHorizontal;
	}
	
	
}
