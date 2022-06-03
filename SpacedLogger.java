package week5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= log.length() - 1; i++) {
			if (i == log.length() - 1) {
				System.out.print(log.charAt(i) + "\r\n");
			} else {
				System.out.print(log.charAt(i) + " ");
			}

		}

	}

	@Override
	public void Error(String error) {
		// TODO Auto-generated method stub
		System.out.print("ERROR: ");
		for (int i = 0; i <= error.length() - 1; i++) {
			if (i == error.length() - 1) {
				System.out.print(error.charAt(i));
			} else {
				System.out.print(error.charAt(i) + " ");
			}

		}

	}
}
