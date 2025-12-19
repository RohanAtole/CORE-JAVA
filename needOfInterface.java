package variablesdatatypes;

class Laptopp{
	public void code() {
		System.out.println("code, compile, run");
	}
}

class Developer{
	public void devApp(Laptopp lap){
		lap.code();
	}
}

public class needOfInterface{
	public static void main(String args[])
	{
		Laptopp lap = new Laptopp();
		
		Developer rohan = new Developer();
		rohan.devApp(lap);
	}
}
