public class QB4Test {
    public static void main(String[] args) {
        RBTree<Integer> tree = new RBTree<Integer>();
        for(int i=0; i<20; ++i) {
            tree.insert(i);
        }

        // Test properties separately
        tree.search(7).setColour(true);
        System.out.println("Test 1: " + (!tree.testProp1() ? "PASSED" : "FAILED"));
        tree.search(7).setColour(false);

        tree.search(9).setColour(true);
        System.out.println("Test 2: " + (!tree.testProp2() ? "PASSED" : "FAILED"));
        tree.search(9).setColour(false);

        tree.search(3).setColour(false);
        System.out.println("Test 3: " + (!tree.testProp3() ? "PASSED" : "FAILED"));
        tree.search(3).setColour(true);

        // Test properties together
        tree.search(11).setColour(false);
        System.out.println("Test 4: " + ((tree.testProp1() && tree.testProp2() && !tree.testProp3()) ? "PASSED" : "FAILED"));
        tree.search(11).setColour(true);

        tree.search(19).l.setColour(true);
        System.out.println("Test 5: " + ((!tree.testProp1() && !tree.testProp2()) ? "PASSED" : "FAILED"));
        tree.search(19).l.setColour(false);

        tree.search(7).setColour(true);
        System.out.println("Test 6: " + ((!tree.testProp1() && !tree.testProp2() && tree.testProp3()) ? "PASSED" : "FAILED"));
        tree.search(7).setColour(false);
    }
}
