public class BST {
	Node root;

	public Integer oddNodeSum() {
		// TODO: Implement this
		return -1;
	}
	
	public class Node {
		Integer value;
		Node parent;
		Node left;
		Node right;

		public Node(Integer value) {
			this.value = value;
			this.parent = null;
			this.left = null;
			this.right = null;
		}

		public Node insert(Integer x) {
			if (x.compareTo(this.value) < 0) {
				if (this.left != null) return this.left.insert(x);

				this.left = new Node(x);
				this.left.parent = this;  
				return this.left;
			} else if (x.compareTo(this.value) > 0) {
				if (this.right != null) return this.right.insert(x);

				this.right = new Node(x);
				this.right.parent = this;
				return this.right;  
			}

			return this;
		}

	}

	public BST() {
		root = null;
	}

	public Node insert(int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}

		return root.insert(value);
	}
}