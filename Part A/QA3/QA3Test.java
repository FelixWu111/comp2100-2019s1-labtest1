import java.util.ArrayList;
import java.util.List;

public class QA3Test {
    // Test code
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(2);
		intList.add(5);
		intList.add(1);
		intList.add(8);
		intList.add(3);
		int rval = Max.max(intList, 0, 2);
		System.out.println((rval==5));
		rval = Max.max(intList, 0, intList.size());
		System.out.println((rval==8));
		
		List<Double> doubleList = new ArrayList<Double>();
		doubleList.add(2.2);
		doubleList.add(5.1);
		doubleList.add(1.5);
		doubleList.add(8.23);
		doubleList.add(3.32);
		double frval = Max.max(intList, 0, 2);
		System.out.println((frval==5.1));
		frval = Max.max(intList, 0, intList.size());
		System.out.println((frval==8.23));
	}
}

