public class SortStrings {
	public static void main(String[] args) {

		System.out.println("Before sort:");
		for (String s : args) {
			System.out.println("    " + s);
		}

		for (int i = 0; i < args.length; i++) {
			for (int j = i + 1; j < args.length; j++) {
				if (args[i].compareToIgnoreCase(args[j]) > 0) {
					// Swap args[i] & args[j]
					String temp = args[i];
					args[i] = args[j];
					args[j] = temp;
				}
			}
		}

		System.out.println("After sort:");
		for (String s : args) {
			System.out.println("    " + s);
		}
	}
}
