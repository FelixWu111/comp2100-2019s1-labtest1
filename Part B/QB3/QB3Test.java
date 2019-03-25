public class QB3Test {
	public static void main(String[] args) {
		BST<Integer> tree1 = new BST<Integer>();
		BST<Integer> tree2 = new BST<Integer>();
		BST<Integer> tree3 = new BST<Integer>();

		for (int i = 1; i < 10; i++)
			tree1.insert(i);

		Integer[] tree2vals = {5, 2, 1, 7, 6, 8, 10};
		for(Integer i :tree2vals) 
			tree2.insert(i);

		Integer[] tree3vals = {30, 23, 1, 42, 6, 51, 37};
		for(Integer i :tree3vals) 
			tree3.insert(i);

		System.out.println("Test 1: " + (((tree1.leastCommonAncestor(2 , 3) != null) && (tree1.leastCommonAncestor(2 , 3) == 1)) ? "PASS" : "FAIL"));
		System.out.println("Test 2: " + (((tree1.leastCommonAncestor(8 , 9) != null) && (tree1.leastCommonAncestor(8 , 9) == 7)) ? "PASS" : "FAIL"));
		System.out.println("Test 3: " + (((tree2.leastCommonAncestor(1 , 6) != null) && (tree2.leastCommonAncestor(1 , 6) == 5)) ? "PASS" : "FAIL"));
		System.out.println("Test 4: " + (((tree2.leastCommonAncestor(10 , 6) != null) && (tree2.leastCommonAncestor(10 , 6) == 7)) ? "PASS" : "FAIL"));
		System.out.println("Test 5: " + (((tree3.leastCommonAncestor(1 , 37) != null) && (tree3.leastCommonAncestor(1 , 37) == 23)) ? "PASS" : "FAIL"));
		System.out.println("Test 6: " + (((tree3.leastCommonAncestor(6 , 51) != null) && (tree3.leastCommonAncestor(6 , 51) == 30)) ? "PASS" : "FAIL"));

	}
}