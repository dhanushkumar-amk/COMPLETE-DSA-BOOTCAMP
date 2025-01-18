package TREES;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {
    }
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }


    // root node
    private Node root;

    // insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root node value : ");
        int value = scanner.nextInt();
        root = new Node(value);

        // small helper function it will helps us to fill the entire tree
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();

        // if your gives yes to enter the value in left
        if (left){
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            // then recall it again
            populate(scanner, node.left);
        }

        // if user give yes to enter the right of the current node
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();

        // if your gives yes to enter the value in left
        if (right){
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            // then recall it again
            populate(scanner, node.right);
        }
    }


    // display function
    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {

        // base case
        if (node == null)
            return;

        // first display the current element
        System.out.println(indent + node.value);

        // go to the left and display
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
    }

}
