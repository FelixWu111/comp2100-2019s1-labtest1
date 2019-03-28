import java.util.ArrayList;
import java.util.List;

public class QA4Test {

	// Test code, do not modify
	public static void main(String[] args) {

		List<Number> output = new ArrayList<Number>();
		List<Integer> input = new ArrayList<Integer>();
		input.add(5);
		input.add(3);
		Collections.copy(output, input);
		System.out.println(output.get(0));

		List<Integer> output3 = new ArrayList<Integer>();
		List<Integer> input3 = new ArrayList<Integer>();
		input3.add(3);
		input3.add(1);
		input3.add(2);
		Collections.copy(output3, input3);
		System.out.println(output3.get(0));

		List<String> output2 = new ArrayList<String>();
		List<Long> input2 = new ArrayList<Long>();

		// Collections.copy(output2, input2); // will raise error
	}
	
}
