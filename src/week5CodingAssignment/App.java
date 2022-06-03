package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger aLogger = new AsteriskLogger();
		Logger sLogger = new SpacedLogger();

		aLogger.Log("Hi, This is a longer string.");
		aLogger.Error("Hello, this is a longer string.");

		sLogger.Log("Hello, my name is James.");
		sLogger.Error("Hello, my name is James.");
	}

}
           