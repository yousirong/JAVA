package step10_Tosstest;

public class TossTest extends Toss{

	public static void main(String[] args) {
		Toss toss = new Toss();
		toss.add(new Account("신한", 10000));
		toss.add(new Account("신한", 10000));
		toss.printAll();
		toss.run();
	}

}
