public class BST <T extends Comparable<T>> {
	Node<T> root;

	public String evenNodePost() {
		// TODO: Implement this
		return "";
	}
	
	public class Node<T extends Comparable<T>> {
		T value;
		Node<T> parent;
		Node<T> left;
		Node<T> right;

		public Node(T value) {
			this.value = value;
			this.parent = null;
			this.left = null;
			this.right = null;
		}

		public Node<T> insert(T x) {
			if (x.compareTo(this.value) < 0) {
				if (this.left != null) return this.left.insert(x);

				this.left = new Node<T>(x);
				this.left.parent = this;  
				return this.left;
			} else if (x.compareTo(this.value) > 0) {
				if (this.right != null) return this.right.insert(x);

				this.right = new Node<T>(x);
				this.right.parent = this;
				return this.right;  
			}

			return this;
		}
	}

	public BST() {
		root = null;
	}

	public Node<T> insert(T value) {
		if (root == null) {
			root = new Node<T>(value);
			return root;
		}

		return root.insert(value);
	}
}