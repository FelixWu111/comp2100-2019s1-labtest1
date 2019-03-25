public class QB2Test {
	public static void main(String[] args) {
		BST<Integer> tree1 = new BST<Integer>();
		BST<Integer> tree2 = new BST<Integer>();
		BST<Integer> tree3 = new BST<Integer>();
		BST<Integer> tree4 = new BST<Integer>();


		for (int i = 1; i < 10; i++)
			tree1.insert(i);

		Integer[] tree2vals = {5, 2, 1, 7, 6, 8, 10};
		for(Integer i :tree2vals) 
			tree2.insert(i);

		Integer[] tree3vals = {30, 23, 1, 42, 6, 51, 37};
		for(Integer i :tree3vals) 
			tree3.insert(i);

		tree4.insert(7);

		System.out.println("Test 1: " + (tree1.evenNodePost().trim().equals("9 7 5 3 1") ? "PASS" : "FAIL"));
		System.out.println("Test 2: " + (tree2.evenNodePost().trim().equals("1 6 8 5") ? "PASS" : "FAIL"));
		System.out.println("Test 3: " + (tree3.evenNodePost().trim().equals("1 37 51 30") ? "PASS" : "FAIL"));
		System.out.println("Test 4: " + (tree4.evenNodePost().trim().equals("7") ? "PASS" : "FAIL"));

	}
}