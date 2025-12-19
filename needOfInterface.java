package variablesdatatypes;

interface Computer{
	void code();
}

class Laptopp implements Computer{ //Computer interface implements on Laptopp interface
	public void code() {
		System.out.println("code, compile, run");
	}
}

class Desktop implements Computer{ //Computer interface implements on Desktop interface
	public void code() {
		System.out.println("code, compile, run : Faster");
	}
}

class Developer{
	public void devApp(Computer lap){  //here we create the object.
		lap.code();
	}
}

public class needOfInterface{
	public static void main(String args[])
	{
		Computer lap = new Laptopp();   //Interface reference
		Computer desk = new Desktop();
		
		Developer rohan = new Developer();
		rohan.devApp(lap);
		rohan.devApp(desk);
	}
}
