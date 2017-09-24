package main;

public class Number {
	
	public static final String TOP_HORIZONTAL = "topH";
	public static final String TOP_VERTICAL = "topV";
	public static final String MID_HORIZONTAL = "midH";
	public static final String BOT_VERTICAL = "botV";
	public static final String BOT_HORIZONTAL = "botH";
	
	private String topHorizontal;
	private String topVertical;
	private String midHorizontal;
	private String botVertical;
	private String botHorizontal;
	
	
	public Number(String topH, String topV, String midH,String botV, String botH) {
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
