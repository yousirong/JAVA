package step08_interface;

public interface ISomething {
	public static final int A = 11;
	int my_int =22;   //자동으로 public static final이 됩니다.
	void run();            // public static void run(); 과 동일합니다.
}
