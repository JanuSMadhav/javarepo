package Exception;

public class FinalKeywordDemo { 
	final int speed_limit = 90;
	void run() 
	{
		//speed_limit = 400;//error message will be displayed as the value of final cannot be changed
	}
	public static void main(String[] args) {
		FinalKeywordDemo fk =new FinalKeywordDemo();
		fk.run();
	}
}

