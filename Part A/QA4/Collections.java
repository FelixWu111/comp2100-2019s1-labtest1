import java.util.List;
import java.util.ArrayList;

public class Collections {

	// Modify method signature if needed & implement the body of method
	public static void copy(List output, List input) {
	}

	// Test code, do not modify
	public static void main(String[] args) {

		List<Number> output = new ArrayList<Number>();
		List<Integer> input = new ArrayList<Integer>();
		input.add(5);
		Collections.copy(output, input);
		System.out.println(output.get(0));

		List<Integer> output3 = new ArrayList<Integer>();
		List<Integer> input3 = new ArrayList<Integer>();
		input3.add(3);
		Collections.copy(output3, input3);
		System.out.println(output.get(0));

		List<String> output2 = new ArrayList<String>();
		List<Long> input2 = new ArrayList<Long>();

		// Collections.copy(output2, input2); // will raise error
	}
}
