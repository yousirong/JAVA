package domain;

public class NameCard {

	private String coffee;
	private String coffeename;
	private String rosting;
	private String number;
	public NameCard(String coffee, String coffeename, String rosting, String number) {
		super();
		this.coffee = coffee;
		this.coffeename = coffeename;
		this.rosting = rosting;
		this.number = number;
	}
	public String getCoffee() {
		return coffee;
	}
	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}
	public String getCoffeename() {
		return coffeename;
	}
	public void setCoffeename(String coffeename) {
		this.coffeename = coffeename;
	}
	public String getRosting() {
		return rosting;
	}
	public void setRosting(String rosting) {
		this.rosting = rosting;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "NameCard [coffee=" + coffee + ", coffeename=" + coffeename + ", rosting=" + rosting + ", number="
				+ number + "]";
	}
	
	public String toCSV() {
		StringBuilder sb = new StringBuilder() ;
		sb.append(coffee+ ",");
		sb.append(coffeename+",");
		sb.append(rosting+",");
		sb.append(number);
		return sb.toString();
	}
	
	public String wrapString(Object str) {
		return "\""+str+"\"";
	}
}
