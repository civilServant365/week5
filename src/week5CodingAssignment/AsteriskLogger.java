package week5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 7; i++) {
			if (i == 4) {
				System.out.print(log);
			} else
				System.out.print("*");
		}

		System.out.print("\r\n");
	}

	@Override
	public void Error(String error) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 13 + error.length(); i++) {
			System.out.print("*");
		}
		System.out.print("\r\n");
		for (int i = 1; i <= 7; i++) {
			if (i == 4) {
				System.out.print("Error: " + error);
			} else {
				System.out.print("*");
			}
		}
		System.out.print("\r\n");
		for (int i = 1; i <= 13 + error.length(); i++) {
			System.out.print("*");
		}
		System.out.print("\r\n");
	}
}
