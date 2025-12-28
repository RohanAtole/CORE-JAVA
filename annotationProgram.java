package variablesdatatypes;

class Z{
	public void showTheDataWhichBelongsToThisClass() {
		System.out.println("In Class Z method");
	}
}
class V extends Z{
	@Override
	public void showTheDataWhichBelongsToThisClass() {
		System.out.println("In Class V method");
	}
}

public class annotationProgram{
	public static void main(String args[]) {
		V obj = new V(); 
		obj.showTheDataWhichBelongsToThisClass();
	}
}
