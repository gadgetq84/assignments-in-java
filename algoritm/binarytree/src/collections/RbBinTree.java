package collections;

public class RbBinTree {
    Node root;

    private enum Color {
        RED, BLACK;
    }

    public class Node {
        private int value;
        private Node leftChildren;
        private Node rightChildren;
        private Color color;

    }

    public Node find(int value) {
        return find(root, value);
    }

    private Node find(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (node.value == value) {
            return node;
        }
        if (node.value < value) {
            return find(node.rightChildren, value);
        } else {
            return find(node.leftChildren, value);
        }
    }

    public boolean add(int value) {
        if (root == null) {
            root = new Node();
            root.value = value;
            root.color = Color.BLACK;
            return true;
        } else {
           boolean result =  insert(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
            return result;
        }

        // root.color = BLACK;
    }

    private boolean insert(Node node, int value) {
        if (node.value == value) {
            return false;
        } else {
            if (node.value < value) {
                if (node.rightChildren == null) {
                    node.rightChildren = new Node();
                    node.rightChildren.value = value;
                    node.rightChildren.color = Color.RED;
                    return true;

                } else {
                    boolean result = insert(node.rightChildren, value);
                    node.rightChildren = rebalance(node.rightChildren);
                    return result;
                }
            } else {
                if (node.leftChildren == null) {
                    node.leftChildren = new Node();
                    node.leftChildren.value = value;
                    node.leftChildren.color = Color.RED;
                    return true;
                } else {
                    boolean result = insert(node.leftChildren, value);
                    node.leftChildren = rebalance(node.leftChildren);
                    return result;
                }
            }
        }
    }

    private void colorSwap(Node node) {
        node.rightChildren.color = Color.BLACK;
        node.leftChildren.color = Color.BLACK;
        node.color = Color.RED;

    }

    private Node leftSwap(Node node) {
        Node leftChild = node.leftChildren;
        Node betweenChild = leftChild.rightChildren;
        leftChild.rightChildren = node;
        node.leftChildren = betweenChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;

    }

    private Node rightSwap(Node node) {
        Node rightChild = node.rightChildren;
        Node betweenChild = rightChild.leftChildren;
        rightChild.leftChildren = node;
        node.rightChildren = betweenChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;

    }

    private Node rebalance(Node node) {
        Node result = node;
        boolean needRebal;
        do {
            needRebal = false;
            if (result.rightChildren != null && result.rightChildren.color == Color.RED
                    && (result.leftChildren == null || result.leftChildren.color == Color.BLACK)) {
                needRebal = true;
                result = rightSwap(result);
            }
            if (result.leftChildren != null && result.leftChildren.color == Color.RED && result.leftChildren.leftChildren != null
                    && result.leftChildren.leftChildren.color == Color.RED) {
                needRebal = true;
                result = leftSwap(result);
            }

            if (result.leftChildren != null && result.leftChildren.color == Color.RED && result.rightChildren != null
                    && result.rightChildren.color == Color.RED) {
                needRebal = true;
                colorSwap(result);
            }

        } while (needRebal);

        return result;
    }
}