package tree;

public class TreeImplementation {
    // Function to add a child to a node
    static void addChild(Node parent, Node child) {
        parent.children.add(child);
    }

    // Function to print parents of each node
    static void printParents(Node node, Node parent) {
        if (parent == null)
            System.out.println(node.data + " -> NULL");
        else
            System.out.println(node.data + " -> " + parent.data);

        for (Node child : node.children)
            printParents(child, node);
    }

    // Function to print children of each node
    static void printChildren(Node node) {
        System.out.print(node.data + " -> ");
        for (Node child : node.children)
            System.out.print(child.data + " ");
        System.out.println();

        for (Node child : node.children)
            printChildren(child);
    }

    // Function to print leaf nodes
    static void printLeafNodes(Node node) {
        if (node.children.isEmpty()) {
            System.out.print(node.data + " ");
            return;
        }
        for (Node child : node.children)
            printLeafNodes(child);
    }

    // Function to print degrees of each node
    static void printDegrees(Node node, Node parent) {
        int degree = node.children.size();
        if (parent != null)
            degree++;
        System.out.println(node.data + " -> " + degree);

        for (Node child : node.children)
            printDegrees(child, node);
    }


}
