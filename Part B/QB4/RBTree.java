public class RBTree<T extends Comparable<T>> {
    public Node<T> root; // The root node of the tree

    // Check property 1
    public boolean testProp1() {
	   // TODO: Implement this

    	return true;
    }

    // Check property 2
    public boolean testProp2() {
    	// TODO: Implement this

        return true;
    }

    // Check property 3
    public boolean testProp3() {
        // TODO: Implement this

        return true;
    }

    public class Node<T extends Comparable<T>> {
        Colour colour;       // Node colour
        T value;             // Node value
        Node<T> parent;      // Parent node
        Node<T> l, r;        // Children nodes

        // Value node
        public Node(T value) {
            this.value = value;
            this.colour = Colour.RED;
            this.parent = null;

            // Initialise children leaf nodes
            this.l = new Node<>();
            this.r = new Node<>();
            this.l.parent = this;
            this.r.parent = this;
        }

        // Leaf node
        public Node() {
            this.value = null;
            this.colour = Colour.BLACK;
        }

        // Insert node into tree, ignoring colour
        public void insert(Node<T> n) {
            // Note: To make implementing the RBTree easier, instead of having null
            // children, nodes with a null value are used instead so take this into
            // account if you are trying to copy over your part 1 solution

            if (value.compareTo(n.value) > 0) {
                if (l.value == null) {
                    l = n;
                    n.parent = this;
                } else {
                    l.insert(n);
                }
            } else if (value.compareTo(n.value) < 0) {
                if (r.value == null) {
                    r = n;
                    n.parent = this;
                } else {
                    r.insert(n);
                }
            }

        }

        // Rotate the node so it becomes the child of its right branch
        /*
            e.g.
                  [x]                    b
                 /   \                 /   \     
               a       b     == >   [x]     f    
              / \     / \           /  \      
             c  d    e   f         a    e
                                  / \
                                 c   d
        */
        public void rotateLeft() {
            // Make parent (if it exists) and right branch point to each other
            if (parent != null) {
                // Determine whether this node is the left or right child of its parent
                if (parent.l.value == value) {
                    parent.l = r;
                } else {
                    parent.r = r;
                }
            }
            r.parent = parent;

            parent = r;
            // Take right node's left branch
            r = parent.l;
            r.parent = this;
            // Take the place of the right node's left branch
            parent.l = this;
        }

        // Rotate the node so it becomes the child of its left branch
        /*
            e.g.
                  [x]                    a
                 /   \                 /   \     
               a       b     == >     c     [x]   
              / \     / \                   /  \      
             c  d    e   f                 d    b
                                               / \
                                              e   f
        */
        public void rotateRight() {
            // Make parent (if it exists) and left branch point to each other
            if (parent != null) {
                // Determine whether this node is the left or right child of its parent
                if (parent.l.value == value) {
                    parent.l = l;
                } else {
                    parent.r = l;
                }
            }
            l.parent = parent;

            parent = l;
            // Take left node's right branch
            l = parent.r;
            l.parent = this;
            // Take the place of the left node's right branch
            parent.r = this;
        }

        public void setColour(boolean red) {
            colour = red ? Colour.RED : Colour.BLACK;
        }

    }

    // Initialise empty RBTree
    public RBTree() {
        root = null;
    }


    // Insert node into RBTree
    private void insert(Node<T> x) {
        // TODO: Complete this function (3/3)
        // You need only finish cases 1, 2 and 3; the rest has been done for you
 
        // Insert node into tree
        if (root == null) {
            root = x;
        } else {
            root.insert(x);
        }

        // Fix tree
        while (x.value != root.value && x.parent.colour == Colour.RED) {
            boolean left = x.parent == x.parent.parent.l; // Is parent a left node
            Node<T> y = left ? x.parent.parent.r : x.parent.parent.l; // Get opposite "uncle" node to parent

            if (y.colour == Colour.RED) {
                // Case 1: Recolour
                x.parent.colour = Colour.BLACK;
                y.colour = Colour.BLACK;
                x.parent.parent.colour = Colour.RED;

                // Check if violated further up the tree
                x = x.parent.parent;

            } else {
                if (x.value == (left ? x.parent.r.value : x.parent.l.value)) {
                    // Case 2 : Left (uncle is left node) / Right (uncle is right node) Rotation
                    x = x.parent;
                    if (left) {
                        // Perform left rotation
                        if (x.value == root.value) root = x.r; // Update root
                        x.rotateLeft();
                    } else {
                        // Perform right rotation
                        if (x.value == root.value) root = x.l; // Update root
                        x.rotateRight();
                    }

                }
                // Adjust colours to ensure correctness after rotation
                x.parent.colour = Colour.BLACK;
                x.parent.parent.colour = Colour.RED;
                // Case 3 : Right (uncle is left node) / Left (uncle is right node) Rotation
                // TODO: Complete this
                    if (left) {
                        // Perform right rotation
                        if (x.parent.parent.value == root.value) root = x.parent.parent.l;
                        x.parent.parent.rotateRight();
                    } else
                    {
                        // Perform left rotation
                        if (x.parent.parent.value == root.value) root = x.parent.parent.r;
                        x.parent.parent.rotateLeft();
                    }
            }
        }

        // Ensure property 2 (root and leaves are black) holds
        root.colour = Colour.BLACK;
    }


    // Demo functions
    // (Safely) insert a value into the tree
    public void insert(T value) {
        Node<T> node = new Node<T>(value);
        if (node != null)
            insert(node);
    }

    // Return the result of a pre-order transversal of the tree
    private void preOrder(Node<T> tree) {
        if(tree != null && tree.value != null) {
            System.out.print(tree.value +" ");
            preOrder(tree.l);
            preOrder(tree.r);
        }
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    // Return the corresponding node of a value, if it exists in the tree
    private Node<T> find(Node<T> x, T v) {
        if (x.value == null)
            return null;

        int cmp = v.compareTo(x.value);
        if (cmp < 0)
            return find(x.l, v);
        else if (cmp > 0)
            return find(x.r, v);
        else
            return x;
    }

    public Node<T> search(T key) {
        return find(root, key);
    }

    public enum Colour {
        RED,
        BLACK;
    }

}